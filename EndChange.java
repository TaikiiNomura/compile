public class EndChange 
{
    String original; // 元の文字列
    String oldEnd; // 元の末尾語句
    String newEnd; // 新たな末尾語句
    public EndChange() 
    {
        this.original = "おれの大切な帽子だ。";
        this.oldEnd = "だ。";
        this.newEnd = "なんだぜ。";
    }
    public String changeEnd(String orig, String olde, String newe) 
    {
        if (orig.endsWith(olde)) {
            return orig.replaceAll(java.util.regex.Pattern.quote(olde) + "$", newe);
        } 
        else 
        {
            return orig;
        }
    }
    public static void main(String[] args) 
    {
        EndChange ec = new EndChange();
        System.out.println(ec.changeEnd(ec.original, ec.oldEnd, ec.newEnd));
    }
}