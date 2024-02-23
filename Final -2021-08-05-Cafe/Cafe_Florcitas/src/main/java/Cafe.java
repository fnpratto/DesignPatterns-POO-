package src.main.java;

public class Cafe {

    private Tipo tipo;
    private Vaso vaso;

    //consturctor
    public Cafe(Tipo tipo ,Vaso vaso){
        this.tipo = tipo;
        this.vaso = vaso;
    }

    public int CalcularCafe (){

        int precioTotal = 0;

        precioTotal = this.tipo.CalcularPrecioBase();

        precioTotal = this.vaso.calcularDescuento(precioTotal);

        return precioTotal;
    }


}
