package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

    private RomanNumeral roman;

    @BeforeEach
    public void initialize() {
        System.out.println("This method is called before each test\n");
    }



    @Test
    public void singleNumber() {
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithManyDigits() {
        int result = roman.convert("VIII");
        Assertions.assertEquals("8",result);
    }

    @Test
    public void withSubstractiveNotation() {
        int result = roman.convert("IV");
        Assertions.assertEquals("4", result);
    }

    @Test
    public void numberWithAndWithoutSubstractiveNotation() {
        int result = roman.convert("XLIV");
        Assertions.assertEquals("44", result);
    }


}