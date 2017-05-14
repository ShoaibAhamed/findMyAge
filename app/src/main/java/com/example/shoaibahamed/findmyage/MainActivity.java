package com.example.shoaibahamed.findmyage;

import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etDOB;
    TextView tvShowAge;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etDOB = (EditText)findViewById(R.id.etDOB);
        tvShowAge = (TextView)findViewById(R.id.tvShowAge);


    }

    public void buFindAge(View view) {

        int DOB = Integer.parseInt(etDOB.getText().toString());

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);

        int age = year - DOB;

        tvShowAge.setText("You are"+"  "+ age +"  "+ "years old :)"  +"     "+" in another words today is " + " " + age*365 +" "+ "th day of your life!"

        );



    }
}
