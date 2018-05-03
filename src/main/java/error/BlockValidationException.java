package error;

import core.Block;

/**
 * @author acmore
 * @since JDK1.8
 * created at 2018/5/3
 */
public class BlockValidationException extends Exception {

    private String message;
    private Block orphan;

    public BlockValidationException(String message) {
        this(message, null);
    }

    public BlockValidationException(String message, Block orphan) {
        super(message);
        this.message = message;
        this.orphan = orphan;
    }

    public Block getOrphan() {
        return orphan;
    }
}
