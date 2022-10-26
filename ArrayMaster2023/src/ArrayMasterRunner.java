
public class ArrayMasterRunner {

    public static void main(String[] args) {
        //two arrays we can use for testing
        int[] test1=new int[] {1,2,3,3,3,3,3,4,5,6,99};
        int[] test2=new int[] {4,67456,65,6,7,8,9,10};
        
        //create an instance of ArrayMaster
        ArrayMaster AJ = new ArrayMaster();
        
        //use our instance to run and test the methods of the class
        int[] result = AJ.joinUnique(test1,test2);
        AJ.printArray(result);
        
        //int[] C = AJ.randomArray(10,5);
        //AJ.printArray(C);
    }
}















