package Strategy;

public class Espece implements Paiement {
      public Espece () {
    	
      }
	@Override
	public double payer(double montant) {
		// TODO Auto-generated method stub
		System.out.println("La somme de "+montant+" vient d'être reglé en espece");
		
		return montant;
	}
}
