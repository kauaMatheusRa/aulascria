package com.example.app_lista.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.app_lista.R;
import com.example.app_lista.controller.PessoasController;
import com.example.app_lista.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    PessoasController controller;
    Pessoa pessoa;
    Pessoa outraPessoa;

    String dadosPessoa;
    String dadosOutaPessoa;

    EditText editNome;
    EditText editSobrenome;
    EditText editNomeCurso;
    EditText editTelefone;

    Button btnbuton_Limpar;
    Button btnbuton_Salvar;
    Button btnbuton_Finalizar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controller = new PessoasController();
        controller.toString();

        pessoa = new Pessoa();
        pessoa.setNome("Kaua");
        pessoa.setSobreNome("Matheus");
        pessoa.setNomeCurso("Tds");
        pessoa.setTelefone("34996933106");

        outraPessoa = new Pessoa();

        editNome = findViewById(R.id.text_PrimeiroNome);
        editSobrenome = findViewById(R.id.text_Sobrenome);
        editNomeCurso = findViewById(R.id.text_NomeDoCurso);
        editTelefone = findViewById(R.id.text_TelefoneDeContato);

        btnbuton_Limpar = findViewById(R.id.button_Limpar);
        btnbuton_Salvar = findViewById(R.id.button_Salvar);
        btnbuton_Finalizar = findViewById(R.id.button_Finalizar);

        editNome.setText(pessoa.getNome());
        editSobrenome.setText(pessoa.getSobreNome());
        editNomeCurso.setText(pessoa.getNomeCurso());
        editTelefone.setText(pessoa.getTelefone());

        btnbuton_Limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editNome.setText("");
                editSobrenome.setText("");
                editNomeCurso.setText("");
                editTelefone.setText("");
            }
        });

        btnbuton_Finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Finalizado", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        btnbuton_Salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                outraPessoa.setNome(editNome.getText().toString());
                outraPessoa.setSobreNome(editSobrenome.getText().toString());
                outraPessoa.setNomeCurso(editNomeCurso.getText().toString());
                outraPessoa.setTelefone(editTelefone.getText().toString());

                controller.salvar(outraPessoa);

                Toast.makeText(MainActivity.this, "Dados salvos" + outraPessoa.toString(), Toast.LENGTH_LONG).show();
            }
        });


        Log.i("ProgramacaoPOO", pessoa.toString());
        Log.i("ProgramacaoPOO", outraPessoa.toString());


    }
}