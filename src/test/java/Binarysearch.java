public class Binarysearch {
    public static void main(String[] args) {
        int [] array={1,3,6,7,9,14};

      int num= search(array,7);
        System.out.println(num);
    }

    public static int search(int[] array,int target){
        // find out the middle
        int left=0;
        int right = array.length-1;

        while (left<=right){
            int middle = (left+right)/2;
            if(array[middle]== target){
                return middle;
            }
            if(target>array[middle]){
                left=middle+1;
            }else {
                right=middle-1;
            }

            }
        return -1;

        }



}
