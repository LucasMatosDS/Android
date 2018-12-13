package lucas.matos.ex2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvlista;

    private ArrayAdapter<String>adapter;
    private ArrayList<String>dados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        lvlista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                    String dados = parent.getItemAtPosition(position).toString();
                    toast("clicou no: " +dados);
                }

        });

        lvlista.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                String dados = parent.getItemAtPosition(position).toString();
                toast("clique longo: "+dados);
                return true;
            }
        });


    }//fecha oncreate

    private void init(){
        lvlista = findViewById(R.id.ma_lv_lista);

        dados = new ArrayList<>();

        dados.add("Matheus");
        dados.add("silverino");
        dados.add("valeria");
        dados.add("Joel");

        adapter = new ArrayAdapter<String>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,dados
                );

        lvlista.setAdapter(adapter);
    }

    private void toast(String msg){
        Toast.makeText(getBaseContext(),msg,Toast.LENGTH_LONG).show();
    }
}//fecha classe
