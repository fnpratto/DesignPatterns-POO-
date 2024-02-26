package src.main.java;

public class QRDecoratorchequiar extends  DecoratorChequeo{

    @Override
    public boolean chequiarplus(Mail mail) {
        return(mail.qr);
    }
}
