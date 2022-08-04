public class Arma02  extends Arma {

private int municao;
  

        public void silenciar () {
            System.out.println("Eu tenho silenciador!");
        };

        @Override
    public void marca() {
        System.out.println("Eu sou a arma 2");
    }
            
    public int getMunicao() {
        return municao;
    }
    public void setMunicao(int municao) {
        this.municao = municao;
    }
    }

