import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patterntry {
    public static void main(String arg[]){
        String A="194" ;

        String p="(\\d[0-2]\\d[0-9]\\d[0-9])";
        String pattern=p;

        Pattern r= Pattern.compile(pattern);

        Matcher m= r.matcher(A);

            System.out.println(m.matches());
        }

    }

