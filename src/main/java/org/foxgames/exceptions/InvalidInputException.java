package org.foxgames.exceptions;

public class InvalidInputException extends RuntimeException {
    private static final long serialVersionUID = -1372830847461027975L;

    /**
     * Exception with no message or cause.
     */
    public InvalidInputException() { super(); }

    /**
     * Exception with a message, but no cause.
     * @param message A descriptive message for this exception
     */
    public InvalidInputException(String message) { super(message); }

    /**
     * Exception with no message, but with a cause.
     * @param cause The original Throwable resulting in this exception.
     */
    public InvalidInputException(Throwable cause) { super(cause); }

    /**
     * Exception with no message and a cause.
     * @param message A descriptive message for this exception.
     * @param cause The original Throwable resulting in this exception.
     */
    public InvalidInputException(String message, Throwable cause) { super(message, cause); }
}
