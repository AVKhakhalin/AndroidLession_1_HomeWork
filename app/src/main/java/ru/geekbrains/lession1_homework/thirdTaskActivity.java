package ru.geekbrains.lession1_homework;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class thirdTaskActivity extends Activity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task3_calendarview);

        Button buttonRunTask1Maket = findViewById(R.id.switchLayout_1);
        buttonRunTask1Maket.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(thirdTaskActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
