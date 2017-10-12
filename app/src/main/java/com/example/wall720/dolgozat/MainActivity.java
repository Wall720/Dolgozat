package com.example.wall720.dolgozat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button button_Plus;
    private Button button_Minus;
    private Button button_Reset;
    private TextView WriteOut;
    private int Number = 0;
    private int ToastCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_Plus = (Button) findViewById(R.id.buttonPlus);
        button_Minus = (Button) findViewById(R.id.buttonMinus);
        button_Reset = (Button) findViewById(R.id.buttonReset);
        WriteOut = (TextView) findViewById(R.id.textView);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();


        button_Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Number++;
                if ()
                WriteOut.setText("" + Number);

            }
        });
        button_Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Number--;
                WriteOut.setText("" + Number);
            }
        });
         button_Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Number = 0;
                WriteOut.setText("" + Number);
            }
        });



    }
}
