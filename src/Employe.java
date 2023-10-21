public abstract class Employe {
    protected int id;
    protected String nom;
    protected String adress;
    protected float nbr_heures;

    Employe(){}


    public Employe(int id,String nom,String adress,int nbr_heures){
        this.id=id;
        this.nom=nom;
        this.adress=adress;
        this.nbr_heures=nbr_heures;
    }

    public abstract float salary() {
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

