package Strings;

public class StringInitialisation {
    public static void main(String[] args) {
        String first = "Hello"; // In String Constant Pool
        String second = "Hello"; // In String Constant Pool
        String str1 = new String("Namaste"); // In Heap Memory
        String str2 = new String("Namaste"); // In Heap Memory
        /*
         * Here, `first` and `second` will be created in the
         * String Constant Pool and will refer to the same object
         * for memory efficiency
         * 
         * But, `str1` and `str2` will be created in Heap memory
         * and will refer to different string objects.
         */

        // Compares the object reference (whether they point to the same memory
        // location)
        if (first == second)
            System.out.println("'first' & 'second' point to the same object.");
        // Compares the object reference (will evaluate to false)
        if (str1 == str2)
            System.out.println("This is will not be printed (different objects).");
        // Compares the values in the objects
        if (str1.equals(str2))
            System.out.println("'str1' and 'str2' have the same value.");
    }
}
