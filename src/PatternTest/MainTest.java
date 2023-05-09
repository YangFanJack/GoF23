package PatternTest;

public class MainTest {
    public static void main(String[] args) {
        String str = "AE001";
        final String s = str.replaceFirst("^0*", "");
        System.out.println(s);
    }
}
