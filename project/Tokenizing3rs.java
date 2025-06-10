import java.util.*;
public class Tokenizing3rs {
    public static void main(String[] args) {
        String line = "aki.txt:3:0,2,8,13,";
        String[] toks = line.split(":", 2);
        for (int i = 0; i < toks.length; ++i) {
            System.out.println(toks[i]);
        }
    }
}