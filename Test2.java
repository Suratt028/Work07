public class Test2 {
    public static void main(String[] args) {
        IntegerNode head =null;
        System.out.println("head = "+head);
        IntegerNode lst1 = new IntegerNode(42);
        head = lst1;
        System.out.println("head = "+head);
        System.out.println("lst1 = "+lst1);
        System.out.println("lst1 value = "+lst1.getItem());
        
        

        IntegerNode lst2 = new IntegerNode(-3);
        lst1.setNext(lst2);
        System.out.println("lst1 Next = "+lst1.getNext()+"\n");
        lst2.setItem(lst2.getItem());
        System.out.println("lst2 = "+lst2);
        System.out.println("lst2 value = "+lst2.getItem());

        IntegerNode lst3 = new IntegerNode(17);
        lst2.setNext(lst3);
        System.out.println("lst2 Next = "+lst2.getNext()+"\n");
        lst3.setItem(lst3.getItem());
        System.out.println("lst3 = "+lst3);
        System.out.println("lst3 value = "+lst3.getItem());

        IntegerNode lst4 = new IntegerNode(9);
        lst3.setNext(lst4);
        System.out.println("lst3 Next = "+lst3.getNext()+"\n");
        lst3.setItem(lst3.getItem());
        System.out.println("lst4 = "+lst4);
        System.out.println("lst4 value = "+lst4.getItem());

        IntegerNode lst5 = new IntegerNode(20);
        lst4.setNext(lst5);
        System.out.println("lst4 Next = "+lst4.getNext()+"\n");
        lst3.setItem(lst5.getItem());
        System.out.println("lst5 = "+lst5);
        System.out.println("lst5 value = "+lst5.getItem());
        System.out.println("lst5 Next = "+lst5.getNext()+"\n");

    }
}
