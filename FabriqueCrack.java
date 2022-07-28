public class FabriqueCrack {

    public static Crack getInstance(String type) {
        Crack craque = null;
        if (type.equalsIgnoreCase("Forcebrute")) {
            craque = new CrackFB();
        } else if (type.equalsIgnoreCase("Dictionnaire")) {
            craque = new CrackDictionnaire();

        } else {
            System.out.println("Choix non disponible!!!!!");
        }
        return craque;
    }
}