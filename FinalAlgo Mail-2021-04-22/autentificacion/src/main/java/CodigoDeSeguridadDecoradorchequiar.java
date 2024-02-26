package src.main.java;

public class CodigoDeSeguridadDecoradorchequiar extends DecoratorChequeo{
    @Override
    public boolean chequiarplus(Mail mail) {
        return(mail.codigo);
    }
}
