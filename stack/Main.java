package stack;


public class Main {
    public static void main(String[] args) {
        Stack firstStack = new Stack(12);

        firstStack.push(25);
        firstStack.push(43);
        firstStack.push(34);
        firstStack.push(4444);
        firstStack.pop();




        System.out.println(firstStack.peek());
        System.out.println(firstStack.size());
        System.out.println(firstStack.isEmpty());

    }
}
