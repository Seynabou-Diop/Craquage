import java.util.*;
import java.io.FileNotFoundException;
public class TestFB{
     

    public static void main(String[] args) throws FileNotFoundException {
        Cracker crackfb;
        String  login;
        String pwd;
        int choix;
   
        User u;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Veuillez entrer votre login :");
            login = sc.nextLine();
            System.out.println("Veuillez entrer votre mot de passe :");
            pwd = sc.nextLine();
            u = new User(login,pwd);
     
            System.out.println("Voulez vous attaquer par force brute ou par Dictionaire ? ");
            System.out.println("Menu");
            System.out.println("1-Tapez 1 pour Force Brute");
            System.out.println("2-Tapez 2 pour Dictionnaire");
            choix = sc.nextInt();
        }
        if(choix==1){
            crackfb=FactoryCracker.getInstance("ForceBrute");
            crackfb.cracker(u);

        }
        if (choix==2) {
            crackfb=FactoryCracker.getInstance("Dictionary");
            crackfb.cracker(u);
        }
        
    }
}