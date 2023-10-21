public class Caissier extends Employe{
    private numCaisse;
    final int HOUR_PRICE = 5;
    final double HOUR_PRICE_PLUS = 5.75;
    final int MAX_HOURS = 180;
    public Caissier(int id, String nom, String adress, int nbr_heures, int numCaisse) {
        super(id, nom, adress, nbr_heures);
        this.numCaisse=numCaisse;
    }

    public float salary() {
        if (nbr_heures<=180){
            return nbr_heures * 5 ;
        }
        return (180 * 5 + (nbr_heures - 180)* 5,75);
    }



    @Override
    public String toString() {
        return super.toString() +" , "+
                "numCaisse=" + numCaisse;
    }
}
