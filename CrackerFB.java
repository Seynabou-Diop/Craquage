import java.sql.Timestamp;
public class CrackerFB extends Cracker{
    private String tableauChar = new String ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890&é()-è_çà@*$ù!><");
    private boolean trouve=false;
    private String vraiPassword;
    
    

    public CrackerFB() {
    }


    public void cracker(User u){

        long tempsDebut = System.currentTimeMillis();
        System.out.println("Detection en cours ...");
        for(int i=0;i<tableauChar.length();i++){
            
            vraiPassword=Character.toString(tableauChar.charAt(i));
            if (u.VerifiermotdePasse(vraiPassword)) {
                trouve=true;
                break;
            }
        }
        if (trouve==false){ 
            
        
            for(int j=0;j<tableauChar.length();j++){
                for (int i = 0; i < tableauChar.length(); i++) {
                    vraiPassword=Character.toString(tableauChar.charAt(j)).concat(Character.toString(tableauChar.charAt(i)));
                
                if(u.VerifiermotdePasse(vraiPassword)) {
                    trouve=true;
                    break;
                }
            }
            if(trouve==true) break;
            }
        }
        if(trouve==false){
            for(int i=0;i<tableauChar.length();i++){
                for(int j=0;j<tableauChar.length();j++){
                    for(int k=0;k<tableauChar.length();k++){
                        vraiPassword=Character.toString(tableauChar.charAt(i)).concat(Character.toString(tableauChar.charAt(j))).concat(Character.toString(tableauChar.charAt(k)));
                        if(u.VerifiermotdePasse(vraiPassword)){
                           trouve=true;
                           break;
                         }
                     }
                    if(trouve==true) break;
                }
                if(trouve==true) break;

            }
            
        }
        if(trouve==false){
            for(int i=0;i<tableauChar.length();i++){
                for(int j=0;j<tableauChar.length();j++){
                    for(int k=0;k<tableauChar.length();k++){
                        for(int l=0;l<tableauChar.length();l++){
                            vraiPassword=Character.toString(tableauChar.charAt(i)).concat(Character.toString(tableauChar.charAt(j))).concat(Character.toString(tableauChar.charAt(k))).concat(Character.toString(tableauChar.charAt(l)));
                             if(u.VerifiermotdePasse(vraiPassword)){
                                trouve=true;
                                break;
                             }
                         }
                         if(trouve==true) break;
                     }
                     if(trouve==true) break;

                }
                if(trouve==true) break;
            
            }
        }  
         if(trouve==false){
            for(int i=0;i<tableauChar.length();i++){
                for(int j=0;j<tableauChar.length();j++){
                    for(int k=0;k<tableauChar.length();k++){
                        for(int l=0;l<tableauChar.length();l++){
                            for(int m=0;m<tableauChar.length();m++){
                                vraiPassword=Character.toString(tableauChar.charAt(i)).concat(Character.toString(tableauChar.charAt(j))).concat(Character.toString(tableauChar.charAt(k))).concat(Character.toString(tableauChar.charAt(l))).concat(Character.toString(tableauChar.charAt(m)));
                                 if(u.VerifiermotdePasse(vraiPassword)){
                                     trouve=true;
                                     break;
                                 }
                             }
                            if(trouve==true) break;
                         }
                         if(trouve==true) break;

                    }
                    if(trouve==true) break;
            
                }
                if(trouve==true) break;
            } 
         } 
         if(trouve==false){
            for(int i=0;i<tableauChar.length();i++){
                for(int j=0;j<tableauChar.length();j++){
                    for(int k=0;k<tableauChar.length();k++){
                        for(int l=0;l<tableauChar.length();l++){
                            for(int m=0;m<tableauChar.length();m++){
                                for(int n=0;n<tableauChar.length();n++){
                                
                                    vraiPassword=Character.toString(tableauChar.charAt(i)).concat(Character.toString(tableauChar.charAt(j))).concat(Character.toString(tableauChar.charAt(k))).concat(Character.toString(tableauChar.charAt(l))).concat(Character.toString(tableauChar.charAt(m))).concat(Character.toString(tableauChar.charAt(n)));
                                    if(u.VerifiermotdePasse(vraiPassword)){
                                       trouve=true;
                                       break;
                                     }
                                 }
                                 if(trouve==true) break;
                                }
                                if(trouve==true) break;

                            }
                            if(trouve==true) break;
            
                        }
                       if(trouve==true) break;
                    }
                    if(trouve==true) break;
                } 
         }

            
        if(trouve){
        long tempsFin = System.currentTimeMillis();
        Timestamp tmp = new Timestamp(tempsFin-tempsDebut);
      System.out.println("Votre mot de passe est : "+vraiPassword+" trouvé en "+tmp.getHours()+" heures " +tmp.getMinutes()+ " Minutes"+tmp.getSeconds()+ " secondes. ");
        }
        
    }

    
        
      
}



    
    


    