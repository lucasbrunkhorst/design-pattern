package com.lucasbrunkhorst;

public class DomainException extends RuntimeException {
    public DomainException(String mensagem) {
        super(mensagem);
    }
}
