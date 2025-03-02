import java.lang.Object;

/**
 * Die Klasse Stack implementiert einen generischen Stapel (Stack) mit einer festen Größe.
 * @param <T> Der Typ der Elemente, die im Stack gespeichert werden.
 */
public class Stack<T> {

    private T[] elements;      // Array zur Speicherung der Elemente
    private int maximum;       // Maximale Größe des Stacks
    private int topElement;    // Index des obersten Elements im Stack

    /**
     * Standardkonstruktor, der einen Stack mit einer maximalen Größe von 5 erstellt.
     */
    public Stack() {
        this.maximum = 5;
        elements = (T[]) new Object[maximum];
        this.topElement = -1;
    }

    /**
     * Konstruktor, der einen Stack mit einer angegebenen maximalen Größe erstellt.
     * @param maximum Maximale Anzahl der Elemente, die der Stack aufnehmen kann.
     */
    public Stack(int maximum) {
        this.maximum = maximum;
        elements = (T[]) new Object[maximum];
        this.topElement = -1;
    }

    /**
     * Fügt ein Element oben auf den Stack hinzu.
     * @param element Das hinzuzufügende Element.
     * @throws StackFullException Wenn der Stack bereits voll ist.
     */
    public void push(T element) throws StackFullException {
        if (topElement + 1 == maximum) {
            throw new StackFullException("Der Stack ist voll");
        }
        topElement += 1;
        elements[topElement] = element;
    }

    /**
     * Entfernt und gibt das oberste Element des Stacks zurück.
     * @return Das entfernte Element.
     * @throws StackEmptyException Wenn der Stack leer ist.
     */
    public T pop() throws StackEmptyException {
        if (topElement == -1) {
            throw new StackEmptyException("Der Stack ist leer");
        }
        T deletedElement = elements[topElement];
        elements[topElement] = null;
        topElement -= 1;
        return deletedElement;
    }

    /**
     * Gibt das oberste Element des Stacks zurück, ohne es zu entfernen.
     * @return Das oberste Element oder null, wenn der Stack leer ist.
     */
    public T peek() {
        return elements[topElement];
    }

    /**
     * Gibt eine String-Darstellung aller Elemente im Stack zurück.
     * @return String mit allen Elementen, getrennt durch Semikolons.
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







