package lucas.matos.exercicio1.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import lucas.matos.exercicio1.Adapter.CarroAdapter;
import lucas.matos.exercicio1.R;
import lucas.matos.exercicio1.model.Carro;

public class MainActivity extends AppCompatActivity {

    private EditText etMarca;
    private EditText etAno;
    private Button  btOK;
    private ListView lvLista;

    private ArrayList<Carro> carros;
    private CarroAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        btOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Carro c = new Carro();
                c.setMarca(etMarca.getText().toString());
                c.setAno(Integer.parseInt(etAno.getText().toString()));

                carros.add(c);
                adapter.notifyDataSetChanged();
                toast("carro cadastrado com sucesso");
            }
        });

    }//fecha oncreate

     private void init(){
        etMarca = findViewById(R.id.ma_et_marca);
        etAno = findViewById(R.id.ma_et_ano);
        btOK = findViewById(R.id.ma_bt_ok);
        lvLista = findViewById(R.id.ma_lv_lista);

        carros  = new ArrayList<>();
        adapter = new CarroAdapter(MainActivity.this, carros);
        lvLista.setAdapter(adapter);
     }

    private void toast(String mensagem){
        Toast.makeText(getBaseContext(),mensagem, Toast.LENGTH_LONG).show();
    }

}//fecvha classe

