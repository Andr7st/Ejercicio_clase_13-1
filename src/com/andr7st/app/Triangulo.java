package com.andr7st.app;

public class Triangulo {

    private String colorFondo;
    private double base;
    private double altura;

    public String getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(String colorFondo) {
        this.colorFondo = colorFondo;
    }

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

    /**
     * <>Calcular Area</>
     * Base * Altura / 2
     * */
    public double calculateArea() {
        return base * altura / 2;
    }

}