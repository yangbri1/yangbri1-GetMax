// import java.util.Array;

public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public int max(int[] arr){
        
        // sadly java.util.Array do NOT seem to want to import ...
        /* 1 way could be to use Array.sort() method to sort 'arr' into ascending order  & then retrieve last element (largest number) */
        // Array.sort(arr);   
        // return(arr[arr.length - 1]);
        
        // initialize variable 'bigNum' to be Java's int lower bound (no 'signed' integer could be lower than this w/o 'underflow') & wrap around
        // Recall: int data type in Java lower bound is -2,147,483,648
        int bigNum = -2147483648;

        // initialize iterator to 0
        int itr = 0;
        // loop via array 'arr' ...
        while(itr < arr.length){
            // if value at current iterated index is bigger than 'bigNum' ...
            if(arr[itr] > bigNum){
                // assign value to 'bigNum'
                bigNum = arr[itr];
            }
            // if on the contrary ...
            else{
                // return largest int in 'arr'
                return bigNum;
            }
            // increment by 1 to continue iteration
            ++itr;
        }
    }
}
