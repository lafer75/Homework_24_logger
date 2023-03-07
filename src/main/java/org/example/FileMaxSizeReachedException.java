package org.example;
    public class FileMaxSizeReachedException extends RuntimeException {
        String errors;

        public FileMaxSizeReachedException(String errors1) {
            this.errors = errors1;
        }
        public String getErrors() {
            return this.errors;
        }
}
