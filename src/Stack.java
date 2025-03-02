import java.lang.Object;

/**
 * The Stack class implements a generic stack with a fixed size.
 * @param <T> The type of elements stored in the stack.
 */
public class Stack<T> {

    private T[] elements;      // Array for storing elements
    private int maximum;       // Maximum size of the stack
    private int topElement;    // Index of the top element in the stack

    /**
     * Default constructor that creates a stack with a maximum size of 5.
     */
    public Stack() {
        this.maximum = 5;
        elements = (T[]) new Object[maximum];
        this.topElement = -1;
    }

    /**
     * Constructor that creates a stack with a specified maximum size.
     * @param maximum Maximum number of elements the stack can hold.
     */
    public Stack(int maximum) {
        this.maximum = maximum;
        elements = (T[]) new Object[maximum];
        this.topElement = -1;
    }

    /**
     * Adds an element to the top of the stack.
     * @param element The element to add.
     * @throws StackFullException If the stack is already full.
     */
    public void push(T element) throws StackFullException {
        if (topElement + 1 == maximum) {
            throw new StackFullException("The stack is full");
        }
        topElement += 1;
        elements[topElement] = element;
    }

    /**
     * Removes and returns the top element of the stack.
     * @return The removed element.
     * @throws StackEmptyException If the stack is empty.
     */
    public T pop() throws StackEmptyException {
        if (topElement == -1) {
            throw new StackEmptyException("The stack is empty");
        }
        T deletedElement = elements[topElement];
        elements[topElement] = null;
        topElement -= 1;
        return deletedElement;
    }

    /**
     * Returns the top element of the stack without removing it.
     * @return The top element or null if the stack is empty.
     */
    public T peek() {
        return elements[topElement];
    }

    /**
     * Returns a string representation of all elements in the stack.
     * @return String with all elements separated by semicolons.
     */
    public String list() {
        String text = "";
        for (int i = 0; i < topElement; i++) {
            text += elements[i] + ";";
        }
        text += elements[topElement];
        return text;
    }
}
