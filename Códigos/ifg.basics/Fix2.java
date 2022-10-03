import java.util.Locale;

public class Fix2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("*** Cálculo Trapézio ***");
        
        System.out.println("\nUsando float ");
        float b, B, h, area;
        b = 6f;
        B = 8f;
        h = 5f;
        area = (b + B) / 2f * h;
        System.out.println(area);

        System.out.println("\nUsando double ");
        double p, P, a, arT;
        p = 6.0;
        P = 8.0;
        a = 5.0;
        arT = (p + P) / 2.0 * a;
        System.out.println(arT);

    }
}
