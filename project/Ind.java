public class Ind
{ 
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("雨にも負けず風にも負けず"); 
        int i = sb.indexOf("風"); 
        int j = sb.indexOf("負けず"); 
        int k = sb.lastIndexOf("負けず"); 
        System.out.println("i = " + i + ", j = " + j + ", k = " + k); 
    } 
}