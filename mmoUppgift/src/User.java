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

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Character> getListofCharacters() {
        return ListofCharacters;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setListofCharacters(ArrayList<Character> listofCharacters) {
        ListofCharacters = listofCharacters;
    }
}
