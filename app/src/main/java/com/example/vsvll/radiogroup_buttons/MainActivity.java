package com.example.vsvll.radiogroup_buttons;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RelativeLayout relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        relativeLayout = findViewById(R.id.relativeLayout);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.radioButton1:
                        relativeLayout.setBackgroundColor(Color.RED);
                        break;

                    case R.id.radioButton2:
                        relativeLayout.setBackgroundColor(Color.BLUE);
                        break;

                    case R.id.radioButton3:
                        relativeLayout.setBackgroundColor(Color.GREEN);
                        break;
                }

            }
        });

    }
}
