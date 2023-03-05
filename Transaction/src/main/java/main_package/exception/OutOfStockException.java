package main_package.exception;

public class OutOfStockException extends RuntimeException{
    public OutOfStockException( String msg ){
        super(msg);
    }

}
