package com.example.valwaste;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginPalero extends AppCompatActivity {

    private EditText Name1;
    private EditText Password1;
    private TextView Info1;
    private Button Login1;
    private int counter1 = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_palero);
        configureBackButton();

        Name1 = findViewById(R.id.usernameTFP);
        Password1 = findViewById(R.id.passwordTFP);
        Info1 = findViewById(R.id.infoP);
        Login1 = findViewById(R.id.LoginButtonP);
        Info1.setText("No of attempts remaining: 5");

        Login1.setOnClickListener(view -> validate(Name1.getText().toString(), Password1.getText().toString()));
    }

        private void configureBackButton(){
        Button LoginPButton = findViewById (R.id.backButtonP);

        LoginPButton.setOnClickListener(view -> finish());
    }
    private void validate(String userName, String userPassword){
        if((userName.equals("Admin")) && (userPassword.equals("1234"))){
            Intent intent = new Intent(LoginPalero.this,DIui.class);
            startActivity(intent);
        }else{
            counter1--;

            Info1.setText("No of attempts remaining: " + counter1);

            if(counter1 == 0){
                Login1.setEnabled(false);
            }
        }
    }
}