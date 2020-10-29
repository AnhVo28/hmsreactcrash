package com.huawei.reactcrash;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.huawei.agconnect.crash.AGConnectCrash;

public class ExampleActivity extends AppCompatActivity {


    private Button btnTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);

        btnTest = (Button)findViewById(R.id.test_btn);

        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Test trigger a crash
                AGConnectCrash.getInstance().testIt(getApplicationContext());
            }
        });



    }
}