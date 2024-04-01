package generics;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Character> characterQueue = new LinkedList<>();

        characterQueue.add('a');
        characterQueue.add('b');
        characterQueue.add('c');
    }
}
