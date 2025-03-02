/**
 * Benutzerdefinierte Ausnahme für die Behandlung von vollen Stacks.
 */
public class StackFullException extends Exception {
    public StackFullException(String message) {
        super(message);
    }
}
