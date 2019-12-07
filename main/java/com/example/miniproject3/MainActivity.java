package com.example.miniproject3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mab1=(Button)findViewById(R.id.mab1);
        Button mab2=(Button)findViewById(R.id.mab2);
        Button mab3=(Button)findViewById(R.id.mab3);
        mab1.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                openMyCollege();
            }
        });
        mab2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                openMyDepartment();
            }
        });
        mab3.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                openMyClass();
            }
        });
    }

    public void openMyCollege(){
        Intent intent=new Intent(this,MyCollege.class);
        startActivity(intent);
    }
    public void openMyDepartment(){
        Intent intent=new Intent(this,MyDepartment.class);
        startActivity(intent);
    }
    public void openMyClass(){
        Intent intent=new Intent(this,MyClass.class);
        startActivity(intent);
    }
}
