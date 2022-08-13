import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsPractice {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 34, 56, 34, 57, 86, 32);
        Optional<Integer> sum_num = list.stream().reduce((a, b) -> a + b);
        System.out.println(sum_num.get());

        //odd or even
        List<Integer> evenlist = list.stream()
                .filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println(evenlist);

        //avg of ele
        double avg = list.stream()
                .mapToInt(e -> e).average().getAsDouble();
        System.out.println(avg);

        //Apply Squars and get avg
        List<Integer> num = Arrays.asList(1, 10, 20, 30, 15);
        double squ = num.stream()
                .mapToInt(e -> e * e)
                .filter(e -> e > 100)
                .average().getAsDouble();
        System.out.println(squ);

        //get the duplicate value
        List<Integer> numlist = Arrays.asList(1, 3, 3, 45, 45, 6, 78, 78, 9, 9, 0, 90, 56);
        Set<Integer> dupNum = new HashSet<Integer>();
        Set<Integer> setnum = numlist.stream().filter(e -> Collections.frequency(numlist, e) > 1).collect(Collectors.toSet());
        System.out.println(setnum);

        Set<Integer> dup = numlist.stream().filter(e -> !dupNum.add(e)).collect(Collectors.toSet());
        System.out.println(dup);



        // get the max and min number:
        List<Integer> max_min_num = Arrays.asList(1, 3, 78,56,63);
        Integer max = max_min_num.stream().max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(max);

        Integer min = max_min_num.stream().min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(min);

        //iterating array list:
       // numlist.forEach(e-> System.out.print(e));

        List<Integer> list1 = Arrays.asList(-1,0,1,3,10,20,30,15,1,13,1,2,2,10,40,19,3);
        Integer maxnum = list1.stream().reduce(1, (a, b) -> a > b ? a : b);
        System.out.println(maxnum);
        Integer minnum = list1.stream().reduce(1, (a, b) -> a < b ? a : b);
        System.out.println(minnum);

        // Stream filter and collect:
        List<String> appleProducts = Arrays.asList("Macbook", "iphone", "ipad", "shoes", "ipen");

        List<String> prodlist = appleProducts.stream().filter(ele -> !ele.equals("shoes")).collect(Collectors.toList());
        prodlist.forEach(e-> System.out.println(e));

    }



}
