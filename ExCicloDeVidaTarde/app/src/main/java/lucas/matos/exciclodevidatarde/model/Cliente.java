package lucas.matos.exciclodevidatarde.model;

import java.io.Serializable;

public class Cliente implements Serializable {

    private String nome;
    private double renda;

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    @Override
    public String toString() {
        return  "\n nome:'" + nome +
                "\n renda:" + renda +
                '}';
    }
}//fecha classe
