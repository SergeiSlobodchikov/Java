package praktika;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Log {
    public static void main(String[] args) throws IOException {
        Logger logger = (Logger) log();
        logger.log(Level.WARNING, "Тестовое логирование rr");
        logger.info("Тестовое логирование rr2");
//        try {
//
//        } catch ()
        }

    public static Object log() throws IOException {
        Logger logger = Logger.getLogger(Log.class.getName());
        FileHandler fh = new FileHandler("src/praktika/log.log");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        return logger;
    }
}




