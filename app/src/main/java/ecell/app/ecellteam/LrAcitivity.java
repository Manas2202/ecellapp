package ecell.app.ecellteam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LrAcitivity extends AppCompatActivity {

    //Making Objects Of Buttons
    private Button loginBtn;
    private Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lr_acitivity);

        //initializing objects
        loginBtn = (Button) findViewById(R.id.loginButton);
        registerBtn = (Button) findViewById(R.id.registerButton);

        //Setting OnClickListener for login button
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LrAcitivity.this,LoginActivity.class));
            }
        });

        //Setting OnClickListener for register button
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LrAcitivity.this,RegisterActivity.class));
            }
        });

    }
}