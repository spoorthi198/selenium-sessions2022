public class MissingInteger {
    public static void main(String[] args) {
        int[] num = {1,2,3,5};
        int missindNum = findMissingNum(num, 5);
        System.out.println(missindNum);
    }


    public static int findMissingNum(int num[],int totalnum)
    {
        int expectedNum= totalnum *((totalnum+1)/2);
        int actualNum = 0;
        for (int i:num) {
            actualNum +=i;

        }


        return expectedNum-actualNum;
    }
}
