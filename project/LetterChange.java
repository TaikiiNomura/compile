public class LetterChange 
{
    public static void main(String args[]) 
    {
        String str = new String("Good Morning");
        String upper_str = (str.toUpperCase());
        String lower_str = (str.toLowerCase());
        System.out.println("元の文字列 :" + str);
        System.out.println("大文字へ変換 :" + upper_str);
        System.out.println("小文字へ変換 :" + lower_str);
    }
}