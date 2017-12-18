import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private String email;
    private ArrayList<Character> listofCharacters;
    private boolean admin;


    public User(String Username, String Password, String email,boolean admin){
        this.username = Username;
        this.password = Password;
        this.email = email;
        this.listofCharacters = new ArrayList<>();
        this.admin = true;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Character> getListofCharacters() {
        return listofCharacters;
    }

    public void setUsername(String username) {
        username = username;
    }

    public void setPassword(String password) {
        password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setListofCharacters(ArrayList<Character> listofCharacters) {
        listofCharacters = listofCharacters;
    }

    public boolean isAdmin() {
        return true;
    }
}

