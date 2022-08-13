import java.util.HashMap;
import java.util.Map;

public class Charactercount {

    public static void getCharacterCount(String s){
        Map<Character,Integer> charmap = new HashMap<Character,Integer>() ;
        char[] c1 = s.toCharArray();
        for (char c:c1)
        {

            if(charmap.containsKey(c)){
                charmap.put(c,charmap.get(c)+1);
            }else {
                charmap.put(c,1);
            }

        }
        System.out.println("name"+charmap);

    }
    public static void main(String[] args) {
        getCharacterCount("test");
    }
}
