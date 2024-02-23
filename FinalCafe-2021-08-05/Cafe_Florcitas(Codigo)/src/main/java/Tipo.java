package src.main.java;

public interface Tipo {

    static final int PRECIO = 100; // se puede atributos en una interfas?

    public default int CalcularPrecioBase(){

        return 0;
    }
}
