public class HomeWork {
    public static void main(String[] args) {
        System.out.println(normalizeString("Добрый день             Как дела                   Все хорошо"));
    }
    public static String normalizeString(String str) {
        String stroka = str.trim().replaceAll("\\s+", " ") + ".";
        for (int i = 0; i <  stroka.length(); i++) {
            char c = stroka.charAt(i);
            if (Character.isUpperCase(c) && i > 0) {
                String zagl = ". " + c;
                stroka = stroka.replaceAll(String.valueOf(c), zagl);
                i += 2;
            }
        }
        stroka = stroka.replaceAll(" . ", ". ");
        return stroka;
    }
}
