package lucas.matos.ex1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Spinner spSexo;
    private Button btconfirmar;


    @Override
  protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();


        btconfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(spSexo.getSelectedItemPosition()==0){
                    toast("necessario selecionar!");
                    return;
                }
                String sexo = spSexo.getSelectedItem().toString();
                toast("voce é" +sexo);
            }
        });

        spSexo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position != 0){
                    String sexo = parent.getSelectedItem().toString();
                    toast("voce é" +sexo);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }//fecha oncreate
    private void init(){
        spSexo = findViewById(R.id.ma_sp_sexo);
        btconfirmar = findViewById(R.id.ma_bt_confirmar);
    }

    private void toast(String msg){
        Toast.makeText(getBaseContext(),msg,Toast.LENGTH_LONG).show();
    }

}//fecha classe
