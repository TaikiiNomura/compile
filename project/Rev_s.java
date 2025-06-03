public class Rev_s
{ 
    public static void main(String[] args)
    { 
        String str = "春夏秋冬"; String newstr = ""; 
        for (int i = str.length(); i > 0; --i)
        { 
            newstr += str.substring(i- 1, i); //１文字の部分文字列
        } 
        System.out.println(newstr); 
    } 
}