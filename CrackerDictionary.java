import java.util.*;
import java.io.*;
import java.sql.Timestamp;
public class CrackerDictionary extends Cracker{

    public CrackerDictionary (){}

    @Override
    public void cracker(User u) throws FileNotFoundException {
        System.out.println("Detection en cours ...");
        long tempsDebut=System.currentTimeMillis();
        File doc = new File("//home//zeynab//design-pattern//Factory//Cracker//mydico.txt");

        try (Scanner obj = new Scanner(doc)) {
            while(obj.hasNextLine()){
                String LineDoc = obj.nextLine();
                if (u.VerifiermotdePasse(LineDoc)) {
                    long tempsFin = System.currentTimeMillis();
                    Timestamp tmp = new Timestamp(tempsFin-tempsDebut);
                    System.out.println("Le mot de passe est : " +LineDoc+" trouvé en "+tmp.getHours()+"heures "+tmp.getMinutes()+" minutes et "+tmp.getSeconds()+"secondes");
                    return;
                }

            }
            System.out.println("Votre mot de passe n'a pas pu etre trouvé");
        }

        

        /*try {
            String fileName = "mydico.txt";
            Scanner scan;
            long tempsDebut=System.currentTimeMillis();
            scan = new Scanner(new File(fileName));
            while(scan.hasNextLine()){
                String ligne = scan.nextLine();
                if (u.VerifiermotdePasse(ligne)) {
                    long tempsFin = System.currentTimeMillis();
                    System.out.println("Le mot de passe:" +ligne);
                    return;
                }
            }
            System.out.println("Votre mot de passe n'a pas pu etre trouvé");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }
    */
}
}