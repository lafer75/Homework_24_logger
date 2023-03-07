package org.example;

import java.io.File;
import java.io.FileOutputStream;

import java.time.LocalDateTime;


public class FileLogger {
    private static FileLoggerConfiguration Logger;

    public static void setUpLogger(FileLoggerConfiguration config) {
        Logger = config;
    }

    public static void logger(String text) throws Exception {
        if (FileLoggerConfiguration.getLevel() == LoggingLevel.DEBUG) {
            debug(text);
            info(text);
        } else {
            info(text);
        }
        File file = new File(Logger.getFilePath());
        if (file.length() > Logger.getLimit())
            throw new FileMaxSizeReachedException("Ліміт файлу - " + Logger.getLimit() + " " + " величина файлу :" + file.length() + "  шлях : " + Logger.getFilePath());
    }

    public static void debug(String errors) throws Exception {
        FileOutputStream deb = new FileOutputStream(Logger.getFilePath(), true);
        errors = LocalDateTime.now() + " : Левел " + LoggingLevel.DEBUG + " : " + errors;
        byte[] bytes = errors.getBytes();
        deb.write(bytes);
        deb.close();
    }

    public static void info(String errors) throws Exception {
        FileOutputStream inf = new FileOutputStream(Logger.getFilePath(), true);
        errors = LocalDateTime.now() + " : Левел " + LoggingLevel.INFO + " : " + errors;
        byte[] bytes = errors.getBytes();
        inf.write(bytes);
        inf.close();
    }
}