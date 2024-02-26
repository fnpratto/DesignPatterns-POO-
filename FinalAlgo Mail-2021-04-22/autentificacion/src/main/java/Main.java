package src.main.java;

public class Main {
    public static void main(String[] args) {
       Mail mail = new Mail(true);

        DecoratorChequeo DecoratorChequeo = null;
        new mecaAutenticacion(DecoratorChequeo);

        boolean autentificacion = mecaAutenticacion.autentificacion(mail);


    }
}
