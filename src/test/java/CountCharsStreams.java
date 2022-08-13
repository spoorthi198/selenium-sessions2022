public class CountCharsStreams {
    public static void main(String[] args) {
        System.out.println(getCharCount("testtingtest",'t'));

    }
    public static long getCharCount(String str,Character c){
        return str
                .chars()
                .filter(e->(char)e==c)
                .count();
    }
}
