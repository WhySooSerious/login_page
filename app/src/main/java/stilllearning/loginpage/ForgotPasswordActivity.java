package stilllearning.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ForgotPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        final EditText Email = (EditText) findViewById(R.id.Email);
        final TextView textView2= (TextView) findViewById(R.id.textView2);
        final Button Continue = (Button)  findViewById(R.id.Continue);
    }
}
