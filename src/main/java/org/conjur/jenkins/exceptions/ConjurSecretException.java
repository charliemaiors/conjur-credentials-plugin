package org.conjur.jenkins.exceptions;

public class ConjurSecretException extends RuntimeException{
    public ConjurSecretException() {
        super();
    }

    public ConjurSecretException(String s) {
        super(s);
    }

    public ConjurSecretException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public ConjurSecretException(Throwable throwable) {
        super(throwable);
    }

    protected ConjurSecretException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
