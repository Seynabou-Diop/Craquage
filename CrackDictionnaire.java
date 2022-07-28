import java.util.*;
import java.io.*;

public class CrackDictionnaire extends Crack {
    private long debut;
    private long fin;

    public CrackDictionnaire() {
    }

    @Override
    public void methode(User u) throws FileNotFoundException  {
        System.out.println("Searching .............");
        debut = System.currentTimeMillis();
        File documente = new File("//home//matymboup//Bureau//TpPattern//Tp3//docCrak.txt");
        try (Scanner password = new Scanner(documente)) {
            while (password.hasNextLine()) {
                String line = password.nextLine();
                try {
                    if (u.Authentified(line)) {
                        fin = System.currentTimeMillis();
                        long duree = fin - debut;
                        float second = (float) duree / 1000;
                        System.out.println("password found : " + line);
                        System.out.println("Temps ecoule :" + second);
                        return;

                    }
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            System.out.println("Mot de pass not found");
        }

    }
}
