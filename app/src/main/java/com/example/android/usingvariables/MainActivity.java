package com.example.android.usingvariables;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);  //Tells Android to restore specific previous values
        setContentView(R.layout.activity_main);  //Puts buttons, text fields, images, etc. on the activity screen
        int weekday = 5;
        int weekend = 9;
        int optimalHours = 7 * 8;
        int actualHours = weekday;
        actualHours = actualHours + weekend * 2;
        int solution = optimalHours - actualHours;
        display(solution);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);  //The call puts items and perhaps sub-items in your app's menu.
        return true;  //Tells Android to display your app's menu.
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Handle action bar item clicks here.  The action bar will
        //automatically handle clicks on the Home/Up button, as long
        //as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();  //Grabs the code number of whatever item the user tapped.

        if (id == R.id.action_settings) {  //When your IDE creates a skeletal app, the app has 1 menu item
            return true;  //Tells Android that the tapping of this menu item has been handled.
        }

        return super.onOptionsItemSelected(item);  //Tells Android to do whatever Android does for menu item tap
    }

    public void display(int i) {
        TextView t = (TextView) findViewById(R.id.display_text_view);
        t.setText("" + i);

    }

}