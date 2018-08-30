package com.kthilina.exception;

public class JdbcTemplateRollBackException extends Exception {
    public JdbcTemplateRollBackException() {
    }

    public JdbcTemplateRollBackException(String message) {
        super(message);
    }

    public JdbcTemplateRollBackException(String message, Throwable cause) {
        super(message, cause);
    }

    public JdbcTemplateRollBackException(Throwable cause) {
        super(cause);
    }

    public JdbcTemplateRollBackException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
