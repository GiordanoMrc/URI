import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double phy = 3.14159;
        double A, R;

        R = sc.nextDouble();
        sc.close();

        A = phy * Math.pow(R, 2); // or R*R

        System.out.printf("A=%.4f\n", A);

    }
}