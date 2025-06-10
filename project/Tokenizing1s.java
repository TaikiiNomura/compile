public class Tokenizing1s {
    public static void main(String[] args) {
        String line = "aki.txt:3:0,2,8,13,";
        String fileName;
        String lineNumber;
        String indexes;
        int colonPos1, colonPos2;

        colonPos1 = line.indexOf(':');
        fileName = line.substring(0, colonPos1);
        System.out.println(fileName);

        colonPos2 = line.indexOf(':', colonPos1 + 1);
        lineNumber = line.substring(colonPos1 + 1, colonPos2);
        System.out.println(lineNumber);

        indexes = line.substring(colonPos2 + 1);
        System.out.println(indexes);
    }
}