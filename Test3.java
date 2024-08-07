public class Test3 {
    public static void main(String[] args) {
        IntegerNode head =null;
        System.out.println("head = "+head);
        IntegerNode lst1 = new IntegerNode(10,new IntegerNode(20));
        head = lst1;
        System.out.println("head = "+head);  
        System.out.println("lst1 = "+ lst1);
        System.out.println("lst1 value = "+ lst1.getItem());
        System.out.println("lst1 Next = "+ lst1.getNext());
        System.out.println("lst1 Next Value = "+ lst1.getNext().getItem());
        
    
    }
}
