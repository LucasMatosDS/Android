package braian.lindo.excalcularmedia.model;

public class Media {


   private int N1;
   private int N2;
   private int Media;


    public Media() {

    }

    public int getN1() {
        return N1;
    }

    public void setN1(int n1) {
        N1 = n1;
    }

    public int getN2() {
        return N2;
    }

    public void setN2(int n2) {
        N2 = n2;
    }

    public int calcularMedia(int Media){
        return (this.N1 + this.N2) / 2;
    }
    @Override
    public String toString() {
        return
                "N1: " + N1 +
                "\nN2: " + N2 +
                "\nMedia: "+calcularMedia(Media)
                ;
    }
}//fecha classe

