import java.text.DecimalFormat;

public class UpperLowerCase {
    public static void main(String[] args) {
        int Uppercase = 0;
        int Lowercase = 0;
        int Digits=0;
        int specials=0;
        String str = "Naveen Automation Labs 123 @";
        int len = str.length();
        for(int i=0;i<len;i++){
            char ch= str.charAt(i);
            if(Character.isUpperCase(ch)){
                Uppercase ++;
            }else if(Character.isLowerCase(ch)){
                Lowercase ++;

            }else if(Character.isDigit(ch)){
                Digits ++;
            }else{
                specials ++;
            }
        }
        DecimalFormat formater = new DecimalFormat("##.##");

        System.out.println("Lower case count%:"+formater.format((Lowercase*100.0)/len));
        System.out.println("Uppercase count%:"+(Uppercase*100.0)/len);
        System.out.println("Digits count%:"+(Digits*100.0)/len);
        System.out.println("Speacis%:"+(specials*100.0)/len);

    }


}

