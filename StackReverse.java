import java.util.*;

public class StackReverse {
    static class Reverse {
        public static void PushBottom(Stack<Integer> s, int data){
            if (s.isEmpty()) {
                s.push(data);
                return;
            }
            int top = s.pop();
            PushBottom(s, data);
            s.push(top);
        }
        
        public static void reverseStack(Stack<Integer> s){
            if(s.isEmpty()){
                return;
            }
            int top = s.pop();
            reverseStack(s);
            PushBottom(s, top);
        }
        
        public static void printStack(Stack<Integer> s){
            while(!s.isEmpty()){
                System.out.println(s.pop());
            }
        }
    }    
    
    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        Reverse.printStack(s);
        Reverse.reverseStack(s);
        Reverse.printStack(s);
    }
}
