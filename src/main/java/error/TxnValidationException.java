package error;

import core.Transaction;

/**
 * @author acmore
 * @since JDK1.8
 * created at 2018/5/3
 */
public class TxnValidationException extends Exception {

    private String message;
    private Transaction orphan;

    public TxnValidationException(String message) {
        this(message, null);
    }

    public TxnValidationException(String message, Transaction orphan) {
        super(message);
        this.message = message;
        this.orphan = orphan;
    }

    public Transaction getOrphan() {
        return orphan;
    }
}
