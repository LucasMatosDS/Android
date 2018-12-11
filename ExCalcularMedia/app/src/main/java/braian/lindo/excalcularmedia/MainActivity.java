package braian.lindo.excalcularmedia;

import android.opengl.EGL14;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import braian.lindo.excalcularmedia.model.Media;

public class MainActivity extends AppCompatActivity {
        private EditText N1;
        private EditText N2;
        private Button Calcular;
        private TextView respost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();

        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(N1.getText().toString().isEmpty()){
                    N1.setError("digite a primeira nota!");
                    toast("digite a primeira nota!");
                    return;
                }

                if(N2.getText().toString().isEmpty()){
                    N2.setError("digite sua segunda nota porra!");
                    toast("digite sua segunda nota aii!");
                    return;
                }

                Media m = new Media();
                m.setN1(Integer.parseInt(N1.getText().toString()));
                m.setN2(Integer.parseInt(N2.getText().toString()));
                respost.setText("Cadastro feito!\n"+m.toString());
                toast("Cadastro feito!\n"+m.toString());
            }
        });

    }//fecha oncreate

    private void toast(String msg){
        Toast.makeText(getBaseContext(),msg,Toast.LENGTH_LONG).show();
    }

    private void initialize(){
        //refs
        N1 = findViewById(R.id.ma_pt_1);
        N2 = findViewById(R.id.ma_pt_2);
        Calcular = findViewById(R.id.ma_bt_1);
        respost = findViewById(R.id.ma_resposta);


    }
}


