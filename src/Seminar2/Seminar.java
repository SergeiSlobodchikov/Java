package Seminar2;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Seminar {
    public static void main(String[] args) throws IOException {
        WRITE();
//        String input = "aaaabbbcaaadd";
//        String compressed = compressString(input);
//        System.out.println(compressed); // "a4b3c1a3d2"

    }



        public static void WRITE() {
            String fileName = "test.txt";
            String word = "TEST";
            int count = 10;

            try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
                for (int i = 0; i < count; i++) {
                    writer.println(word);
                }
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.err.println("An error occurred while writing to the file: " + e.getMessage());
            }
        }
    }

//    public static String compressString(String input) {
//        StringBuilder output = new StringBuilder();
//        int count = 1;
//        char currentChar = input.charAt(0);
//        for (int i = 1; i < input.length(); i++) {
//            char c = input.charAt(i);
//            if (c == currentChar) {
//                count++;
//            } else {
//                output.append(currentChar).append(count);
//                currentChar = c;
//                count = 1;
//            }
//        }
//        output.append(currentChar).append(count);
//        return output.toString();
//    }
//}

//        System.out.println(getString(8, 'a', 'b'));

    // true

//        createStringFile(sto());
//        writeToFile(getCurrentFolderContent());

    //    public static String getString(int n, char c1, char c2) {
//        StringBuilder result = new StringBuilder();
//        if (n % 2 == 0) {
//            for (int i = 0; i < n; i++) {
//                result.append(i % 2 == 0 ? c1 : c2);
//            }
//            return result.toString();
//        }
//        return null;
//    }}
//
//    public static boolean isPalindrome(String str) {
//        str = str.replaceAll("\\s", "");
//        StringBuilder reverseStr = new StringBuilder();
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reverseStr.append(str.charAt(i));
//        }
//        return str.equals(reverseStr.toString());
//    }
//}
//
//}

//
//    public static StringBuilder sto() throws IOException {
//        StringBuilder sb = new StringBuilder();
//        sb.append("TEST \n".repeat(100));
//        return sb;
//    }
//
//    public static void createStringFile(StringBuilder sb) throws IOException {
//        try (PrintWriter writer = new PrintWriter("test_string.txt")) {
//            writer.println(sb.toString());
//        } catch (IOException a) {
//            System.err.println("Error writing to file");
//            throw a;
//        }
//    }
//}
//
//
//    public static String[] getCurrentFolderContent() {
//        File dir = new File(".");
//        return dir.list();
//    }
//    public static void writeToFile(String[] content) {
//        try {
//            FileWriter fw = new FileWriter("currentFolder.txt");
//            for (String s : content) {
//                fw.write(s + "\n");
//            }
//            fw.close();
//        } catch (IOException e) {
//            try {
//                FileWriter log = new FileWriter("log.txt");
//                log.write("Error occurred while writing to file: " + e.getMessage());
//                log.close();
//            } catch (IOException e2) {
//                System.out.println("Error occurred while writing to log file: " + e2.getMessage());
//            }
//        }
//    }
//    public static String compressString(String incomingString) {
//        StringBuilder tempString = new StringBuilder();
//        char charOld = incomingString.charAt(0);
//        tempString.append(charOld);
//        for (int i = 1; i < incomingString.length(); i++) {
//            if (charOld != incomingString.charAt(i)) {
//                tempString.append(incomingString.charAt(i));
//                charOld = incomingString.charAt(i);
//            }
//        }
//        return new String(tempString);
//    }
//
//}
//        File newFile = new File("123/conf1.jpeg");
//        try {
//            newFile.createNewFile();

//        String[] lits = file.list(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return name.startsWith("t");
//            }
//        });
//
//        for (String o : lits) {
//            System.out.println(o);
//        }

//public class Seminar {
//    private static final Logger logger = Logger.getLogger("");
//    //    private static final Logger logger = Logger.getLogger(Lesson_6.MainClass.class.getName());
//    public static void main(String[] args) throws IOException {
//
//        LogManager.getLogManager().readConfiguration(new FileInputStream("logging.prop"));
//
//        logger.setLevel(Level.ALL);
//        logger.getHandlers()[0].setLevel(Level.ALL);

//        logger.getHandlers()[0].setFormatter(new Formatter() {
//            @Override
//            public String format(LogRecord record) {
//                return record.getLevel() + "\t" + record.getMessage() + "\t " + record.getMillis() + "\n";
//            }
//        });
//        logger.getHandlers()[0].setFilter(new Filter() {
//            @Override
//            public boolean isLoggable(LogRecord record) {
//                return record.getMessage().startsWith("J");
//            }
//        });
//
//        Handler fileHandler = new FileHandler("mylog.log", true);
//        fileHandler.setLevel(Level.ALL);
//        fileHandler.setFormatter(new SimpleFormatter());
//        logger.addHandler(fileHandler);
//
//        logger.log(Level.SEVERE, "Java");
//        logger.log(Level.INFO, "C#");
//        logger.log(Level.CONFIG, "Python");
//        logger.log(Level.FINE, "JS");

//         OFF
//         SEVERE - важные ошибки
//         WARNING - ошибка
//         INFO - информация
//         CONFIG - параметры
//         FINE - кастомный уровень 1
//         FINER - кастомный уровень 2
//         FINEST - кастомный уровень 3
//         ALL


//        Calculator calculator = new Calculator();
//        System.out.println(calculator.add(2, 2));


//    }
//}
