package PackOCP13GenericsAndCollections.diamond;

public class ArrayAlg {

    public static Pair<String> minmax(String[] a) {
        if (a == null || a.length == 0) return null;
         String min = a[0];
         String max = a[0];
        for (int i = 1; i < a.length; i++)  {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<>(min, max);
    }

    public static <T extends Comparable> T getMiddle(T... a) {
        return a[a.length / 2];
    }

    public static <T extends Comparable> Pair<T> minmaxArray(T[] a) {
        if (a == null || a.length == 0) return null;
        T min = a[0];
        T max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<>(min, max);
    }
}
