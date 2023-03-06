package com.india.letsev.exception;

public class LetsEVGeneralException extends Exception{

    public LetsEVGeneralException() {
        super();
    }

    public LetsEVGeneralException(String message) {
        super(message);
    }

    public LetsEVGeneralException(String message, Throwable cause) {
        super(message, cause);
    }

    public LetsEVGeneralException(Throwable cause) {
        super(cause);
    }
}
