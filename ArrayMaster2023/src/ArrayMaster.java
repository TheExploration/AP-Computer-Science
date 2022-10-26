
public class ArrayMaster {
    
    public void printArray(int[] A) {
        if (A==null) {
            System.out.println("Array is null");
            return;
        }
        
        System.out.println("Array: " + A + " (length="+A.length);
        for(int k=0; k<A.length; k++)
            System.out.println("Index: " + k + ": " + A[k] );
        System.out.println(" ");
    }
    
    public int[] randomArray(int length, int max) {
        if (length<=0)
            return new int[0];
        int[] temp = new int[length];
        for(int k=0; k<temp.length; k++) 
            temp[k]=(int)(Math.random()*(max+1));
        return temp;
    }
    
    //post: returns an array that contains all the values in array A and B
    public int[] joinArrays(int[] A, int[] B) {
        
        
        
        return temp;
    }
    
    //post: returns an array that contains all even values in array A and B
    public int[] joinEvens(int[] A, int[] B) {
        
        
        
        
        
        return temp;
    }
    
    //pre: array A has no duplicate values.  array B has not duplicate values
    //       some values in A might be found in array B.
    //post: return an array that contains all the unique values, but no values should be listed more than once
    public int[] joinUnique(int[] A, int[] B) {
        int counter = 0;
        int[] temp = new int[A.length + B.length];
        for (int i = 0; i < A.length; i++) {
            temp[counter] = A[i];
            counter++;
        }
        for (int j = 0; j < B.length; j++) {
            temp[counter] = B[j];
            counter++;
        } 
        boolean same = false;
        int length = 0;
        for (int k = 0; k < temp.length; k++) {
            for (int a = k+1; a < temp.length; a++) {
                if (temp[k] == temp[a]) {
                    same = true;
                }
            }
            if (same != true) {
                same = false;
                length++;
            } else {
                temp[k] = -1;
                same = false;
            } 
        }
        int validIndex = 0;
        int[] temp2 = new int[length];
        for (int l = 0; l < temp.length; l++) {
            if (temp[l] != -1) {
                temp2[validIndex] = temp[l];
                validIndex++;
            }
        }
        
        return temp2;
    }
    
    
    //pre: array A if formed by containing the values 0 - (A.length-1), with each value appearing only once in random order   
    //        one of the values is removed from the array (the array is remade shorter - no blanks spots!)
    //        ex)   {3,1,5,2,6}   the 4 was removed       ex)  {6,2,4,1,5,8,7}   the 3 was removed
    public int whichOneMissing(int[] A) {
        
        
        return 0;
    }
    
    
    
}
