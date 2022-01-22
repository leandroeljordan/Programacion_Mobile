package com.example.atividade_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button boton;
    TextView texto;
    EditText editext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = findViewById(R.id.boton);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                texto = findViewById(R.id.Texto_Principal);
                editext = findViewById(R.id.Edit_Text1);
                texto.setText(editext.getText());
                Toast.makeText(getApplicationContext(),texto.getText(),Toast.LENGTH_LONG).show();
            }
        });



    }


}