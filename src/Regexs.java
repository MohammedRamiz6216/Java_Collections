import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        String regex ="[a-z]+_[a-z]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if(matcher.matches()){
        System.out.println("True");}
        else{
            System.out.println("false");
        }
//        if(matcher.matches()){
//            System.out.println(s);
//        }
//        else{
//            System.out.println(input);
//        }

    }
}
//[abc] -- anything in ab or c
//[^abc] -- any character except abc
//[a-z] -- means any character between a to z
//[A-Z] -- means any upper case character between a to z
//[a-zA-z] -- means any character between upper or lower case.
//[0-9] -- means any number between 0 to 9
//Quantifiers
//[ ]? -- means it can occur 0 or 1 time.
//[ ]* -- means it can occur 0 or more times.
//[ ]+ -- means it can occur 1 or more times.
//[ ]{n} -- means it can occur n times.
//[ ]{n,}-- means it can occur n or more times.
//[ ]{y,z} -- means it can occur at least y or less than z times.
//Regex Metacharacters -- means short forms of regex characters
// \d -- shortcut of [0-9]
// \D -- shortcut of [^ 0-9]
// \w -- shortcut of [a-zA-Z0-9]
// \W -- shortcut of [^\w]

