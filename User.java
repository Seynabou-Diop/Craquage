public class User{
    private String login;
    private String motdePasse;

    public String getLogin(){return this.login;}
    public String getPassword(){return this.motdePasse;}
    public void setLogin(String p_login){this.login=p_login;}
    public void setMotdePasse(String p_motDePasse){this.motdePasse=p_motDePasse;}


    public User(String log, String pwd){
        this.login=log;
        this.motdePasse=pwd;
    }

    public boolean VerifiermotdePasse(String password){
        if(password.equals(motdePasse)) return true;
        else return false;

    }
   
}
