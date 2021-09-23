package com.example.app_frase_do_dia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerar_mensagem(View view){
        String[] frases = {
                "A alegria de fazer o bem é a única felicidade verdadeira.",
                "Ser feliz sem motivo é a mais autêntica forma de felicidade.",
                " Saber encontrar a alegria na alegria dos outros, é o segredo da felicidade.",
                "A amizade duplica as alegrias e divide as tristezas."
        };
        int numero = new Random().nextInt(4);
        TextView alterar = findViewById(R.id.text_mensagem);
        alterar.setText( frases[numero]);


    }
}
