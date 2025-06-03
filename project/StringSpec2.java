public class StringSpec2 
{
    public static void main(String[] args)
    {
        String myStr = "祇園精舎の鐘の声諸行無常の響きあり";
        String[] myStrs = { "鳳凰", "龍", "麒麟", "霊亀" }; // Stringの配列
        String aStr = "祇園精舎の鐘の声" + "諸行無常の響きあり\n"
        + "沙羅双樹の花の色" + "盛者必衰の理をあらはす";

        System.out.println(myStr);
        for (int i=0; i<myStrs.length; i++)
            System.out.println(myStrs[i]);
        System.out.println(aStr);
    }
}