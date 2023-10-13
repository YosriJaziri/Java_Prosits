public class Produit{
    int id;
    String lib,marque;
    float price;

    public Produit() {

    }



    public Produit(int id,String lib,String marque) {

        this.id=id;
        this.lib=lib;
        this.marque=marque;
    }



    public Produit(int id,String lib,String marque,float price) {

        this.id=id;
        this.lib=lib;
        this.marque=marque;
        this.price=price;
    }
    public void afficher(){
        System.out.println(id);
        System.out.println(lib);
        System.out.println(marque);
        System.out.println(price);

    }


    public boolean compare(Produit p1){
        return (this.id==p1.id && this.lib.equals(p1.lib)&& this.price==p1.price);
    }

    public boolean compare(Produit p1,Produit p2){
        return (p2.id==p1.id && p2.lib.equals(p1.lib)&& p2.price==p1.price);
    }

    @Override
    public String toString(){
        return(" id :" + id +" lib: " +lib+" marque :"+marque+" price :"+price);
    }








}
