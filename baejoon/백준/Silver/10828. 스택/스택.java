import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    static class Stack {
        Node head;
        int count;

        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            count++;
        }

        public void pop() {
            if (head == null) {
                System.out.println(-1);
                return;
            }
            System.out.println(head.data);
            head = head.next;
            count--;
        }

        public void top() {
            if (head == null) {
                System.out.println(-1);
                return;
            }
            System.out.println(head.data);
        }

        public void size() {
            System.out.println(count);
        }

        public void empty() {
            if (head == null) System.out.println(1);
            else System.out.println(0);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack stack = new Stack();

        for (int i = 0; i < n; i++) {
            String command = br.readLine();

            if (command.startsWith("push")) {
                int value = Integer.parseInt(command.split(" ")[1]);
                stack.push(value);
            } else if (command.equals("pop")) {
                stack.pop();
            } else if (command.equals("top")) {
                stack.top();
            } else if (command.equals("size")) {
                stack.size();
            } else if (command.equals("empty")) {
                stack.empty();
            }
        }
    }
}
