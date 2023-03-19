package Seminar6.HomeWork;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        NoteBook notebook1 = new NoteBook("HP", 8, 512, "Windows 10", "черный", 14,60000.0 );
        NoteBook notebook2 = new NoteBook("Dell", 32, 1024, "Windows 11", "серый", 17,99000.0 );
        NoteBook notebook3 = new NoteBook("Apple", 16, 512, "macOS", "серебристый", 15,150000.0 );
        NoteBook notebook4 = new NoteBook("Lenovo", 8, 256, "Windows 10", "синий", 13, 32990.0);
        NoteBook notebook5 = new NoteBook("ASUS", 16, 512, "Windows 10", "белый", 14,47000.0 );

        Set<NoteBook> notebooks = new HashSet<>(Arrays.asList(notebook1, notebook2, notebook3, notebook4, notebook5));
        for (int i = 0; i < 1000; i++) {
            NoteBook notebook = new NoteBook();
            notebooks.add(notebook);
        }
        Menu.menu(notebooks);
    }
}
