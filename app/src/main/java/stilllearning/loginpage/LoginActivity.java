package stilllearning.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
  Button Login;
    EditText username,Password;
    TextView Signup,FP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final TextView textView = (TextView)findViewById(R.id.textView);
        onLoginClick();
        onSignupClick();
        onFPClick();}


       public void onLoginClick()
    {   username=(EditText)findViewById(R.id.username);
        Password=(EditText)findViewById(R.id.Password);
        Login=(Button)findViewById(R.id.Login);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                if(username.getText().toString().equals("admin")&&Password.getText().toString().equals("1234"))
                {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                }
                else
                {
                    Toast.makeText(LoginActivity.this,

                            "Your Username or Password is Wrong Please Enter Again",

                            Toast.LENGTH_SHORT).show();
                }



        }});}
     public void onSignupClick()
     { Signup=(TextView)findViewById(R.id.Signup) ;
            Signup.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    {
                        Intent signupintent = new Intent(LoginActivity.this, SignUpActivity.class);
                        LoginActivity.this.startActivity(signupintent);
                    }
                }
            });}
        public void onFPClick()
        {FP=(TextView)findViewById(R.id.FP) ;
            FP.setOnClickListener(new View.OnClickListener()
            { @Override
            public void onClick(View v)
            {

            Intent fpintent = new Intent(LoginActivity.this, ForgotPasswordActivity.class);
            LoginActivity.this.startActivity(fpintent);

            }
        });
                }}






