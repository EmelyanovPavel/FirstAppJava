package com.example.firstappjava;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText etInput;
    private Switch switchOption;
    private CheckBox cbAgree;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Инициализация виджетов
        etInput = findViewById(R.id.etInput);
        switchOption = findViewById(R.id.switchOption);
        cbAgree = findViewById(R.id.cbAgree);
        btnSubmit = findViewById(R.id.btnSubmit);


        // Обработчик кнопки
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = etInput.getText().toString();
                boolean isSwitchOn = switchOption.isChecked();
                boolean isAgreed = cbAgree.isChecked();

                // Формируем сообщение
                StringBuilder message = new StringBuilder();
                message.append("Введено: ").append(text).append("\n");
                message.append("Опция: ").append(isSwitchOn ? "Включена" : "Выключена").append("\n");
                message.append("Согласие: ").append(isAgreed ? "Да" : "Нет");

                // Выводим результат (вместо Toast можно использовать другие варианты)
                Toast.makeText(MainActivity.this, message.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}