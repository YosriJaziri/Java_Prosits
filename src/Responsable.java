public class Responsable extends Employe{
    double prime;
    final int HOUR_PRICE = 10;
    final int HOUR_PRICE_PLUS = 12;
    final int MAX_HOURS = 160;

    public Responsable(int id, String nom, String adress, int nbr_heures, double prime) {
        super(id, nom, adress, nbr_heures);
        this.prime=prime;
    }


    public double salary() {
        return super.salary(MAX_HOURS, HOUR_PRICE, HOUR_PRICE_PLUS);
    }

    @Override
    public String toString() {
        return super.toString() +" , "+
                "prime=" + prime;
    }
}
