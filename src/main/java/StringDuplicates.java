import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringDuplicates {
    public static void main(String[] args) {
        printDuplicates("javataj");

        }

        public static void printDuplicates(String str){
            if(str==null){
                System.out.println("string is empty");
            }
            if(str.isEmpty()){
                System.out.println(
                        "string is empty"
                );
            }
            if(str.length()==1){
                System.out.println("string has only 1 character");
            }
            char[] words = str.toCharArray();
            Map<Character, Integer> charmap = new HashMap<Character, Integer>();

            for (char ch:words) {
                if(charmap.containsKey(ch)){
                    charmap.put(ch,charmap.get(ch)+1);

                }else
                {
                    charmap.put(ch,1);
                }

            }
            // print the map
            Set<Map.Entry<Character, Integer>> entrySet = charmap.entrySet();
            for(Map.Entry<Character, Integer> entry:entrySet){
                if(entry.getValue()>1){
                    System.out.println(entry.getKey() +":"+ entry.getValue());
                }
            }

        }


    }


