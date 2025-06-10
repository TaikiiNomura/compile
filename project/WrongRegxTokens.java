import java.util.regex.*;
public class WrongRegxTokens
{ 
    public static void main(String[] args)
    { 
        String matchedString; 
        String targetString = "aki.txt:3:0,2,8,13,"; 
        String regexString = "[^:]+:"; 
        Pattern pat = Pattern.compile(regexString); 
        Matcher mat = pat.matcher(targetString); 
        boolean hasMore = false; 
        while (hasMore = mat.find())
        { 
            matchedString = mat.group(); 
            System.out.println(matchedString); 
        } 
    } 
}