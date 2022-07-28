import java.io.IOException;
import java.sql.Date;

public class CrackFB extends Crack {
    public CrackFB() {
    }

    private String PossibleCombination = new String(
            "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPRSTUVXYZ1234567890.:;=+$*<>");
    private long debut;
    private long fin;
    private String foundPassword;

    public void methode(User u) {
        int trouve = 0;
        System.out.println("Searching.......");
        debut = System.currentTimeMillis();
        for (int i = 0; i < PossibleCombination.length(); i++) {

            foundPassword = Character.toString(PossibleCombination.charAt(i));
            try {
                if (u.Authentified(foundPassword)) {
                    trouve = 1;
                    break;
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if (trouve == 0) {
            for (int i = 0; i < PossibleCombination.length(); i++) {
                for (int j = 0; j < PossibleCombination.length(); j++) {
                    foundPassword = Character.toString(PossibleCombination.charAt(i))
                            .concat(Character.toString(PossibleCombination.charAt(j)));
                    try {
                        if (u.Authentified(foundPassword)) {
                            trouve = 1;
                            break;
                        }
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                if (trouve == 1)
                    break;

            }
        }

        if (trouve == 0) {
            for (int i = 0; i < PossibleCombination.length(); i++) {
                for (int j = 0; j < PossibleCombination.length(); j++) {
                    for (int k = 0; k < PossibleCombination.length(); k++) {
                        foundPassword = Character.toString(PossibleCombination.charAt(i))
                                .concat(Character.toString(PossibleCombination.charAt(j)))
                                .concat(Character.toString(PossibleCombination.charAt(k)));
                        try {
                            if (u.Authentified(foundPassword)) {
                                trouve = 1;
                                break;
                            }
                        } catch (IOException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    }
                    if (trouve == 1)
                        break;
                }
                if (trouve == 1)
                    break;

            }

        }
        if (trouve == 0) {
            for (int i = 0; i < PossibleCombination.length(); i++) {
                for (int j = 0; j < PossibleCombination.length(); j++) {
                    for (int k = 0; k < PossibleCombination.length(); k++) {
                        for (int l = 0; l < PossibleCombination.length(); l++) {
                            foundPassword = Character.toString(PossibleCombination.charAt(i))
                                    .concat(Character.toString(PossibleCombination.charAt(j)))
                                    .concat(Character.toString(PossibleCombination.charAt(k)))
                                    .concat(Character.toString(PossibleCombination.charAt(l)));
                            try {
                                if (u.Authentified(foundPassword)) {
                                    trouve = 1;
                                    break;
                                }
                            } catch (IOException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }
                        }
                        if (trouve == 1)
                            break;
                    }
                    if (trouve == 1)
                        break;

                }
                if (trouve == 1)
                    break;

            }
        }
        if (trouve == 0) {
            for (int i = 0; i < PossibleCombination.length(); i++) {
                for (int j = 0; j < PossibleCombination.length(); j++) {
                    for (int k = 0; k < PossibleCombination.length(); k++) {
                        for (int l = 0; l < PossibleCombination.length(); l++) {
                            for (int m = 0; m < PossibleCombination.length(); m++) {
                                foundPassword = Character.toString(PossibleCombination.charAt(i))
                                        .concat(Character.toString(PossibleCombination.charAt(j)))
                                        .concat(Character.toString(PossibleCombination.charAt(k)))
                                        .concat(Character.toString(PossibleCombination.charAt(l)))
                                        .concat(Character.toString(PossibleCombination.charAt(m)));
                                try {
                                    if (u.Authentified(foundPassword)) {
                                        trouve = 1;
                                        break;
                                    }
                                } catch (IOException e) {
                                    // TODO Auto-generated catch block
                                    e.printStackTrace();
                                }
                            }
                            if (trouve == 1)
                                break;
                        }
                        if (trouve == 1)
                            break;

                    }
                    if (trouve == 1)
                        break;

                }
                if (trouve == 1)
                    break;
            }
        }
        if (trouve == 0) {
            for (int i = 0; i < PossibleCombination.length(); i++) {
                for (int j = 0; j < PossibleCombination.length(); j++) {
                    for (int k = 0; k < PossibleCombination.length(); k++) {
                        for (int l = 0; l < PossibleCombination.length(); l++) {
                            for (int m = 0; m < PossibleCombination.length(); m++) {
                                for (int n = 0; n < PossibleCombination.length(); n++) {

                                    foundPassword = Character.toString(PossibleCombination.charAt(i))
                                            .concat(Character.toString(PossibleCombination.charAt(j)))
                                            .concat(Character.toString(PossibleCombination.charAt(k)))
                                            .concat(Character.toString(PossibleCombination.charAt(l)))
                                            .concat(Character.toString(PossibleCombination.charAt(m)))
                                            .concat(Character.toString(PossibleCombination.charAt(n)));
                                    try {
                                        if (u.Authentified(foundPassword)) {
                                            trouve = 1;
                                            break;
                                        }
                                    } catch (IOException e) {
                                        // TODO Auto-generated catch block
                                        e.printStackTrace();
                                    }
                                }
                                if (trouve == 1)
                                    break;
                            }
                            if (trouve == 1)
                                break;

                        }
                        if (trouve == 1)
                            break;

                    }
                    if (trouve == 1)
                        break;
                }
                if (trouve == 1)
                    break;
            }
        }
        fin = System.currentTimeMillis();
        long duree = fin - debut;
        float second = (float) duree / 1000;
        System.out.println("Votre password est  :" + foundPassword);
        System.out.println("Temps ecoule :" + second);

    }
}