package br.com.systechfeeder.systechcollector.exception;

public class SystechException extends Exception {
    private ErrorCode code;

    public SystechException(ErrorCode code) {
        super(code.getName());
        this.code = code;
    }

    public SystechException(String message) {
        super(message);
    }

    public ErrorCode getCode() {
        return code;
    }
}
