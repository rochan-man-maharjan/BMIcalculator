package com.rochan.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText weight, height;
    TextView resultext;
    String calculation, BMIresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        resultext = findViewById(R.id.result);

    }

    public void calculateBMI(View view) {

        String S1 = weight.getText().toString();
        String S2 = height.getText().toString();

        float weighValue = Float.parseFloat(S1);
        float heighValue = Float.parseFloat(S2) / 100;

        float bmi = weighValue / (heighValue * heighValue);
        if ( bmi < 16){
            BMIresult = "Under Weight";
        }else if(bmi < 18.5) {
            BMIresult = "Under Weight";
        }else  if (bmi >= 18.5 && bmi <=24.9){
            BMIresult = "Health / Normal Weight";
        }else if (bmi >= 25 && bmi <29.9){
            BMIresult = "Over Weight";
        }else{
            BMIresult = "Obese";
        }
        calculation = "Result:\n\n" + bmi + "\n" + BMIresult;

        resultext.setText(calculation);

    }
}
