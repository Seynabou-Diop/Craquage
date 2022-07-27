import java.lang.*;
public class FactoryCracker{

    public static Cracker getInstance(String modeCracker) {
        Cracker crack = null;
        if(modeCracker.equalsIgnoreCase("ForceBrute")){
            crack = new CrackerFB();
        }
        else if(modeCracker.equalsIgnoreCase("Dictionary")){
            crack = new CrackerDictionary();
        }
        
        return crack;
    }
}