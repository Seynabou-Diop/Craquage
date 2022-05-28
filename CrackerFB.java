import java.sql.Timestamp;
public class CrackerFB extends Cracker{
    private String tableauChar ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890&é()-è_çà@*$ù!";
    private char [] motdePasseGenere=new char [8];
    private boolean trouve=false;
    private String vraiPassword;
    
    

    public CrackerFB() {
    }


    public void cracker(User u){

        long tempsDebut = System.currentTimeMillis();
        System.out.println("Detection en cours ...");
        for(int i=0;i<tableauChar.length();i++){
            if(trouve==true) break;
            
            motdePasseGenere[0] = tableauChar.charAt(i);

            for(int j=0;j<tableauChar.length();j++){
                if(trouve==true)
                break;
                motdePasseGenere[1]=tableauChar.charAt(j);
                String chaine1=new String(motdePasseGenere,0,2);
                if(u.VerifiermotdePasse(chaine1)){ 
                    trouve=true;
                    vraiPassword=chaine1;
                }
                
            
             for(int k=0;k<tableauChar.length();k++){
                if(trouve==true)
                break;
                motdePasseGenere[2] = tableauChar.charAt(k);
                String chaine2=new String(motdePasseGenere,0,3);

                if(u.VerifiermotdePasse(chaine2)){ 
                    trouve=true;
                    vraiPassword=chaine2;
                }
                
            
              for(int l=0;l<tableauChar.length();l++){
                if(trouve==true) break;
                
                motdePasseGenere[3] = tableauChar.charAt(l);
                String chaine3=new String(motdePasseGenere,0,4);

                if(u.VerifiermotdePasse(chaine3)){ 
                    trouve=true;
                    vraiPassword=chaine3;
                }
                
                for(int m=0;m<tableauChar.length();m++){
                    if(trouve==true) break;
                    
                    motdePasseGenere[4] = tableauChar.charAt(m);
                    String chaine4=new String(motdePasseGenere,0,5);
    
                    if(u.VerifiermotdePasse(chaine4)){ 
                        trouve=true;
                        vraiPassword=chaine4;
                    }
                    

                    for(int n=0;n<tableauChar.length();n++){
                        if(trouve==true)
                        break;
                        motdePasseGenere[5] = tableauChar.charAt(n);
                        String chaine5=new String(motdePasseGenere,0,6);
        
                        if(u.VerifiermotdePasse(chaine5)){ 
                            trouve=true;
                            vraiPassword=chaine5;
                        } 
                        for(int o=0;o<tableauChar.length();o++){
                            if(trouve==true)
                            break;
                            motdePasseGenere[6] = tableauChar.charAt(o);
                            String chaine6=new String(motdePasseGenere,0,7);
            
                            if(u.VerifiermotdePasse(chaine6)){ 
                                trouve=true;
                                vraiPassword=chaine6;
                               } 
                        }


                    }
                }
             }     

             }
            } 
        }
        if(trouve){
        long tempsFin = System.currentTimeMillis();
        Timestamp tmp = new Timestamp(tempsFin-tempsDebut);
      System.out.println("Votre mot de passe est : "+vraiPassword+" trouvé en "+tmp.getHours()+" heures " +tmp.getMinutes()+ " Minutes"+tmp.getSeconds()+ " secondes. ");
        }
        else{
            System.out.println("Mot de passe non trouvé!");
        }
    }

    
        
      
}



    
    


    