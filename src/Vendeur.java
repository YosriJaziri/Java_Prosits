public class Vendeur extends Employe{
    double tauxVente;
    final int FIXED_VALUE = 450;

    public Vendeur(int id, String nom, String adress, int nbr_heures, double tauxVente) {
        super(id, nom, adress, nbr_heures);
        this.tauxVente=tauxVente;
    }


    public Double salary(){
        return (FIXED_VALUE * (tauxVente/100));
    }
    @Override
    public String toString() {
        return super.toString() +" , "+
                "tauxVente=" + tauxVente;
    }
}
