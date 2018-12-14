package lucas.matos.exercicion1.model;

public class Pessoa {

    private String nome;
    private int idade;


    public Pessoa() {
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

    public String verificarPessoa() {
        if (nome.equalsIgnoreCase("mario")) {
            return "https://img.icons8.com/color/1600/person-male.png";
        }
            return "https://www.w3schools.com/w3images/avatar6.png";
        }




    @Override
    public String toString() {
        return  "\n nome:" + nome +
                "\n idade:" + idade;
    }
}//fecha classe
