import java.util.Arrays;


public class Anagram {

    public static boolean IsAnagram(String s1, String s2){
         String str1 =s1.replaceAll("\\s","");
        String str2 = s2.replaceAll("\\s","");
        if(str1.length()!=str2.length()){
            return false;
        }else {
            char[] c1 = str1.toLowerCase().toCharArray();
            char[] c2 = str2.toLowerCase().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);


            return Arrays.equals(c1,c2);
        }
    }

    public static void main(String[] args) {
      boolean  flag=IsAnagram("Listen","Silent ");
        System.out.println("Anagram String:"+flag);
    }
}
