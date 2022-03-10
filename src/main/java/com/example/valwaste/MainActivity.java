package com.example.valwaste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configureLoginDIButton();
        configureLoginPButton();
    }

    private void configureLoginDIButton(){
        Button LoginDIButton = (Button) findViewById (R.id.LoginDI);


        LoginDIButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LoginDI.class));
            }
             });


    }
    private void configureLoginPButton(){

        Button LoginPButton = (Button) findViewById (R.id.LoginP);

        LoginPButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LoginPalero.class));
            }
        });

    }

}
