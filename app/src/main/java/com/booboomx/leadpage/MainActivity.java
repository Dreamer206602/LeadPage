package com.booboomx.leadpage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.booboomx.mogulead.MoGuLeadActivity;
import com.booboomx.xiamilead.XiaMiActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button  btnOne;
    private Button  btnTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
    }

    private void initData() {
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
    }

    private void initView() {

        btnOne= (Button) findViewById(R.id.btn_one);
        btnTwo= (Button) findViewById(R.id.btn_two);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_one:
                startActivity(new Intent(this, MoGuLeadActivity.class));
                break;

            case R.id.btn_two:
                startActivity(new Intent(this, XiaMiActivity.class));
                break;
        }
    }
}