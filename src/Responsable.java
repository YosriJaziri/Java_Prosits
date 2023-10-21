public class Responsable extends Employe{
    private float prime;
    final int HOUR_PRICE = 10;
    final int HOUR_PRICE_PLUS = 12;
    final int MAX_HOURS = 160;


    public Responsable(int id, String nom, String adress, int nbr_heures, float prime) {
        super(id, nom, adress, nbr_heures);
        this.prime=prime;
    }


    public float salary() {
        if (nbr_heures<=160){
            return nbr_heures * 10 + prime;
        }
        return (160 * 10 + (nbr_heures - 160)*12);
    }

    @Override
    public String toString() {
        return super.toString() +" , "+
                "prime=" + prime;
    }
}
