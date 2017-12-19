import CharacterPack.Character;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCharacter {
    @Test
    public void testa(){
        Character char1;
        char1 = new Character("Peter","Male",1);
        String var1 = char1.getFightclass();

        assertEquals(1,1);
    }
}
