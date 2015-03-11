package com.comp3717.comp3717markulate;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class courseDetailsScreen extends ActionBarActivity {

    EditText courseName;
    Course myCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_details_screen);
        Intent i = getIntent();
        myCourse = (Course)i.getSerializableExtra("myCourse");
        courseName = (EditText)findViewById(R.id.course_name);
        if(myCourse.getCourseName() != null)
            courseName.setText(myCourse.getCourseName());
    }

    public void detailsAdded(View v){
        Intent i = new Intent();
        myCourse.setCourseName(courseName.getText().toString());
        Toast.makeText(getBaseContext(), myCourse.getCourseName(), Toast.LENGTH_SHORT).show();
        i.putExtra("myCourseUpdated",myCourse);
        setResult(RESULT_OK, i);
        finish();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_course_details_screen, menu);
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
}
