package com.andr7st.app;

public class Circulo {
    private String ColorFondo;
    private float radio;

    public String getColorFondo() {
        return ColorFondo;
    }

    public void setColorFondo(String colorFondo) {
        ColorFondo = colorFondo;
    }

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
}
