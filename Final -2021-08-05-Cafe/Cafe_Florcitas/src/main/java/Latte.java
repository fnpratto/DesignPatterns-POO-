package src.main.java;

public class Latte implements Tipo{

    static final int PRECIO = 100;
    private Tamano tamano;
    private Opcional opcional;

    //consturctor
    public Latte(Tamano tamano ,Opcional opcional){
        this.tamano = tamano;
        this.opcional = opcional;
    }

    public int CalcularPrecioBase (){

        return (PRECIO + this.opcional.CalcularprecioOpcional()) * this.tamano.calcularIncrementoDeTamano();
    }
}
