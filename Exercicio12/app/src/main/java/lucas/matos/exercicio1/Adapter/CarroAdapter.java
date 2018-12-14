package lucas.matos.exercicio1.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import lucas.matos.exercicio1.R;
import lucas.matos.exercicio1.model.Carro;

public class CarroAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Carro> carros;
    private LayoutInflater inflater;

    public CarroAdapter(Context context, ArrayList<Carro> carros) {
        this.context = context;
        this.carros = carros;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return carros.size();
    }
    @Override
    public Carro getItem(int position) {
        return carros.get(position);
    }
    @Override
    public long getItemId(int position){
        return 0;
    }
    public View getView(int position,
                        View convertView,
                        ViewGroup parent) {

        ViewHolder holder;

        if(convertView == null){
            convertView = inflater.inflate(R.layout.linha_carro,parent,false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder); //memória
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        carros c = getItem(position);
