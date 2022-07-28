import java.util.*;
import java.io.*;
public class Test{

    public static void main(String[] Args) throws FileNotFoundException{

        Scanner tuto=new Scanner (System.in);
         System.out.println("Quel type d' attack voulez vous procédé:");
          System.out.println("Tapez 1 pour attack par force brute");
           System.out.println("Tapez 2 pour attack par Dictionnaire");
            int choix=tuto.nextInt();
        System.out.println("Connecter vous");
        System.out.println("Saisir votre login");
         String login=tuto.next();
        User moi=new User(login); 
        if(choix==1){
            Crack toi=FabriqueCrack.getInstance("Forcebrute");
            toi.methode(moi);
        }
         else if(choix==2){
            Crack toi=FabriqueCrack.getInstance("Dictionnaire");
            toi.methode(moi);  
         }
        
        

        
    }
}