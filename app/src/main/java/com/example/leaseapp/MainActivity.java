package com.example.leaseapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String dateBeforeString = "2020-07-19";
//        String dateAfterString = "2020-08-11";

        //Parsing the date
        LocalDate dateBefore = LocalDate.parse(dateBeforeString);
//        LocalDate dateAfter = LocalDate.parse(dateAfterString);
        LocalDate dateAfter = LocalDate.now();


        //calculating number of days in between
        long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);

        //displaying the number of days
//        System.out.println("Day car was leased: 7-19-2020");
//        System.out.print("Days since then: ");
//        System.out.println(noOfDaysBetween + " days");
        double leaseLength = 3; //in years
        double mileage = 30000;
        double yearlyMileage = mileage/leaseLength;
        double mpd = yearlyMileage / 365;
        double milesToday = noOfDaysBetween * mpd;

//        System.out.println("Mileage expected: " + (int)milesToday);

        TextView textView = findViewById(R.id.textView);
        textView.setText("Day car was leased: 7-19-2020");

        TextView textView2 = findViewById((R.id.textView2));
        textView2.setText("Days since then: " + noOfDaysBetween + " days");

        TextView textView3 = findViewById((R.id.textView3));
        textView3.setText("Mileage expected: " + (int)milesToday + " miles");

    }
}