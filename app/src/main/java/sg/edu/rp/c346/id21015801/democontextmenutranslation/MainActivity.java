package sg.edu.rp.c346.id21015801.democontextmenutranslation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    TextView tvTranslatedText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTranslatedText = findViewById(R.id. textViewTranslatedText);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //other working code

        registerForContextMenu(tvTranslatedText);
    }

    private void registerForContextMenu(TextView tvTranslatedText) {
    }

}