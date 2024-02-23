package src.main.java;

public class Normal implements Opcional{

    public int CalcularprecioOpcional(){

        Cafe coffee = new Cafe(new Latte(new Grande(), new FoamArtPrincipante()), new Ecologico());

        return coffee.CalcularCafe();
    }
}
