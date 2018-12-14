package braian.silva.exlistviewarrayadaptertarde.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import braian.silva.exlistviewarrayadaptertarde.Adapter.PessoaAdapter;
import braian.silva.exlistviewarrayadaptertarde.R;
import braian.silva.exlistviewarrayadaptertarde.model.Pessoa;

public class MainActivity extends AppCompatActivity {
    private EditText etNome;
    private EditText etIdade;
    private Button btOK;
    private ListView lvPessoas;

    private ArrayList<Pessoa> pessoas;
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
                toast("Pessoa cadastrada com sucesso!");
            }
        });
    }
    private void init(){
        etNome = findViewById(  R.id.ma_et_nome);
        etIdade = findViewById( R.id.ma_et_idade);
        btOK = findViewById(R.id.ma_bt_ok);
        lvPessoas = findViewById(R.id.ma_lv_pessoas);

        pessoas = new ArrayList<>();
        adapter = new PessoaAdapter(MainActivity.this, pessoas);
        lvPessoas.setAdapter(adapter);

    }
    private void toast(String msg){
        Toast.makeText(getBaseContext(),msg, Toast.LENGTH_LONG).show();
    }
}
