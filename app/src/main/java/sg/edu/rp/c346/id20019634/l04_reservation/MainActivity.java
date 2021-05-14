package sg.edu.rp.c346.id20019634.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatePicker dp;
        TimePicker tp;
        TextView reservation, fullName, phoneNum, noOfPax, Booking;
        EditText etName, etNumber;
        Spinner spinner;
        CheckBox checkBox;
        Button btnSubmit, btnReset;

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        etName = findViewById(R.id.editTextName);
        etNumber = findViewById(R.id.editTextNumber);
        spinner = findViewById(R.id.spinner);
        checkBox = findViewById(R.id.checkBox);
        btnReset = findViewById(R.id.buttonReset);
        btnSubmit = findViewById(R.id.buttonSubmit);

        dp.updateDate(2020, 5, 1);
        tp.setCurrentHour(7);
        tp.setCurrentMinute(30);

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dp.updateDate(2020, 5, 1);
                tp.setCurrentHour(7);
                tp.setCurrentMinute(30);
                etName.setText(" ");
                etNumber.setText(" ");
                checkBox.setChecked(false);
                spinner.setSelection(0);

            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString();
                String number = etNumber.getText().toString();
                String size = spinner.getSelectedItem().toString();

                int day = dp.getDayOfMonth();
                int month = dp.getMonth();
                int year = dp.getYear();

                String date = day + "/" + month +"/" + year;

                int hour = tp.getCurrentHour();
                int minute = tp.getCurrentMinute();

                String time = hour + ":" + minute;

                String output = "";
                String isSmoking = "";

                if(checkBox.isChecked()) {
                    isSmoking = " smoking area ";

                } else {
                    isSmoking = " non-smoking area ";

                }

                output += "Hello " + name + ", you have booked a " + isSmoking + "table for " + size + " on " + date + " at " + time;
                output += ". Your phone number is " + number;

                Toast.makeText(MainActivity.this, output, Toast.LENGTH_LONG).show();

            }
        });

    }
}