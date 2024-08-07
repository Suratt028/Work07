public class Test1 {
    public static void main(String[] args) {
        IntegerNode head =null;
        System.out.println("head = "+head);
        IntegerNode lst1 = new IntegerNode(10);
        head = lst1;
        System.out.println("head = "+head);  
        
        

        IntegerNode lst2 = new IntegerNode(20);
        lst1.setNext(lst2); 
        lst2.setItem(lst2.getItem());
        
        IntegerNode lst3 = new IntegerNode(30);
        lst3.setNext(head);
        head = lst3;
        System.out.println("head = "+head);
        System.out.println("lst3 = "+lst3);
        System.out.println("lst3 value = "+lst3.getItem());
        System.out.println("lst3 Next = "+lst3.getNext()+"\n");
        
        System.out.println("lst1 = "+lst1);
        System.out.println("lst1 value = "+lst1.getItem());
        System.out.println("lst1 Next = "+lst1.getNext()+"\n");
        System.out.println("lst2 = "+lst2);
        System.out.println("lst2 value = "+lst2.getItem());
    }
        
}
