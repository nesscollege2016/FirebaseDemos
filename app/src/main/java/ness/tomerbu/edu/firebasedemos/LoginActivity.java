package ness.tomerbu.edu.firebasedemos;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etEmail, etPassword;
    FloatingActionButton fabLoginOrSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);
        fabLoginOrSignup = (FloatingActionButton) findViewById(R.id.fabLoginOrSignUp);
        fabLoginOrSignup.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        
    }
}
