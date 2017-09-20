package strathmore.com.bbitclass;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class ActivityLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button Signup= (Button) findViewById(R.id.signup);
        Signup.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent signupIntent= new Intent(ActivityLogin.this, SignUpActivity.class);
                startActivity(signupIntent);
            }


        });


    }


}
