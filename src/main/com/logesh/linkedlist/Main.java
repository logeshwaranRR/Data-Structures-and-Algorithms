package src.main.com.logesh.linkedlist;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(2);
        list.addFirst(1);
        list.addFirst(7);
        list.addFirst(9);
        list.addFirst(17);

        list.addLast(27);
        list.addLast(33);

        list.add(41, 7 );
        System.out.println(list.getSize());
        list.display();

        System.out.println(list.deleteFirst());
        System.out.println(list.getSize());
        list.display();
        System.out.println(list.deleteLast());
        System.out.println(list.getSize());

        list.display();
    }
}
