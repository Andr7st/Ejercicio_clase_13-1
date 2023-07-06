package com.andr7st.app;

import java.util.Scanner;

public class PoligonoRegular extends Figura {
    protected double base;
    protected double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void loadData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la altura en cm: ");
        this.altura = scanner.nextDouble();
        System.out.print("Ingresa la base en cm: ");
        this.base = scanner.nextDouble();

        //scanner.close();
    }
}
