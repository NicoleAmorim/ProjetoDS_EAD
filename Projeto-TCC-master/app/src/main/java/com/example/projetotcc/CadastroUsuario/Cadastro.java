package com.example.projetotcc.CadastroUsuario;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.projetotcc.R;
import com.example.projetotcc.Usuario;

public class Cadastro extends AppCompatActivity {
    Intent it = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void CadastrarPrestador(View view)
    {
        it = new Intent(this, Cadastro1.class);
        this.startActivity(it);
    }
    public void CadastrarCliente(View view)
    {
        it = new Intent(this, Cadastro2.class);
        this.startActivity(it);
    }
}
