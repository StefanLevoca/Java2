package sk.jaro.ownException;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message){
        super(message);
    }
}
