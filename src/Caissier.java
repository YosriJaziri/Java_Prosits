public class Caissier extends Employe{
    int numCaisse;
    final int HOUR_PRICE = 5;
    final double HOUR_PRICE_PLUS = 5.75;
    final int MAX_HOURS = 180;
    public Caissier(int id, String nom, String adress, int nbr_heures, int numCaisse) {
        super(id, nom, adress, nbr_heures);
        this.numCaisse=numCaisse;
    }

    public double salary() {
        return super.salary(MAX_HOURS, HOUR_PRICE, HOUR_PRICE_PLUS);
    }



    @Override
    public String toString() {
        return super.toString() +" , "+
                "numCaisse=" + numCaisse;
    }
}
