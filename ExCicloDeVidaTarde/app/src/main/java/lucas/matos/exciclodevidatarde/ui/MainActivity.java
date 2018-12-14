package lucas.matos.exciclodevidatarde.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import lucas.matos.exciclodevidatarde.R;
import lucas.matos.exciclodevidatarde.model.Cliente;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "logsMainActivity";

    private Button btOK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"ENTROU NO ONCREATE");
        btOK = findViewById(R.id.ma_bt_ok);

        btOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Cliente c = new Cliente();
                c.setNome("josé");
                c.setRenda(900);

                Intent it = new Intent(MainActivity.this, Tela1.class);
                 it.putExtra("nome", "lucas matos");
                   startActivity(it);


            }
        });

    }//fecha oncreate

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"ENTROU NO ONSTART");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"ENTROU NO ONRESUME");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"ENTROU NO ONPAUSE");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"ENTROU NO ONSTOP");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"ENTROU NO ONRESTART");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"ENTROU NO ONDESTROY");
    }

}//fecha classe
