package com.booboomx.onboarderlead.onboarder.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.booboomx.onboarderlead.R;

public class ListActivity extends Activity  {

    private Button mBtnGradientBackground,mBtnImageBackground,mBtnSolidBackground;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        mBtnGradientBackground= (Button) findViewById(R.id.btn_GradientBackground);
        mBtnImageBackground= (Button) findViewById(R.id.btn_ImageBackground);
        mBtnSolidBackground= (Button) findViewById(R.id.btn_SolidBackground);

        mBtnGradientBackground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(ListActivity.this,GradientBackgroundExampleActivity.class));

            }
        });


        mBtnImageBackground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ListActivity.this,ImageBackgroundExampleActivity.class));
            }
        });

        mBtnSolidBackground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ListActivity.this,SolidBackgroundExampleActivity.class));
            }
        });

    }


}
