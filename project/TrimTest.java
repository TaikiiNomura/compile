public class TrimTest
{
    public static void main(String[] args)
    {
        String stre = "　この帽子をお前に預ける　";
        String strj = "　この帽子をお前に預ける　"; // ↑ 全角スペース ↑
        String tail = "おれの大切な帽子だ\n"; //改行されないときは、\がバックスラッシュになっていない。
        System.out.print("ASCII SPACES:" + stre.trim() + tail);
        System.out.print("JIS SPACES: " + strj.trim() + tail);
    }
}