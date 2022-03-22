import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RandomCharacterTest {
	RandomCharacter randomChar;

	@Before
	public void setUp() throws Exception {
        System.out.println("Set up");
        randomChar = new RandomCharacter();
	}

	@After
	public void tearDown() throws Exception {
        System.out.println("Tear down");
	}
	@Test
    public void testGetRandomLowerCaseLetter() {
        char output = randomChar.getRandomLowerCaseLetter();
        assertTrue(Character.isLowerCase(output));
    }

    @Test
    public void testGetRandomUpperCaseLetter() {
        char output = randomChar.getRandomUpperCaseLetter();
        assertTrue(Character.isUpperCase(output));
    }

	@Test
    public void testGetRandomDigitCharacter() {
        char output = randomChar.getRandomDigitCharacter();
        assertTrue(Character.isDigit(output));
    }

    @Test
    public void testGetRandomCharacter() {
        char output = randomChar.getRandomCharacter();
        assertTrue(Character.isLetterOrDigit(output));
    }

    @Test
    public void testGetPrimeNumber(){
        int output = randomChar.getPrime();
        boolean flag = false;
        for (int i = 2; i <= output/2 ; ++i)  {
            if (output % i == 0) {
                flag = true;
                break;
            }
        }
        assertTrue(!flag);
    }
	
}
