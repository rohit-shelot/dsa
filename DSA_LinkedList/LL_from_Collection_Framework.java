package DSA_LinkedList;

import java.util.LinkedList;

public class LL_from_Collection_Framework {
    public static void main(String[] args){
        LinkedList<String> linkedlist = new LinkedList<>();
        linkedlist.addFirst("is");
        linkedlist.addFirst("name");
        linkedlist.addFirst("My");
        linkedlist.addLast("Rohit");
        System.out.println(linkedlist);
        System.out.println(linkedlist.size());
    }
}
