package stack;


public class Main {
    public static void main(String[] args) {
        Stack mer = new Stack(12);
        mer.push(25);
        mer.push(43);
        mer.push(34);
        mer.pop();
        System.out.println(mer.peek());
        System.out.println(mer.size());

    }
}
