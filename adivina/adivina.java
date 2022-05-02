import java.util.Random;

public class adivina {
    public static void main(String[] args) {
        int a = 22324025;
        int cont = 0;
        long currentToken;
        Random random;
        long time = System.currentTimeMillis();

        int i = 0;
        while (i<180000){
            random = new Random(time - i);
            currentToken = random.nextInt(1_234_000_000);
            if (a == currentToken) {
                cont = cont + 1;
            }
            if (cont == 1) {
                System.out.println(random.nextInt(1_234_000_000));
                System.exit(0);
            }
            i ++;
        }
    }
}
