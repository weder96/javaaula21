package PackOCP11JavaClassDesign.Study05.process;

public class Application {
    public static String process(String str) {
        if (str == null)
            return null;

        str = str.toUpperCase();

        if (str.length() <= 3)
            return str;

        return "" + str.charAt(2) + str.charAt(1) + str.charAt(0) + str.substring(3);
    }

    public static void main(String[] args) {
        System.out.println(process(null));
        System.out.println(process("ab"));
        System.out.println(process("abcdefg"));
    }
}
