package br.com.minhamusica.gerenciadorlayout;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //private TextView tv;
    //private Button btn;
    //private EditText edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = findViewById(R.id.idButton);
        b.setOnClickListener(this);
    }

    public void onClick(View v){
        EditText edt = findViewById(R.id.idEditText);
        Context contexto = getApplicationContext();
        String texto = edt.getText().toString();
        int duracao = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(contexto, texto, duracao);
        toast.show();

        setContentView(R.layout.activity_home);




    }
}
