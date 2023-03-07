package org.example;

public class Main {
    private static FileLoggerConfiguration FileLoggerConfiguration;

    public static void main(String[] args) throws Exception {
        FileLoggerConfiguration fileLoggerConfiguration = new FileLoggerConfiguration(LoggingLevel.DEBUG, "C:\\Users\\fafo8\\IdeaProjects\\Homework_logger_24\\src\\main\\java\\org\\example\\logger", 999);
        FileLogger.setUpLogger(fileLoggerConfiguration);
        try {
            FileLogger.logger(" 1 text \n");
            FileLogger.logger(" 2 text \n");
            FileLogger.logger(" 3 text \n");
            FileLogger.logger(" 4 text \n");
        } catch (FileMaxSizeReachedException ex) {
            System.out.println(ex.getErrors());
        }

    }
}