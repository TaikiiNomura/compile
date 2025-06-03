public class Del 
{ 
    public static void main(String[] args) 
    { 
        StringBuffer sb = new StringBuffer( 
            "勝利も敗北も知り逃げ回って涙を流して男は一人前になる！\n" + "泣いたっていいんだ！乗り越えろ！" 
            );
        int i = sb.indexOf("乗り越えろ！");
        System.out.println(sb.delete(i, sb.length()));
    } 
}

// 勝利も敗北も知り逃げ回って涙を流して男は一人前になる！
// 泣いたっていいんだ！