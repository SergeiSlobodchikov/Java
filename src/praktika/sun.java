package praktika;

public class sun {

    public static void main(String[] args) {
        // Строки с числами
        String str1 = "125874";
        String str2 = "4512";

        int len1 = str1.length();
        int len2 = str2.length();
        // Матрица для хранения результатов
        int[][] arr = new int[len1 + 1][len2 + 1];
        // Заполнение матрицы
        for (int i = 0; i <= len1; i++) {
            for (int j = 0; j <= len2; j++) {

                // Базовые случаи
                if (i == 0 || j == 0) {
                    arr[i][j] = 0;

                    // Сравнение символов
                } else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    arr[i][j] = 1 + arr[i - 1][j - 1];

                    // Наилучшее из двух возможных вариантов
                } else {
                    arr[i][j] = Math.max(arr[i - 1][j], arr[i][j - 1]);
                }
            }
        }
        // Восстановление максимальной последовательности
        int i = len1;
        int j = len2;
        StringBuilder result = new StringBuilder();

        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                result.append(str1.charAt(i - 1));
                i--;
                j--;
            } else if (arr[i - 1][j] > arr[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        // Вывод полученной последовательности
        System.out.println("Максимальная последовательность: " + result.reverse());
        System.out.println("Максимальная последовательность: " + result.reverse());
    }

}
