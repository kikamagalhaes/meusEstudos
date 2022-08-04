public abstract class Arma{

    private int municao;
    public int tempoRecarga;
    public int qtdetiros;
    public int recarga;

    public void atirar() {
        if (this.municao > this.qtdetiros ) {
            System.out.println("Estou atirando " + this.qtdetiros +" munições");
            this.municao -= this.qtdetiros ;
            System.out.println("");
        } else {
            System.out.println("Preciso ser recarregada");
            System.out.println("");
        }

    }
    public void recarregar() {
 
        System.out.println("Estou sendo recarregada com " + this.recarga + " munições em " + this.tempoRecarga + " segundos.");
        this.municao += this.recarga;
        System.out.println("");

    }


    public void marca() {

    }

}
