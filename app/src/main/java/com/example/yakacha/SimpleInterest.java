package com.example.yakacha;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SimpleInterest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_simple_interest);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.simpleInterest), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    @Override
    protected void onResume() {
        super.onResume();

        Button simpleInterestBtn = findViewById(R.id.simpleInterestBtn);

        EditText textPrinciple = findViewById(R.id.textPrinciple);

        EditText textTime = findViewById(R.id.textTime);

        EditText textRate = findViewById(R.id.textRate);


        simpleInterestBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String principleStr = textPrinciple.getText().toString();
                String timeStr = textPrinciple.getText().toString();
                String rateStr = textPrinciple.getText().toString();
                int principle = Integer.parseInt(principleStr);

                int time = Integer.parseInt(timeStr);

                int rate = Integer.parseInt(rateStr);

                int numerator = principle*time*rate;
                float simpleInterest = (float) numerator /100;

                Toast.makeText(SimpleInterest.this,"Result = " +simpleInterest,Toast.LENGTH_LONG).show();
            }
        });
    }
}