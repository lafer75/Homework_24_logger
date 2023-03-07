package org.example;


public class FileLoggerConfiguration {
    private static LoggingLevel level;
    private static String filePath;
    private final int limit;


    public FileLoggerConfiguration(LoggingLevel level, String filePath, int lim) {
        FileLoggerConfiguration.level = level;
        FileLoggerConfiguration.filePath = filePath;
        this.limit = lim;
    }

    public int getLimit() {
        return limit;
    }

    public static LoggingLevel getLevel() {
        return level;
    }

    public String getFilePath() {
        return filePath;
    }


}

