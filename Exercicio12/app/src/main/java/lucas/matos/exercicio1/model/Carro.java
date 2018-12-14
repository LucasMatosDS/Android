package lucas.matos.exercicio1.model;

public class Carro {

    private String marca;
    private int ano;

    public Carro() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "\n Marca: " + marca +
                "\n Ano:" + ano;
    }
}//fecha classe
