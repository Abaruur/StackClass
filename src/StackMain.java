import java.util.Stack;

//Stack is a data structure. This is to explore how Stack class uses inheritance
//to inherit behaviors and attributes from its superclass.
public class StackMain {
    public static void main(String[] args) {
        Stack<Character> charStack = new Stack<>();
        //Stack class extends Vector class. 

        // added characters to stack using push method.

        charStack.push('c');
        charStack.push('a');
        charStack.push('t');
        //I used pop method as to remove those characters. When characters are removed, they will be removed
        // in reverse order.
        System.out.println(charStack.pop());
        System.out.println(charStack.pop());
        System.out.println(charStack.pop());
    }
}
