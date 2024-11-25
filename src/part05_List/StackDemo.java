package part05_List;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        /*
        *  push()
        *  pop()
        *  peek()
        *
        *  isEmpty()
        *  size()
        *
        * */

        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(18);
        stack.push(13);
        System.out.println(stack);

    }
}
