package universe.sk.syndrive_hackathon;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class AlertActivity extends AppCompatActivity {

    TextView tvTime;
    FloatingActionButton fabSend, fabDismiss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);
    }
}
