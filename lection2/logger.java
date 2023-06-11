package lection2;

import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

public class logger {
    public static void main(String[] args) {
        log();
        file_nahd();
    }
    public static void log() {
        Logger logger = Logger.getLogger(logger.class.getName());
        ConsoleHandler info = new ConsoleHandler();
        logger.addHandler(info);
        SimpleFormatter sFormat = new SimpleFormatter();
        info.setFormatter(sFormat);
        // XMLFormatter xml = new XMLFormatter();
        // info.setFormatter(xml);
        logger.info("Testing");
    }
    public static void file_nahd() {
        Logger logger = Logger.getLogger(logger.class.getName());
        FileHandler fh = new FileHandler("log.xml");
        logger.addHandler(fh);
        //SimpleFormatter sFormat = new SimpleFormatter();
        //fh.setFormatter(sFormat);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Testing");
    }
}
