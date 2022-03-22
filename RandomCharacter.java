import java.util.Random;

public class RandomCharacter {
    Random r = new Random();

    public char getRandomLowerCaseLetter(){
        return (char)('a' + Math.random() * 26);
    }

    public char getRandomUpperCaseLetter(){
        return (char)('A' + Math.random() * 26);
    }

    public char getRandomDigitCharacter(){
        return Character.forDigit(r.nextInt(10),10);
    }

    public char getRandomCharacter(){
        return (char)(r.nextInt(95) + 32);
    }

    public static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
  
        for (int i = 2; i < n/2; i++)
            if (n % i == 0)
                return false;
  
        return true;
    }

    public int getPrime(){
        int x = r.nextInt(100) + 1;

        while (!isPrime(x)) {
            x = r.nextInt(100) + 1;
        }
        return x;
    }
    
    public static void main(String[] args) {
        RandomCharacter random = new RandomCharacter();

        System.out.println("Lower Case Letters: ");
        for(int i=0;i<15;i++){
            System.out.print(random.getRandomLowerCaseLetter() + " ");
        }

        System.out.println("\nUpper Case Letters: ");
        for(int i=0;i<15;i++){
            System.out.print(random.getRandomUpperCaseLetter() + " ");
        }

        System.out.println("\nDigit Characters: ");
        for(int i=0;i<15;i++){
            System.out.print(random.getRandomDigitCharacter() + " ");
        }

        System.out.println("\nRandom Characters: ");
        for(int i=0;i<15;i++){
            System.out.print(random.getRandomCharacter() + " ");
        }

        System.out.println("\nPrime Numbers: ");
        for(int i=0;i<15;i++){
            System.out.print(random.getPrime() + " ");
        }

    }
}
