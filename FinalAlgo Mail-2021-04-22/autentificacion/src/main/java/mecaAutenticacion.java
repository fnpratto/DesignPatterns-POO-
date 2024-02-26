package src.main.java;
import java.util.ArrayList;
import java.util.List;

public class mecaAutenticacion {

    private List<DecoratorChequeo> decoradores = new ArrayList<>();

    public mecaAutenticacion(DecoratorChequeo decorador) {
        this.decoradores.add(decorador);
    }

    public void agregarDecorator(DecoratorChequeo decorador) {
        this.decoradores.add(decorador);
    }

    private boolean chequiarUsuario (Mail mail){
        return(mail.nombre);
    }

    public boolean autentificacion(Mail mail){

        for (DecoratorChequeo decorador : decoradores) {
            if (!decorador.chequiarplus(mail)) {
                return false;
            }
        }
        return (chequiarUsuario(mail));
    }

}