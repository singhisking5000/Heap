public class Main 
{
    
    
    public static void main(String[] args)
    {
        MaxHeap heap = new MaxHeap();
        heap.add(100);
        heap.add(200);
        heap.add(50);
        heap.add(25);
        heap.add(125);
        heap.add(300);
        System.out.println(heap.stringFormat());
        heap.removeMax();
        System.out.println(heap.stringFormat());
    }
}