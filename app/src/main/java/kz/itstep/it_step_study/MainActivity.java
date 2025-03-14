package kz.itstep.it_step_study;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.study);

        EditText firstText = findViewById(R.id.first_text);
        EditText secondText = findViewById(R.id.second_text);
        Button button = findViewById(R.id.first_button);
        TextView textView = findViewById(R.id.text);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Integer firstValue = Integer.valueOf(firstText.getText().toString());
                    Integer secondValue = Integer.valueOf(secondText.getText().toString());

                    if(firstValue == secondValue){
                        textView.setText("Равно");
                    }
                } catch (NumberFormatException ex){
                    textView.setText("Не вводи буквы");
                    Log.d("input text", "input txt is not number");
                }

            }
        });
    }
}