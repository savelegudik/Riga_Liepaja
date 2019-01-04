package com.example.savelegudik.rigaliepaja;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class RigaLiepaja extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riga_liepaja);


        Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);

        Button selectDate = findViewById(R.id.btnDate);
        final TextView date = findViewById(R.id.SelectedDate);


        selectDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(RigaLiepaja.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                                date.setText(day + "." + (month + 1) + "." + year);
                            }
                        }, year, month, dayOfMonth);

                datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis());
                datePickerDialog.show();
            }
        });
    }

    public void resultClick(View view) {
        EditText el1 = (EditText) findViewById(R.id.num1);
        EditText el2 = (EditText) findViewById(R.id.num2);
        TextView resText = (TextView) findViewById(R.id.result);

        int num1 = Integer.parseInt(el1.getText().toString());
        int num2 = Integer.parseInt(el2.getText().toString());
        int resSum = num1 + num2;
        resText.setText(Integer.toString(resSum));
    }

    public void backClick(View view) {
        Intent intentBack = new Intent(this, MainActivity.class);
        startActivity(intentBack);
    }
}
