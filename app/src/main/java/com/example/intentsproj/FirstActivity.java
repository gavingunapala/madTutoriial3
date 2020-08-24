package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Telephony;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button ok;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        ok=findViewById(R.id.OK);
    }

    @Override
    protected void onResume() {
        super.onResume();
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                startActivity(intent);

                Context context = getApplicationContext(); //The context to use. Usually your Application or Activity object
                CharSequence message = "You just clicked the OK button"; //Display string
                int duration = Toast.LENGTH_SHORT; //How long the toast message will lasts
                Toast toast = Toast.makeText(context, message, duration); toast.show();

                toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
            }
        });

    }
}