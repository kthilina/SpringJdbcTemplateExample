package com.kthilina.exception;

public class SavedFailException extends Exception {
    public SavedFailException() {
    }

    public SavedFailException(String message) {
        super(message);
    }

    public SavedFailException(String message, Throwable cause) {
        super(message, cause);
    }

    public SavedFailException(Throwable cause) {
        super(cause);
    }

    public SavedFailException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
