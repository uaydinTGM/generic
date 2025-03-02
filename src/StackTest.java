/**
 * Test class for the Stack class to verify basic functions.
 */
public class StackTest {
    public static void main(String[] args) {
        try {
            // Create a stack for strings with a maximum size of 3
            Stack<String> stack1 = new Stack<>(3);
            stack1.push("Hallo");
            stack1.push("Nein");
            System.out.println(stack1.list());
            System.out.println(stack1.pop());

            // Create a default stack for integers
            Stack<Integer> stack2 = new Stack<>();
            stack2.push(4);
            System.out.println(stack2.peek());
            System.out.println(stack2.pop());

        } catch (StackFullException | StackEmptyException e) {
            System.out.println(e.getMessage());
        }
    }
}
