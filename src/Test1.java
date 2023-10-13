import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Produit m0= new Produit();
        Produit m1= new Produit(1021,"Lait","délice");
        Produit m2= new Produit(2510,"Yaourt","vitalait");
        Produit m3= new Produit(3250,"Tomate","Sicam",1200);
        System.out.println("_______________________");
        m0.afficher();
        System.out.println("_______________________");
        m1.afficher();
        System.out.println("_______________________");
        m2.afficher();
        System.out.println("_______________________");
        m3.afficher();
        System.out.println("_______________________");

        m1.price=0.7F;
        m1.afficher();
        System.out.println("_______________________");
        String stm1= m1.toString();
        String stm2= m2.toString();
        String stm3= m3.toString();
        System.out.println(stm1);
        System.out.println(stm2);
        System.out.println(stm3);
        System.out.println("_______________________");


        // prosit4 //



        Magasin mg1 = new Magasin(1,"Carrefour","Centre ville");
        Magasin mg2 = new Magasin(2,"Monoprix","Menzah 6");
        System.out.println("_______________________");

        Caissier C1 = new Caissier(1,"Mohamed","adress1",40,1);
        Caissier C2 = new Caissier(2,"Salah","adress2",50,2);
        Responsable R1 = new Responsable(3,"Ali","adress3",60,400);

        Caissier C3 = new Caissier(4,"Bahri","adress4",70,3);
        Vendeur V1 = new Vendeur(5,"Aymen","adress5",80,20);
        Vendeur V2 = new Vendeur(6,"Wassim","adress6",90,15);
        Vendeur V3 = new Vendeur(7,"Ahmed","adress7",100,10);
        Responsable R2 = new Responsable(8,"Yassine","adress8",110,100);

        mg1.ajouterEmploye(C1);
        mg1.ajouterEmploye(C2);
        mg1.ajouterEmploye(R1);

        mg2.ajouterEmploye(C3);
        mg2.ajouterEmploye(V1);
        mg2.ajouterEmploye(V2);
        mg2.ajouterEmploye(V3);
        mg2.ajouterEmploye(R2);


        mg1.AddProduit(m1);
        mg1.AddProduit(m2);

        mg2.AddProduit(m3);
        mg2.AddProduit(m2);
        System.out.println(C1);
        System.out.println("_______________________");
        System.out.println(R1);
        System.out.println("_______________________");
        System.out.println(V1);
        mg1.afficherDetails();
    }

}
