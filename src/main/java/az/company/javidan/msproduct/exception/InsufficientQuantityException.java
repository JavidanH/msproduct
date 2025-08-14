package az.company.javidan.msproduct.exception;

public class InsufficientQuantityException extends RuntimeException{

    public InsufficientQuantityException (String message){
        super(message);
    }
}
