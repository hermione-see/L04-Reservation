package sg.edu.rp.c346.id20019634.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatePicker dp;
        TimePicker tp;
        TextView reservation, fullName, phoneNum, noOfPax, Booking;
        EditText name, number;

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);

        dp.updateDate(2020, 5, 1);
        tp.setCurrentHour(7);
        tp.setCurrentMinute(30);



    }
}