package com.andr7st.app;

public class Main {

    public static void main(String[] args) {
        
        
        // --- Circulo

        Circulo circle1 = new Circulo();
        circle1.setColorFondo("green");
        circle1.setRadio(5);
        double totalArea = circle1.calculateArea();
        
        Circulo circle2 = new Circulo();
        circle2.setColorFondo("blue");
        circle2.setRadio(7);

        totalArea += circle2.calculateArea();

        System.out.println();
        System.out.println("Area del circulo 1 es " + circle1.calculateArea() + " y color " + circle1.getColorFondo() );
        System.out.println("Area del circulo 2 es " + circle2.calculateArea() + " y color " + circle2.getColorFondo() );
        System.out.println("La sumatoria de areas es: " + totalArea);
        
        
        // --- Triangulo
        
        Triangulo t = new Triangulo();
        t.setBase(10);
        t.setAltura(15);
        t.calculateArea();

        // --- Cuadrado
        Cuadrado c = new Cuadrado();
        c.setBase(10);
        c.setAltura(15);
        c.calculateArea();

    }
}
