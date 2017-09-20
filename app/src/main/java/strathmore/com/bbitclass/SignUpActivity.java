package strathmore.com.bbitclass;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Button btnSignUp=(Button)findViewById(R.id.button);

        final EditText txtFname=(EditText)findViewById(R.id.firstname);
        final EditText txtLname=(EditText)findViewById(R.id.lastname);
        final EditText txtPhone=(EditText)findViewById(R.id.phone);
        final EditText txtEmail=(EditText)findViewById(R.id.email);
        final EditText txtPass=(EditText)findViewById(R.id.passwordsignup);



        btnSignUp.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                String fnamevalue = txtFname.getText().toString();
                String lnamevalue = txtLname.getText().toString();
                String phonevalue = txtPhone.getText().toString();
                String emailvalue = txtEmail.getText().toString();
                String passvalue = txtPass.getText().toString();

                Intent homepageintent=new Intent(SignUpActivity.this, ActivityHome.class);
                startActivity(homepageintent);
            }

        });
    }

}
