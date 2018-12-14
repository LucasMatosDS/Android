package lucas.matos.exentradadedadostarde;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import lucas.matos.exentradadedadostarde.model.Pessoa;

public class MainActivity extends AppCompatActivity {


    //widgets
    private EditText etNome;
    private EditText etIdade;
    private EditText etPeso;
    private TextView tvResposta;
    private Button btOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         initialize();

         btOK.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if(etNome.getText().toString().isEmpty()){
                     etNome.setError("digite um nome!");
                     toast("digite um nome!");
                     return;
                 }

                 if(etIdade.getText().toString().isEmpty()){
                     etIdade.setError("digite sua idade!");
                     toast("digite sua idade!");
                     return;
                 }


                 if(etPeso.getText().toString().isEmpty()){
                     etPeso.setError("digite seu peso!");
                     toast("digite seu peso!");
                     return;
                 }

                 Pessoa p = new Pessoa();
                 p.setNome(etNome.getText().toString());
                 p.setIdade(Integer.parseInt(etIdade.getText().toString()));
                 p.setPeso(Double.parseDouble(etPeso.getText().toString()));
                 tvResposta.setText("Pessoa cadastrada com sucesso!\n"+p.toString());
                 toast("Pessoa cadastrada com sucesso!\n"+p.toString());
             }
         });
    }//fecha oncreate

 private void toast(String msg){
     Toast.makeText(getBaseContext(),msg,Toast.LENGTH_LONG).show();
 }

    private void initialize(){
        //refs
        etNome = findViewById(R.id.ma_et_nome);
        etIdade = findViewById(R.id.ma_et_idade);
        etPeso = findViewById(R.id.ma_et_peso);
        tvResposta = findViewById(R.id.ma_tv_resposta);
        btOK= findViewById(R.id.ma_bt_ok);

    }
}//fecha classe
