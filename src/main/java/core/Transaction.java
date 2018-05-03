package core;

import error.TxnValidationException;
import util.Parameter;

import java.util.UUID;

/**
 * @author acmore
 * @since JDK1.8
 * created at 2018/5/3
 */
public class Transaction implements Parameter {

    private String id;

    private final boolean isCoinbase;
    private final String sender;
    private final String receiver;
    private final long value;

    public Transaction(boolean isCoinbase, String sender, String receiver, long value) {
        this.isCoinbase = isCoinbase;
        this.sender = sender;
        this.receiver = receiver;
        this.value = value;
    }

    public void validate(boolean thoroughly) throws TxnValidationException {
        if (value > MAX_MONEY)
            throw new TxnValidationException("Transaction value exceeded.");
        if (!thoroughly) return;
    }

    public String getId() {
        if (id == null)
            id = UUID.randomUUID().toString();
        return id;
    }

    @Override
    public String toString() {
        String formater = "Coinbase: %s.\tSender: %s,\tReceiver: %s,\tValue: %d\n";
        return String.format(formater, isCoinbase, sender, receiver, value);
    }
}
