public class SVSSB
{ 
    public static void main(String[] args)
    { 
        String ms = "ミリ秒"; 
        String temp = ""; 
        String str = "背中の傷は剣士の恥だ"; 
        long s = System.currentTimeMillis(); 
        for (int i = 0; i < 3000; ++i)
        { 
            temp += str; //strを3000個連結する
        } 
        long e = System.currentTimeMillis(); 
        System.out.println("Stringの連結の所要時間 : " + (e - s) + ms); 
        StringBuffer sb = new StringBuffer(str); 
        StringBuffer sbtemp = new StringBuffer(); 
        s = System.currentTimeMillis(); 
        for (int i = 0; i < 3000; ++i)
        { 
            sbtemp = sbtemp.append(sb); 
        } 
        e = System.currentTimeMillis(); 
        System.out.println("StringBufferのappend()の所要時間 : " + (e - s) + ms); 
    } 
}