import java.util.Arrays;

public class Magasin {
    int id;
    String adress;
    int cap;

    String nom;

    Produit[] prod;

    Employe[] employe;

    final int Max_cap=50;

    final int Max_emp=20;

    Magasin(){
        this.prod= new Produit[Max_cap];
        this.employe= new Employe[Max_emp];
    }

    Magasin(int id, String adress, int cap){
        this.id=id;
        this.adress=adress;
        this.cap=cap;
        this.prod= new Produit[Max_cap];

    }
    Magasin(int id, String nom, String adress){
        this.id=id;
        this.adress=adress;
        this.nom=nom;
        this.employe= new Employe[Max_emp];
        this.prod= new Produit[Max_cap];


    }








    public boolean Recherche(Produit P){
        for(int i=0; i<this.cap;i++){
            if (this.prod[i]!=null){
                if (this.prod[i].compare(P)) {

                    return true;
                }
            }
        }
        return false;

    }



    public boolean AddProduit(Produit p){
        for(int i=0; i<this.cap;i++){
            if(!this.prod[i].compare(p)){
                if (this.prod[i]==null){
                this.prod[i]=p;
                return true;
                }
            }
        }
        return false;
    }

    public boolean delete(Produit P){
        if (!this.Recherche(P)){return false;} //int pos=-1;
        else {/*for(int i=0; i<this.cap;i++){
            if(Recherche(p)){
                pos=i;
                break;} */ }
            for(int i=0; i<this.cap;i++){
                if (this.prod[i]!=null){
                    if (this.prod[i].compare(P)) {
                        this.prod[i]=null;
                        return true;
                    }
                }
            }
            return false;

    }


    public Magasin CompareMagasin(Magasin M1,Magasin M2){
        int nbPM1=0;
        int nbPM2=0;

        for(int i=0; i<M1.cap;i++){
            if(M1.prod[i]!=null){
                nbPM1++;
            }
        }

        for(int i=0; i<M2.cap;i++){
            if(M2.prod[i]!=null){
                nbPM2++;
            }
        }

        if (nbPM1>nbPM2){
            return M1;
        }
        else {return M2;}
    }



    public boolean ajouterEmploye(Employe emp){
        for (int i=0;i<this.Max_emp;i++){
            if (this.employe[i]==null){
                this.employe[i]=emp;
                return true;
            }
        }
        return false;

    }



    public void afficherDetails() {
        System.out.println("Magasin " + this.id + ": " + this.nom);
        System.out.println("Adresse: " + this.adress);
        System.out.println("Capacité maximale d'employés: " + this.cap);
        System.out.println("Employés:");
        for (Employe employe : this.employe) {
            System.out.println(employe);
        }
        System.out.println("Produits:");
        for (Produit produit : this.prod) {
            System.out.println(produit);
        }
    }





    @Override
    public String toString() {
        return "Magasin{" +
                "id=" + id +
                ", adress='" + adress + '\'' +
                ", cap=" + cap +
                ", prod=" + Arrays.toString(prod) +
                ", Max_cap=" + Max_cap +
                '}';
    }


    //@override
    //public String toString(){
    //String str ="";
    //for(int i=0; i<this.cap;i++){
    //if(this.prod[i]!=null){
    //str +="\n"+ this.prod[i].
    //}
    //}
    //}




}