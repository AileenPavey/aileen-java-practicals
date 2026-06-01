public class StringFunctions {
    public static void main(String[] args) {

        // 1. Concatenation
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + " " + s2;
        System.out.println("Concatenation: " + s3);

        // 2. Comparison
        String a = "Java";
        String b = "Java";
        System.out.println("Comparison: " + a.equals(b));

        // 3. Reversal
        String str = "Hello";
        String rev = "";
        for(int i = str.length()-1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Reversed String: " + rev);

        // 4. Formatting
        String name = "Alice";
        int marks = 90;
        System.out.printf("Name: %s, Marks: %d\n", name, marks);

        // 5. Performance Comparison
        long start, end;

        // String (slow)
        start = System.currentTimeMillis();
        String s = "";
        for(int i = 0; i < 10000; i++) {
            s += "a";
        }
        end = System.currentTimeMillis();
        System.out.println("String Time: " + (end - start));

        // StringBuffer
        start = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < 10000; i++) {
            sb.append("a");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuffer Time: " + (end - start));

        // StringBuilder
        start = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder();
        for(int i = 0; i < 10000; i++) {
            sb2.append("a");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (end - start));
    }
}