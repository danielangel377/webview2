package com.example.webview2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
            EditText busqueda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        busqueda= (EditText)findViewById(R.id.busqueda);
    }

    public void busccar(View view) {
        String buscar = busqueda.getText().toString();
        Intent i = new Intent(MainActivity.this,pagina2.class);
            i.putExtra("",buscar);
startActivity(i);
    }
}