package com.india.letsev.exception;

public class LetsEVDBException extends Exception{
    public LetsEVDBException() {
        super();
    }

    public LetsEVDBException(String message) {
        super(message);
    }

    public LetsEVDBException(String message, Throwable cause) {
        super(message, cause);
    }

    public LetsEVDBException(Throwable cause) {
        super(cause);
    }
}
