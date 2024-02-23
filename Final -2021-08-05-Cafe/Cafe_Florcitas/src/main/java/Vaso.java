package src.main.java;

public interface Vaso {

    public default int calcularDescuento(int precio_total){

        return 0;
    }
}
