/**
 * Custom exception for handling empty stack scenarios.
 */
public class StackEmptyException extends Exception {
    public StackEmptyException(String message) {
        super(message);
    }
}
