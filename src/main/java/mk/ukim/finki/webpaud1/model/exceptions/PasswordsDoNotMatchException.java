package mk.ukim.finki.webpaud1.model.exceptions;

public class PasswordsDoNotMatchException extends RuntimeException{

    public PasswordsDoNotMatchException(){
        super("Passwords don't match!");
    }
}
