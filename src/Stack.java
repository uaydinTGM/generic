
import java.lang.Object;
 public class Stack<T>{

    private T[] elements;
    private int maximum;
    private int topElement;

     public Stack() {
         this.maximum = 5;
         elements = (T[]) new Object[maximum];
         this.topElement = -1;
     }

     public Stack(int maximum) {
         this.maximum = maximum;
         elements = (T[]) new Object[maximum];
         this.topElement = -1;
     }
     public void push(T element)throws StackFullException{
         if(topElement +1 == maximum){
             throw new StackFullException("The Stack is full");
         }

         topElement += 1;

         elements[topElement] = element;

     }
     public T pop() throws StackEmptyException{

         if(topElement == -1){
             throw new StackEmptyException("The Stack is empty");
         }

         T deletedElement = elements[topElement];

         elements[topElement] = null;

         topElement -= 1;

        return deletedElement;

     }
     public T peek(){

         T currentElement = elements[topElement];

         return currentElement;

     }
     public String list(){
         String text = "";
         for (int i = 0; i < topElement; i++) {

             text += elements[i] + ";";



         }
         text += elements[topElement];
         return text;
     }
 }
