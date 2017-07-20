package stilllearning.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        final EditText Name = (EditText) findViewById(R.id.Name);
        final TextView textView3 = (TextView) findViewById(R.id.textView3);
        final EditText username = (EditText) findViewById(R.id.username);
        final EditText Password = (EditText) findViewById(R.id.Password);
        final EditText Repassword = (EditText) findViewById(R.id.Repassword);
        final EditText Email = (EditText) findViewById(R.id.Email);
        final EditText DOB = (EditText) findViewById(R.id.DOB);
        final Button signup = (Button)  findViewById(R.id.signup);
    }
}
