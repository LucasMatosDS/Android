package lucas.matos.exprovacalculo.model;

public class Idade {

    private String nome;
    private int idade;
    private String resultado;

    public Idade() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public int calcularIdadeMeses(int idade){
     return (this.idade * 12);
    }

    public int calcularIdadeSemanas(int idade){
        return (this.idade * 48);
    }

    public int calcularIdadeDias(int idade){
        return (this.idade * 265);
    }


    @Override
    public String toString() {
        return "Dados: " +
                "\n nome: " + nome +
                "\n idade: " + idade +
                "\n idade meses: " + calcularIdadeMeses(idade)+
                "\n idade semanas: " + calcularIdadeSemanas(idade)+
                "\n idade dias: "+ calcularIdadeDias(idade);

    }
}//fecha classe
