public class IntegerNode {
    private int item; //instance variable
    private IntegerNode next; //instance variable
    //Constructor1  
    public IntegerNode(int item) {
        this.item = item;
        this.next = null;
        }
    //Constructor2  
    public IntegerNode(int item, IntegerNode next) {
        this.item = item;
        this.next = next;
        }
    public void setNext(IntegerNode nextNode) {
        next = nextNode;
       }
    public IntegerNode getNext() {
        return next;
       }
    public int getItem() {
        return item;
       }
    public void setItem(int item){
        this.item = item;
    }
}
