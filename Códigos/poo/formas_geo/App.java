package poo.formas_geo;

import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(new Locale("en", "US"));
        
        Quadrado q1 = new Quadrado("Quadrado", 15.0, 15.0);
        q1.calcArea();
        q1.calcPerimeter();
        System.out.println(q1.toString());

        Circulo c1 = new Circulo("Círculo", 8.0, 8.0);
        c1.calcArea();
        c1.calcPerimeter();
        System.out.println(c1.toString());

        Triangulo t1 = new Triangulo("Triangulo", 16.0, 12.0);
        t1.calcArea();;
        t1.calcPerimeter();
        System.out.println(t1.toString());

        Cubo cb1 = new Cubo("Cubo", 23.0, 23.0, 23.0);
        cb1.calcArea();
        cb1.calcVolume();
        System.out.println(cb1.toString());

        Esfera es1 = new Esfera("Esfera", 6.8, 6.8, 6.8);
        es1.calcArea();
        es1.calcVolume();
        System.out.println(es1.toString());

        Tetraedro tt1 = new Tetraedro("Tetraedro", 5.6, 7.0, 5.6);
        tt1.calcArea();
        tt1.calcVolume();
        System.out.println(tt1.toString());
    }
}
