package lucas.matos.exercicion1.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import jp.wasabeef.picasso.transformations.CropCircleTransformation;
import lucas.matos.exercicion1.R;
import lucas.matos.exercicion1.model.Pessoa;

public class PessoaAdapter extends RecyclerView.Adapter {

    private Context context;
    private ArrayList<Pessoa> pessoas;

    public PessoaAdapter(@NonNull Context context,
                         ArrayList<Pessoa> pessoas) {
        this.context = context;
        this.pessoas = pessoas;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(context).inflate(
                R.layout.linha_pessoa,
                viewGroup,
                false);

        ViewHolder holder = new ViewHolder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

        ViewHolder holder = (ViewHolder) viewHolder;
        Pessoa p = pessoas.get(i);

        holder.tvNome.setText("Nome: "+p.getNome());
        holder.tvIdade.setText("Idade: "+p.getIdade());


        Picasso.get()
                .load(p.verificarPessoa())
                .placeholder(R.mipmap.ic_launcher)
                .transform(new CropCircleTransformation())
                .into(holder.ivPessoa);
    }

    @Override
    public int getItemCount() {
        return pessoas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private final TextView tvNome;
        private final TextView tvIdade;
        private final ImageView ivPessoa;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNome = itemView.findViewById(R.id.lp_tv_nome);
            tvIdade= itemView.findViewById(R.id.lp_tv_idade);
            ivPessoa = itemView.findViewById(R.id.lp_iv_pessoa);
        }
    }
}//fecha classe