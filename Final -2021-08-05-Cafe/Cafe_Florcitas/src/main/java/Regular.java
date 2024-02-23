package src.main.java;

public class Regular implements Vaso{

    public int calcularDescuento(int precio_total){

        return (int)(precio_total - precio_total* 0.15);
    }
}
