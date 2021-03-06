package com.comp3717.comp3717markulate;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class templatesScreen extends ActionBarActivity {

    Course myCourse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_templates_screen);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_templates_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void add_course_details(View view){
        Toast.makeText(getBaseContext(), "Add is Called", Toast.LENGTH_SHORT).show();
        Intent courseDetails = new Intent(this,courseDetailsScreen.class);
        myCourse = new Course("Big");
        Toast.makeText(getBaseContext(), myCourse.getCourseName(), Toast.LENGTH_SHORT).show();
        courseDetails.putExtra("myCourse",myCourse);
        startActivityForResult(courseDetails, 1);

    }

    public void onActivityResult(int requestCode, int resultCode, Intent data){
        if(resultCode == RESULT_OK){
            if(requestCode == 1){
                myCourse = (Course)data.getSerializableExtra("myCourseUpdated");
                Toast.makeText(getBaseContext(), myCourse.getCourseName(), Toast.LENGTH_SHORT).show();
            }
        }
    }






}
