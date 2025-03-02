/**
 * Testklasse für die Stack-Klasse, um grundlegende Funktionen zu überprüfen.
 */

public class StackTest {
    public static void main(String[] args) {
        try {
            // Stack mit einer maximalen Größe von 3 für Strings erstellen
            Stack<String> stack1 = new Stack<>(3);
            stack1.push("Hallo");
            stack1.push("Nein");
            System.out.println(stack1.list());
            System.out.println(stack1.pop());

            // Standard-Stack für Integer erstellen
            Stack<Integer> stack2 = new Stack<>();
            stack2.push(4);
            System.out.println(stack2.peek());
            System.out.println(stack2.pop());

        } catch (StackFullException | StackEmptyException e) {
            System.out.println(e.getMessage());
        }
    }
}