public class Vendeur extends Employe{
    private float tauxVente;
    final int FIXED_VALUE = 450;

    public Vendeur(int id, String nom, String adress, int nbr_heures, float tauxVente) {
        super(id, nom, adress, nbr_heures);
        this.tauxVente=tauxVente;
    }


    public float salary(){
        return (FIXED_VALUE * (tauxVente/100));
    }
    @Override
    public String toString() {
        return super.toString() +" , "+
                "tauxVente=" + tauxVente;
    }
}
