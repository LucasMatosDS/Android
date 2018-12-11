package lucas.matos.mediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnaruto;
    private Button btsasuke;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnaruto = findViewById(R.id.bt_naruto);
        btsasuke = findViewById(R.id.bt_sasuke);

        btnaruto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(R.raw.naruto);
                Toast.makeText(
                        getBaseContext(),
                        "naruto",
                        Toast.LENGTH_LONG).show();
            }
        });

        btsasuke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play(R.raw.sasuke);
                Toast.makeText(
                        getBaseContext(),
                        "sasuke",
                        Toast.LENGTH_LONG).show();
            }
        });

    }//fecha oncreate


    public void play(int som){
        try{
            mp = MediaPlayer.create(this,som);
            mp.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}//classe
