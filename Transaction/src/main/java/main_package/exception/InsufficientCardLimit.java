package main_package.exception;

public class InsufficientCardLimit extends RuntimeException{
    public InsufficientCardLimit(){
        super("InsufficientCardLimit");
    }

}
