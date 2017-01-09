package com.booboomx.leadpage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.booboomx.dixinlead.DiXinActivity;
import com.booboomx.liulishuolead.LiuLishuoActivity;
import com.booboomx.mogulead.MoGuLeadActivity;
import com.booboomx.xiamilead.XiaMiActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button  btnOne;
    private Button  btnTwo;
    private Button btnThree;
    private Button btnFour;

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
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
    }

    private void initView() {

        btnOne= (Button) findViewById(R.id.btn_one);
        btnTwo= (Button) findViewById(R.id.btn_two);
        btnThree= (Button) findViewById(R.id.btn_three);
        btnFour= (Button) findViewById(R.id.btn_four);



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

            case R.id.btn_three:
                startActivity(new Intent(this, DiXinActivity.class));
                break;

            case R.id.btn_four:
                startActivity(new Intent(this, LiuLishuoActivity.class));
                break;


        }
    }
}
