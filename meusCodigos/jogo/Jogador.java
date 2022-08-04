public class Jogador {

public static void main ( String [] Args) {

   Arma01 a04 = new Arma01(5, 20, 15, 12);
      a04.atirar();
      a04.recarregar();
      a04.agua();
      a04.marca();
   

  /* Arma01 a01 = new Arma01(); 
  
   a01.tempoRecarga = 5;
   a01.qtdetiros = 5;
   a01.recarga = 20;
   a01.atirar();
   a01.recarregar();
   a01.agua();
   a01.marca();       */


   Arma02 a02 = new Arma02(); 
 
   a02.tempoRecarga = 5;
   a02.qtdetiros = 9;
   a02.recarga = 36;
   a02.recarregar();
   a02.atirar();
   a02.silenciar();
   a02.marca();

   Arma02 a03 = new Arma02(); 

   a03.tempoRecarga = 7;
   a03.qtdetiros = 9;
   a03.recarga = 22;
   a03.recarregar();
   a03.atirar();
   a03.silenciar();
   a03.marca();





    
}



}
    
