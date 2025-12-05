package co.edu.poli.electrodomesticos;

/**
 *
 * @author SALON206
 */
public class ElectrodomesticosMain {

    public static void main(String[] args) {
      Electrodomestico[]electrodomesticos = new Electrodomestico[3];
      electrodomesticos[0] = new Lavadora ();
      electrodomesticos[1] = new Lavadora (150, 10);
      electrodomesticos [2] = new Television ();
      electrodomesticos [3] = new Television(20, 10 );
       
      for(Electrodomestico e : electrodomesticos){
          System.out.println("Electrodomestico : "+e.getConsumoEnergetico());
          
            
      }
              
     
      
    }
}
