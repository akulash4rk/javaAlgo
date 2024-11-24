
import java.util.Comparator;

public class CustomArrays {

    //MARK: - Test
    public static void main(String[] args) {
        // Примеры массивов для тестирования
        byte[] byteArray = {1, 2, 3, 4, 5};
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        int[] intArray = {1, 2, 3, 4, 5};
        long[] longArray = {1L, 2L, 3L, 4L, 5L};
        short[] shortArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"apple", "banana", "cherry", "date", "elderberry"};


        // Вызов методов
        int byteIndex = CustomArrays.binarySearch(byteArray, (byte) 3);
        int charIndex = CustomArrays.binarySearch(charArray, 'e');
        int doubleIndex = CustomArrays.binarySearch(doubleArray, 3.3);
        int floatIndex = CustomArrays.binarySearch(floatArray, 3.3f);
        int intIndex = CustomArrays.binarySearch(intArray, 3);
        int longIndex = CustomArrays.binarySearch(longArray, 3L);
        int shortIndex = CustomArrays.binarySearch(shortArray, (short) 3);


        // Вызов методов с индексами
        int byteIndexRange = CustomArrays.binarySearch(byteArray, 1, 4, (byte) 3);
        int charIndexRange = CustomArrays.binarySearch(charArray, 1, 4, 'c');
        int doubleIndexRange = CustomArrays.binarySearch(doubleArray, 1, 4, 3.3);
        int floatIndexRange = CustomArrays.binarySearch(floatArray, 1, 4, 3.3f);
        int intIndexRange = CustomArrays.binarySearch(intArray, 1, 4, 3);
        int longIndexRange = CustomArrays.binarySearch(longArray, 1, 4, 3L);
        int shortIndexRange = CustomArrays.binarySearch(shortArray, 1, 4, (short) 3);


        // Вызов методов с компаратором
        int stringIndex = CustomArrays.binarySearch(stringArray, "cherry", Comparator.naturalOrder());
        int stringIndexRange = CustomArrays.binarySearch(stringArray, 1, 4, "cherry", Comparator.naturalOrder());


        // Вывод результатов
        System.out.println("Byte Index: " + byteIndex);
        System.out.println("Char Index: " + charIndex);
        System.out.println("Double Index: " + doubleIndex);
        System.out.println("Float Index: " + floatIndex);
        System.out.println("Int Index: " + intIndex);
        System.out.println("Long Index: " + longIndex);
        System.out.println("Short Index: " + shortIndex);

        System.out.println("Byte Index Range: " + byteIndexRange);
        System.out.println("Char Index Range: " + charIndexRange);
        System.out.println("Double Index Range: " + doubleIndexRange);
        System.out.println("Float Index Range: " + floatIndexRange);
        System.out.println("Int Index Range: " + intIndexRange);
        System.out.println("Long Index Range: " + longIndexRange);
        System.out.println("Short Index Range: " + shortIndexRange);

        System.out.println("String Index: " + stringIndex);
        System.out.println("String Index Range: " + stringIndexRange);
    }


    // MARK: - BS byte
    public static int binarySearch(byte[] a, byte key) {
        return binarySearch(a, 0, a.length, key);
    }


    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        while (fromIndex < toIndex) {
            int mid = fromIndex + (toIndex - fromIndex) / 2;
            if (a[mid] < key) {
                fromIndex = mid + 1;
            } else if (a[mid] > key) {
                toIndex = mid;
            } else {
                return mid;
            }
        }
        return -(fromIndex + 1);
    }

    // MARK: - BS char
    public static int binarySearch(char[] a, char key) {
        return binarySearch(a, 0, a.length, key);
    }
    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        while (fromIndex < toIndex) {
            int mid = fromIndex + (toIndex - fromIndex) / 2;
            if (a[mid] < key) {
                fromIndex = mid + 1;
            } else if (a[mid] > key) {
                toIndex = mid;
            } else {
                return mid;
            }
        }
        return -(fromIndex + 1);
    }

    // MARK: - BS double
    public static int binarySearch(double[] a, double key) {
        return binarySearch(a, 0, a.length, key);
    }
    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        while (fromIndex < toIndex) {
            int mid = fromIndex + (toIndex - fromIndex) / 2;
            if (a[mid] < key) {
                fromIndex = mid + 1;
            } else if (a[mid] > key) {
                toIndex = mid;
            } else {
                return mid;
            }
        }
        return -(fromIndex + 1);
    }


    public static int binarySearch(float[] a, float key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        while (fromIndex < toIndex) {
            int mid = fromIndex + (toIndex - fromIndex) / 2;
            if (a[mid] < key) {
                fromIndex = mid + 1;
            } else if (a[mid] > key) {
                toIndex = mid;
            } else {
                return mid;
            }
        }
        return -(fromIndex + 1);
    }

    public static int binarySearch(int[] a, int key) {
        return binarySearch(a, 0, a.length, key);
    }
    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        while (fromIndex < toIndex) {
            int mid = fromIndex + (toIndex - fromIndex) / 2;
            if (a[mid] < key) {
                fromIndex = mid + 1;
            } else if (a[mid] > key) {
                toIndex = mid;
            } else {
                return mid;
            }
        }
        return -(fromIndex + 1);
    }

    public static int binarySearch(long[] a, long key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        while (fromIndex < toIndex) {
            int mid = fromIndex + (toIndex - fromIndex) / 2;
            if (a[mid] < key) {
                fromIndex = mid + 1;
            } else if (a[mid] > key) {
                toIndex = mid;
            } else {
                return mid;
            }
        }
        return -(fromIndex + 1);
    }

    public static int binarySearch(short[] a, short key) {
        return binarySearch(a, 0, a.length, key);
    }

    public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        while (fromIndex < toIndex) {
            int mid = fromIndex + (toIndex - fromIndex) / 2;
            if (a[mid] < key) {
                fromIndex = mid + 1;
            } else if (a[mid] > key) {
                toIndex = mid;
            } else {
                return mid;
            }
        }
        return -(fromIndex + 1);
    }

    // MARK: - Binary Search for generic type with Comparator
    public static <T> int binarySearch(T[] a, T key, Comparator<? super T> c) {
        return binarySearch(a, 0, a.length, key, c);
    }
    public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
        while (fromIndex < toIndex) {
            int mid = fromIndex + (toIndex - fromIndex) / 2;
            int cmp = c.compare(a[mid], key);
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
