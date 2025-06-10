import java.util.*;
public class Tokenizing2st {
    public static void main(String[] args) {
        String line = "aki.txt:3:0,2,8,13,";
        StringTokenizer st = new StringTokenizer(line, ":");
        String tok;
        while (st.hasMoreTokens()) {
            tok = st.nextToken();
            System.out.println(tok);
        }
    }
}