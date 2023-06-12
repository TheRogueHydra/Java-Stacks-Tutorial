import java.util.Stack;

public class Main {

    public static void main(String []args) {

        Stack<String> myStack = new Stack<String>();
        //Red
        //Green
        //Blue
        myStack.push("blue");
        myStack.push("green");
        myStack.push("red");
        System.out.println(myStack);

        myStack.pop();
        System.out.println(myStack);

        myStack.push("orange");
        System.out.println(myStack.peek());

        System.out.println(myStack.search("orange"));
        System.out.println(myStack.search("blue"));

        myStack.pop();
        myStack.pop();
        myStack.pop();

        if(myStack.empty() == true) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack is not empty.");
        }

    }

}
