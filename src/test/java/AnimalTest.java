import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    Animal katze;
    Animal hund;
    Animal löwe;

    @BeforeEach
    void setUp() {
        katze = new Animal("Schnurli",1,"Katze","Miau");
        hund = new Animal("Blacky",3, "Hund", "Wuff");
        löwe = new Animal("King", 5, "Löwe", "Roarr");

    }

    @Test
    void giveAnimalLoud() {
        assertEquals("Miau", katze.giveAnimalLoud());
        assertEquals("Wuff", hund.giveAnimalLoud());
        assertEquals("Roarr", löwe.giveAnimalLoud());
    }

    @Test
    void getNameAndAge() {
        assertEquals("Schnurli" + 1, katze.getNameAndAge());
        assertEquals("Blacky"+ 3, hund.getNameAndAge());
        assertEquals("King" +5, löwe.getNameAndAge());

    }

    @Test
    void ageCategory() {
        assertEquals("baby animal", katze.ageCategory(1));
        assertEquals("young animal", hund.ageCategory(3));
        assertEquals("old animal", löwe.ageCategory(5));
    }
}