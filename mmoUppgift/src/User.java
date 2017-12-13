import java.util.ArrayList;

public class User {
    private String Username;
    private String Password;
    private String email;
    private ArrayList<Character> ListofCharacters;


    public User(String Username, String Password, String email){
        this.Username = Username;
        this.Password = Password;
        this.email = email;
        this.ListofCharacters = new ArrayList<>();
    }



}
