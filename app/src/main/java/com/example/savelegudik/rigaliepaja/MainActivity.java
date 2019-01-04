package com.example.savelegudik.rigaliepaja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button backButton = (Button)findViewById(R.id.buttonAddition);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RigaLiepaja.class));
            }
        });
    }

    public void additionClick(View view) {
        Intent intentAddition = new Intent(this, RigaLiepaja.class);
        startActivity(intentAddition);
    }

    public void substractionClick(View view) {
        Intent intentAddition = new Intent(this, LiepajaRiga.class);
        startActivity(intentAddition);
    }
}
