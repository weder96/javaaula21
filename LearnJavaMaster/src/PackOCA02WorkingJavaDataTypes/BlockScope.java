package PackOCA02WorkingJavaDataTypes;

public class BlockScope {
    public static void main(String[] args) {
        int n = 1;
        {
            int k = 2;
            // int n = 3; error -- can't redefine n in inner
            System.out.println(k);
        } // k is only defined up to here
        System.out.println(n);

    }
}
