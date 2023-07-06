package com.andr7st.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Figura> figuraList = new ArrayList<>();

    public static void main(String[] args) {

        boolean showMenu = true;
        do {
            List<String> l = new ArrayList<>();
            l.add("\n ========== MENú ========== ");
            l.add(" ¿Qué figura deseas crear?");
            l.add("   1. Crear una figura.");
            l.add("   2. Mostrar la sumatoria de areas de las figuras.");
            l.add("   0. Salir");
            l.add(" -------------------------------- ");

            l.forEach(System.out::println);

            Scanner scanner = new Scanner(System.in);
            System.out.print("\n  Ingresa tu opción ~$ ");
            int respuestaUsuario = scanner.nextInt();

            switch (respuestaUsuario) {
                default: System.out.println("Selección invalida"); break;
                case 1: { crearFigura(); } break;
                case 2: {

                    allFiguresSummation();

                } break;
                case 0: { showMenu = false; }; break;
            }
        } while (showMenu);

    }

    private static void crearFigura() {
        List<String> l = new ArrayList<>();
        l.add("\n -------------------------------- ");
        l.add(" ¿Qué figura deseas crear?");
        l.add("   1. Circulo.");
        l.add("   2. Cuadrado.");
        l.add("   3. Triangulo.");
        l.add(" -------------------------------- ");

        l.forEach(System.out::println);

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n  Ingresa tu opción ~$ ");
        int respuestaUsuario = scanner.nextInt();

        System.out.println();

        switch (respuestaUsuario) {
            default: System.out.println("Selección invalida - Salir"); break;

            case 1: {
                System.out.println(" -- Opción 2: Crea Circulo -- ");

                Circulo circle1 = new Circulo();
                circle1.loadData();
                double totalArea = circle1.calculateArea();
                System.out.println(" El area total es: " + totalArea);
                figuraList.add(circle1);

            } break;

            case 2: {
                System.out.println(" -- Opción 2: Crea Cuadrado -- ");

                Cuadrado cuadrado = new Cuadrado();
                cuadrado.loadData();
                System.out.println(" El area total es " + cuadrado.calculateArea() + " centimetros.");
                figuraList.add(cuadrado);
            } break;

            case 3: {
                System.out.println(" -- Opción 3: Crea Triangulo -- ");

                Triangulo triangulo = new Triangulo();
                triangulo.loadData();
                System.out.println(" El area total es " + triangulo.calculateArea() + " centimetros.");
                figuraList.add(triangulo);
            } break;
        }
        //- scanner.close();
    }

    /**
     * <h3>Sumatoria de todas las figuras</h3>
     * <h2>retorna:</h2> un número 'double' con la sumatoria de todas las figuras.'
     * */
    public static void allFiguresSummation() {

        double sumatoriaAreas = 0;

        for (Figura f: figuraList) {
            f.calculateArea();
        }

//        figuraList.forEach(item -> {
//           sumatoriaAreas += item.calculateArea();
//        });

        //return sumatoriaAreas;

      //  System.out.println(" La sumatoria total las figuras es " + allFiguresSummation() + " cm." );
        System.out.println(" La sumatoria total las figuras es " + sumatoriaAreas + " cm." );


    }

}
