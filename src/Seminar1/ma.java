public class ma {
    public static void main(String[] args) {
        getString(8,'a','b');

    }
    public static String getString(int n, char c1, char c2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(i % 2 == 0 ? c1 : c2);
        }
        return result.toString();
    }
}