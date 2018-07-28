package universe.sk.syndrive_hackathon;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import de.hdodenhof.circleimageview.CircleImageView;

public class EditProfileActivity extends AppCompatActivity {

    EditText etName, etDOB, etBloodGroup, etEmail, etName1, etNum1, etName2, etNum2, etName3, etNum3;
    FloatingActionButton fabEdit, fabSave, fabGallery;
    CircleImageView imageView_profile_pic;

    public static final int REQUEST_IMAGE_PICK = 1;

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
        etNum1 = findViewById(R.id.etNum1);
        etNum2 = findViewById(R.id.etNum2);
        etNum3 = findViewById(R.id.etNum3);

        fabEdit = findViewById(R.id.fabEdit);
        fabSave = findViewById(R.id.fabSave);
        fabGallery = findViewById(R.id.fabGallery);

        etName.setEnabled(false);
        etName1.setEnabled(false);
        etName2.setEnabled(false);
        etName3.setEnabled(false);
        etEmail.setEnabled(false);
        etBloodGroup.setEnabled(false);
        etDOB.setEnabled(false);
        etNum1.setEnabled(false);
        etNum2.setEnabled(false);
        etNum3.setEnabled(false);
        fabSave.setVisibility(View.INVISIBLE);

        fabEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fabSave.setVisibility(View.VISIBLE);
                fabEdit.setVisibility(View.INVISIBLE);

                etName.setEnabled(true);
                etName1.setEnabled(true);
                etName2.setEnabled(true);
                etName3.setEnabled(true);
                etBloodGroup.setEnabled(true);
                etDOB.setEnabled(true);
                etNum1.setEnabled(true);
                etNum2.setEnabled(true);
                etNum3.setEnabled(true);


            }
        }); // end of fabEdit

        fabSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fabSave.setVisibility(View.INVISIBLE);
                fabEdit.setVisibility(View.VISIBLE);

                etName.setEnabled(false);
                etName1.setEnabled(false);
                etName2.setEnabled(false);
                etName3.setEnabled(false);
                etBloodGroup.setEnabled(false);
                etDOB.setEnabled(false);
                etNum1.setEnabled(false);
                etNum2.setEnabled(false);
                etNum3.setEnabled(false);
            }
        }); // end of fabSave

        fabGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                startActivityForResult(Intent.createChooser(intent, "Select image"), REQUEST_IMAGE_PICK);
            }
        });

    } //end of onCreate

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

    }
} //end of EditProfileActivity
