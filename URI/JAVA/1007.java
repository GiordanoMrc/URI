import java.io.IOException;
import java.util.*;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int A, B, C,D, DIF;
        A = sc.nextInt();
        B= sc.nextInt();
        C= sc.nextInt();
        D= sc.nextInt();
        sc.close();
        DIF= ((A * B) - (C * D));
        System.out.printf("DIFERENCA = %d\n", DIF);
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
    }
}