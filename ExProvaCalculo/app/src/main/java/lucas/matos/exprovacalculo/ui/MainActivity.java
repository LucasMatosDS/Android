package lucas.matos.exprovacalculo.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import lucas.matos.exprovacalculo.R;
import lucas.matos.exprovacalculo.model.Idade;

public class MainActivity extends AppCompatActivity{

    //widgets
    private EditText etName;
    private EditText etIdade;
    private Button btCalcular;
    private TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          initialize();

          btCalcular.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  if (etName.getText().toString().isEmpty()){
                        etName.setError("digite seu nome:");
                        toast("digite seu nome");
                        return;
                  }

                  if (etIdade.getText().toString().isEmpty()){
                      etIdade.setError("digite s ua idade");
                      toast("digite sua idade");
                      return;
                  }

                  Idade i = new Idade();
                  i.setNome(etName.getText().toString());
                  i.setIdade(Integer.parseInt(etIdade.getText().toString()));
                  Resultado.setText("calculo efetuado!\n"+i.toString());
                  toast("calculo efetuado!\n"+i.toString());

              }
          });

    }//fecha oncreate

    private void toast(String msg) {
        Toast.makeText(getBaseContext(),msg,Toast.LENGTH_LONG).show();
    }

    private void initialize() {
        etName = findViewById(R.id.ma_pt_nome);
        etIdade = findViewById(R.id.ma_pt_idade);
        btCalcular = findViewById(R.id.ma_bt_calcular);
        Resultado = findViewById(R.id.ma_tv_resultado);

    }


}//fecha classe



    
