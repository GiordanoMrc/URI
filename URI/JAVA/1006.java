import java.io.IOException;
import java.util.*;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A, B, C, MEDIA;
        A = sc.nextDouble();
        B= sc.nextDouble();
        C= sc.nextDouble();
        sc.close();
        MEDIA= ((A*2)+(B*3)+(C*5))/10;
        System.out.printf("MEDIA = %.1f\n", MEDIA);
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
    }
}