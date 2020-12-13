package br.com.systechfeeder.systechcollector.exception;

public enum ErrorCode {

    GENERAL_ERROR("GENERAL_ERROR");

    private String name;

    ErrorCode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
