public class Employe {
    int id;
    String nom;
    String adress;
    int nbr_heures;

    Employe(){}


    Employe(int id,String nom,String adress,int nbr_heures){
        this.id=id;
        this.nom=nom;
        this.adress=adress;
        this.nbr_heures=nbr_heures;
    }

    public double salary(int maxHours, int hourPrice, double hourPricePlus) {
        if (nbr_heures < maxHours) {
            return nbr_heures * hourPrice;
        }

        return hourPrice * maxHours + (nbr_heures - maxHours) * hourPricePlus;
    }





    @Override
    public String toString() {
        return "Employe:" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", adress='" + adress + '\'' +
                ", nbr_heures=" + nbr_heures ;
    }
}

