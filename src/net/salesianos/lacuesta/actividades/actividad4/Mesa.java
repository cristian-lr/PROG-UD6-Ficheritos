package net.salesianos.lacuesta.actividades.actividad4;

public class Mesa {
    private String color;
    private int numeroPatas;

    public Mesa(String color,int numeroPatas) {
        this.color = color;
        this.numeroPatas=numeroPatas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    @Override
    public String toString() {
        return "La mesa es de color "+this.color+" y tiene "+numeroPatas+
                "número de patas";
    }
}
