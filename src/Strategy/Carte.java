package Strategy;

public class Carte implements Paiement {

    private String numCarte;
    private int cryptogramme;
  private   String dateExpiration;

public Carte(String numCarte, int cryptogramme,String dateExpiration) {
	   super();
	   this.cryptogramme = cryptogramme;
	   this.numCarte = numCarte;
	   this.dateExpiration = dateExpiration;
}

public double payer(double montant) {
	// TODO Auto-generated method stub
	System.out.println("La somme de "+montant+" £ vient d'etre reglé par Carte Bancaire");
	return montant;
}

}
