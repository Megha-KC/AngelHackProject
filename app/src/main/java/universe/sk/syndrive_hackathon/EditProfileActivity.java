package universe.sk.syndrive_hackathon;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import de.hdodenhof.circleimageview.CircleImageView;

public class EditProfileActivity extends AppCompatActivity {

    EditText etName, etDOB, etBloodGroup, etEmail, etName1, etNum1, etName2, eNum2, etName3, etNum3;
    FloatingActionButton fabEdit, fabSave, fabGallery;
    CircleImageView imageView_profile_pic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        etName = findViewById(R.id.etName);
        etDOB = findViewById(R.id.etDOB);
        etBloodGroup = findViewById(R.id.etBloodGroup);
        etEmail = findViewById(R.id.etEmail);
        etName1 = findViewById(R.id.etName1);
        etName2 = findViewById(R.id.etName2);
        etName3 = findViewById(R.id.etName3);
        etNum1 = 
    }
}
