package src.main.java;

public class ContraseñaDecoratorchequiar extends  DecoratorChequeo{

    @Override
    public boolean chequiarplus(Mail mail) {
        return(mail.contrasena);
    }
}