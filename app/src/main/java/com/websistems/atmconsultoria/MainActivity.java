package com.websistems.atmconsultoria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imgEmpresa, imgServicos, imgClientes, imgContato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgEmpresa = findViewById(R.id.imgEmpresa);
        imgEmpresa.setOnClickListener(this);

        imgServicos = findViewById(R.id.imgServicos);
        imgServicos.setOnClickListener(this);

        imgClientes = findViewById(R.id.imgClientes);
        imgClientes.setOnClickListener(this);

        imgContato = findViewById(R.id.imgContato);
        imgContato.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgEmpresa:
                startActivity(new Intent(this, EmpresaActivity.class));
                break;

            case R.id.imgServicos:
                startActivity(new Intent(this, ServicoActivity.class));
                break;

            case R.id.imgClientes:
                startActivity(new Intent(this, ClienteActivity.class));
                break;

            case R.id.imgContato:
                startActivity(new Intent(this, ContatoActivity.class));
                break;
        }
    }
}
