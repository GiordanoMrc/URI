import java.io.IOException;
import java.util.*;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A, B, MEDIA;
        A = sc.nextDouble();
        B= sc.nextDouble();
        sc.close();
        if(A <=10 && B<= 10 && A >=0 && B>=0){
            MEDIA= ((A*3.5)+(B*7.5))/11;
            System.out.printf("MEDIA = %.5f\n", MEDIA);
        }
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
    }
}