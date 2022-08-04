public class Arma01  extends Arma {
    private int municao;
 
    public void agua() {
        System.out.println("Eu atiro debaixo d'água");
    }

    public Arma01 (int municao, int tempoRecarga, int qtdetiros, int recarga ){
        this.municao = municao;
        this.tempoRecarga = tempoRecarga;
        this.qtdetiros = qtdetiros;
        this.recarga = recarga;
    }
@Override
    public void marca() {
        System.out.println("Eu sou a arma 1");
    }

       
    public int getMunicao() {
        return municao;
    }
    public void setMunicao(int municao) {
        this.municao = municao;
    }
    
}
