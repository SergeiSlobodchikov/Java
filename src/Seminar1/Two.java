//Вывести все простые числа от 1 до 1000
public class Two {
    public static void main(String[] args) {
        int k = 0;
        // Выводим простые числа
        System.out.println("Простые числа от 1 до 1000:");
        for (int i = 2; i <= 1000; i++) {
            boolean isPrimeNumber = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                System.out.print(i + " ");
                k++;
                // Здесь я решил после каждого десятого числа новая строка
                if (k % 10 == 0){
                    System.out.println();
                }

            }
        }
    }
}

