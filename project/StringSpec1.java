public class StringSpec1
{
    public static void main(String[] args)
    {
        String name1 = "Taro"; // 文字列リテラル
        String name2 = new String("Taro"); // 明示的にオブジェクト生成
        String name3 = "Taro"; // 文字列リテラル
        System.out.println(name1 == name2); // false
        System.out.println(name1.equals(name2)); // true
        System.out.println(name1 == name3); // true
        System.out.println(name1.equals(name3)); // true
    }
}