public class Splitcron
{
    public static void main(String[] args)
    {
        String line = "aki.txt:3:0,2,8,13,";
        String[] toks = line.split(":", 3);
        for (int i = 0; i < toks.length; ++i) {
            System.out.println(toks[i]);
        }
    }
}