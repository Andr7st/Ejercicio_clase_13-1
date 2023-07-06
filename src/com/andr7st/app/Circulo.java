package com.andr7st.app;

import java.util.Scanner;

public class Circulo extends Figura {
    private float radio;

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    /**
     * <>Calcular Área</>
     * La fórmula para calcular el área de un círculo:
     * multiplicar el valor de PI por el radio al cuadrado.
     * */
    public double calculateArea() {
        return (Math.PI * Math.pow(radio, 2));
    }

    public void loadData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la area del circulo en cm: ");
        radio = (float) scanner.nextDouble();

        scanner.close();
    }
}
