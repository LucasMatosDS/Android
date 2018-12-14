package lucas.matos.exciclodevidatarde.ui;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import lucas.matos.exciclodevidatarde.R;
import lucas.matos.exciclodevidatarde.model.Cliente;

public class Tela1 extends AppCompatActivity {
    private static final String TAG = "logsTela1";

    private EditText etURL;
    private Button btURL;

    private EditText etNumero;
    private Button btNumero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);
        Log.d(TAG, "Entrou no oncreate");

        etURL = findViewById(R.id.t1_et_url);
        btURL = findViewById(R.id.t1_bt_url);

        etNumero = findViewById(R.id.t1_et_numero);
        btNumero = findViewById(R.id.t1_bt_numero);

        btNumero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("tel"+etNumero.getText().toString());
                Intent it = new Intent(Intent.ACTION_DIAL,uri);
                startActivity(it);

            }
        });

        btURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://"+etURL.getText().toString());
                Intent it = new Intent(Intent.ACTION_VIEW,uri);
                 startActivity(it);
            }
        });

        if(getIntent().hasExtra("nome")) {
            String nome = getIntent().getStringExtra("nome");

           /* Toast.makeText(getBaseContext(),
                    "Olá " + nome,
                    Toast.LENGTH_LONG).show();*/
        }

        if(getIntent().hasExtra("c")) {
            Cliente c = (Cliente) getIntent().getSerializableExtra("c");

            Toast.makeText(getBaseContext(),
                    "Olá " + c.toString(),
                    Toast.LENGTH_LONG).show();
        }
    }//fecha oncreate

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Entrou no onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Entrou no onresume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Entrou no onpause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Entrou no onstop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Entrou no ondestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Entrou no onrestart");
    }

}