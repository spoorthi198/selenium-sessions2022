public class BinarySearchRecursive {
    public static void main(String[] args) {
        int arr[] = {1,3,7,8,10,13};
        int a=binSearch(arr,8);
        System.out.println(a);
    }
    public static int binSearch(int[] arr, int tar){
       return searchRecc(arr,tar,0,arr.length-1);

    }

    private static int searchRecc(int[] arr,int tar,int left,int right) {
        if (right<left){
            return -1;}
        int mid = (left + right) / 2;
        if (arr[mid]==tar) {
            return mid;
        }
        if(tar > arr[mid]){
            return searchRecc(arr, tar, mid+1, right);}

          return  searchRecc(arr,tar,left,mid-1);




    }
}
