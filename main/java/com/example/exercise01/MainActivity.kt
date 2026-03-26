package com.example.exercise01;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(R.string.id_number);
        }

        Button btnChangeName = findViewById(R.id.btnChangeName);
        final TextView tvDepartment = findViewById(R.id.tvDepartment);

        btnChangeName.setOnClickListener(v -> tvDepartment.setText(R.string.chairwoman_name));
    }
}
