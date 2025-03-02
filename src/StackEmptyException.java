/**
 * Benutzerdefinierte Ausnahme für die Behandlung von leeren Stacks.
 */
public class StackEmptyException extends Exception {
    public StackEmptyException(String message) {
        super(message);
    }
}