
public class Heap {

    private int endIndex;
    //the actual storage structure for your heap

    private int[] arr;

    

    //constructor for your heap

    //feel free to make one that takes in an array if you prefer for your testing purposes.

    //note that we will not be inserting more than 100 elements into our array so you need not worry about re-sizing

    //the array

    public Heap() {

        arr = new int[100];
        endIndex = 0;

    }

    

    

    //create this function to add elements to your heap

    //all heap properties must be preserved

    // 5 points

    public void add(int toAdd) {
        arr[endIndex] = toAdd;
        siftUp(endIndex);
        endIndex++;
    }

    

    //remove the largest element of the heap (the root) and re-heapafy

    //5 points

    public void removeMax() {}

    

    //this should check and alter the tree after an item is inserted

    //3 points

    /*  arr[(i-1)/2]   <--- parent
        arr[(2*i) + 1] <--- left
        arr[(2*i) + 2] <--- right
     */
    private void siftUp(int i) {
        if(i >= 0) {
            if (i % 2 == 0) { // A left child 
                if (arr[i] > arr[i - 1]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = 
                }
            } else {

            }
            
        }
    }

    

    //this should check and alter the tree after an item is deleted.

    //3 points

    private void siftDown(int index) {}

    

    //4 points for syntax conventions.
}