package school.management.system.observateur;

public interface Sujet {

	public void enregisterObservateur(Observateur o);
	public void supprimerObservateur(Observateur o);
	public void notifierObservateur();
}
