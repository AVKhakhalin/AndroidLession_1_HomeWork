package ru.geekbrains.lession1_homework;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class secondTaskActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task2_maket);

        Button buttonRunTask3Maket = findViewById(R.id.switchLayout_3);
        buttonRunTask3Maket.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(secondTaskActivity.this, thirdTaskActivity.class);
                startActivity(intent);
            }
        });
    }
}
