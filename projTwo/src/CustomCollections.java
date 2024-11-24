
import java.util.Comparator;
import java.util.List;

public class CustomCollections {
    // MARK: - Binary Search for List
    public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key) {
        return binarySearch(list, 0, list.size(), key);
    }
    public static <T> int binarySearch(List<? extends Comparable<? super T>> list, int fromIndex, int toIndex, T key) {
        while (fromIndex < toIndex) {
            int mid = fromIndex + (toIndex - fromIndex) / 2;
            int cmp = list.get(mid).compareTo(key);
            if (cmp < 0) {
                fromIndex = mid + 1;
            } else if (cmp > 0) {
                toIndex = mid;
            } else {
                return mid;
            }
        }
        return -(fromIndex + 1);
    }

    // MARK: -  BS List
    public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c) {
        return binarySearch(list, 0, list.size(), key, c);
    }
    public static <T> int binarySearch(List<? extends T> list, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
        while (fromIndex < toIndex) {
            int mid = fromIndex + (toIndex - fromIndex) / 2;
            int cmp = c.compare(list.get(mid), key);
            if (cmp < 0) {
                fromIndex = mid + 1;
            } else if (cmp > 0) {
                toIndex = mid;
            } else {
                return mid;
            }
        }
        return -(fromIndex + 1);
    }
}