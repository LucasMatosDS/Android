package lucas.matos.exercicion1.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import lucas.matos.exercicion1.Adapter.PessoaAdapter;
import lucas.matos.exercicion1.R;
import lucas.matos.exercicion1.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    private EditText etNome;
    private EditText etIdade;
    private Button btOK;
    private RecyclerView rvPessoas;
    private ArrayList<Pessoa>pessoas;
    private PessoaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         init();

         btOK.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Pessoa p = new Pessoa();
                 p.setNome(etNome.getText().toString());
                 p.setIdade(Integer.parseInt(etIdade.getText().toString()));

                 pessoas.add(p);
                 adapter.notifyDataSetChanged();
                 toast("Cadastro efetuado com suceeso!");
                 limpar();
             }
         });

    }//fecha oncreate

    private void limpar(){
        etNome.setText("");
        etIdade.setText("");
    }

    private void init(){
        etNome = findViewById(R.id.ma_et_nome);
        etIdade = findViewById(R.id.ma_et_idade);
        btOK = findViewById(R.id.ma_bt_cadastrar);
        rvPessoas = findViewById(R.id.ma_rv_lista);

        pessoas = new ArrayList<>();
        adapter = new PessoaAdapter(MainActivity.this, pessoas);

        rvPessoas.setAdapter(adapter);
        rvPessoas.setHasFixedSize(true);
        rvPessoas.setLayoutManager(new LinearLayoutManager(this));

    }//fecha init

    private void toast(String msg){
        Toast.makeText(getBaseContext(),msg,Toast.LENGTH_LONG).show();
    }

}//fecha classe
