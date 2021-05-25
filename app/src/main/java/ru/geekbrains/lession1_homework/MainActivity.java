package ru.geekbrains.lession1_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        setContentView(R.layout.task2_maket);
//        setContentView(R.layout.task3_calendarview);
    }

    public void switchLayout1(View view)
    {
        setContentView(R.layout.activity_main);
    }
    public void switchLayout2(View view)
    {
        setContentView(R.layout.task2_maket);
    }
    public void switchLayout3(View view)
    {
        setContentView(R.layout.task3_calendarview);
    }
}