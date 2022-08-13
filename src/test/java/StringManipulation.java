public class StringManipulation
{
    public static void main(String[] args) {
        boolean flag = checkForString("Success Product is retrieved");
        System.out.println(flag);
    }


    public static boolean checkForString(String ProductName){
        if(ProductName.contains("Success")){
            return true;
        }
        return  false;
    }
}


