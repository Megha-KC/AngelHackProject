package universe.sk.syndrive_hackathon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class signupactivity extends AppCompatActivity {

    private EditText etName, etEmailsign, etPassign, etConfirmPassign, etBloodgroup, etDate, etEmName1, etEmName2, etEmName3, etEmNum1, etEmNum2, etEmNum3;
    private Button btn_register;
    private TextView tvExist;
    private FirebaseAuth firebaseAuth;
    String name, email, password, bloodgrp, date;
    String emname1, emname2, emname3;
    String emnum1, emnum2, emnum3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupactivity);
    }


    private void setUIviews() {
        etName = findViewById(R.id.etName);
        etEmName1 = findViewById(R.id.etEmName1);
        etEmName2 = findViewById(R.id.etEmName2);
        etEmName3 = findViewById(R.id.etEmName3);
        etBloodgroup = findViewById(R.id.etBloodgroup);
        etEmNum1 = findViewById(R.id.etEmNum1);
        etEmNum2 = findViewById(R.id.etEmNum2);
        etEmNum3 = findViewById(R.id.etEmNum3);
        etEmailsign = findViewById(R.id.etEmailsign);
        etPassign = findViewById(R.id.etPassign);
        etConfirmPassign = findViewById(R.id.etConfirmPassign);
        etDate = findViewById(R.id.etDate);
        btn_register = findViewById(R.id.btn_register);
        tvExist = findViewById(R.id.tvExist);

    }
}