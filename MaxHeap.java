
public class MaxHeap {

    private int endIndex;
    //the actual storage structure for your heap
    private int[] arr;

    //constructor for your heap
    //feel free to make one that takes in an array if you prefer for your testing purposes.
    //note that we will not be inserting more than 100 elements into our array so you need not worry about re-sizing
    //the array
    public MaxHeap() {
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
    public void removeMax() 
    {
        //DEEPEST AND FARTHEST RIGHT ITEM IS AT endIndex-1!
        arr[0] = arr[endIndex - 1]; // replace it!
        // For debugging VVVVVVVV
        //System.out.println("Replacement: " + arr[endIndex - 1]);
        arr[endIndex - 1] = 0; // delete its replacement!
        siftDown(0); // now rework it
    }

    //this should check and alter the tree after an item is inserted
    //3 points
    // IMPORTANT INDEXING NOTES
    /*  arr[(i-1)/2]   <--- parent
        arr[(2*i) + 1] <--- left
        arr[(2*i) + 2] <--- right
     */
    private void siftUp(int i) {
        if(i >= 0) { //While we arent at the top
            if (arr[i] > arr[(i - 1)/2]) { // Are we bigger than our parent?
                // Perform a swap
                int temp = arr[(i - 1)/2];
                arr[(i - 1)/2] = arr[i];
                arr[i] = temp;
                siftUp((i-1)/2); //Well, if it got sifted up, you should check on their position again!
            }
        }
    }

    //this should check and alter the tree after an item is deleted.
    //3 points
    private void siftDown(int i) 
    {
        // if we have atleast a left child, we have a child, as a right child requires
        // you to have a left already placed
        if ((2*i) + 1 < endIndex) // so check if the left is inbound
        {
            if((2*i) + 2 < endIndex) // do we have a right too?
            {
                //We want to follow the path of the bigger one
                if(arr[(2*i) + 2] < arr[(2*i) + 1]) // is the left bigger?
                {
                    if(arr[i] < arr[(2*i) + 1]) // do we swap with them?
                    {
                        int temp = arr[(2*i) + 1];
                        arr[(2*i) + 1] = arr[i];
                        arr[i] = temp;
                        siftDown((2*i) + 1); // and continue down!
                    }
                } else { // the right is bigger then!
                    if (arr[i] < arr[(2 * i) + 2]) // do we swap with them?
                    {
                        int temp = arr[(2 * i) + 2];
                        arr[(2 * i) + 2] = arr[i];
                        arr[i] = temp;
                        siftDown((2 * i) + 2); // and continue down!
                    }
                }
            } else { // I guess we dont have a right, so we go with the left
                if (arr[i] < arr[(2 * i) + 1]) // do we swap with them?
                {
                    int temp = arr[(2 * i) + 1];
                    arr[(2 * i) + 1] = arr[i];
                    arr[i] = temp;
                    siftDown((2 * i) + 1); // and continue down!
                }
            }
        }
        // if we got nothing, we just quit there man :\
    }

    //For visibility purposes, it prints the entire tree's array, but not in a tree format
    public String stringFormat()
    {
        String str = "";
        for(int i = 0; i < arr.length; i++)
        {
            if(i < arr.length - 1)
            {
                str += arr[i] + ", ";
            } else {
                str += arr[i];
            }
        }
        return str;
    }

    //4 points for syntax conventions.
}