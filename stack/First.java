package stack;

import java.util.Stack;

public class First {
    public static void main(String[] args) {
        Stack<Integer> stackName=new Stack<>();
        stackName.push(1);
        stackName.push(2);
        System.out.println(stackName.peek());  // 2 aaucha latest element
        System.out.println(stackName.pop());   // 2 aaucha latest element lai hataucha
        System.out.println(stackName.peek());  // 1 aaucha latest element
        System.out.println(stackName.isEmpty()); // false, stack ma aru pani element cha
    }
}
