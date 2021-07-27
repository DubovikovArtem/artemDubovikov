package lesson8;

public class Logger {
    public static final String DEBUG = "debug";
    public static final String INFO = "info";
    public static final String WARN = "warn";
    public static final String ERROR = "error";

    public static void startLogging(String action, String msg) {
        switch (action) {
            case "debug":
                System.out.println(color.changeColor(BLUE) + DEBUG.toUpperCase() + " : " + msg);
                break;
            case "info":
                System.out.println(color.changeColor(GREEN) + INFO.toUpperCase() + " : " + msg);
                break;
            case "warn":
                System.out.println(color.changeColor(YELLOW) + WARN.toUpperCase() + " : " + msg);
                break;
            case "error":
                System.out.println(color.changeColor(RED) + ERROR.toUpperCase() + " : " + msg);
                break;
            default:
                System.out.println("Action must be " + color.changeColor(YELLOW) + "'debug','info','warn','error'");
        }
    }

    public static final String RED = "red";
    public static final String GREEN = "green";
    public static final String YELLOW = "yellow";
    public static final String BLUE = "blue";

    public enum color {
        ANSI_RESET("\u001B[0m"),
        ANSI_RED("\u001B[31m"),
        ANSI_GREEN("\u001B[32m"),
        ANSI_YELLOW("\u001B[33m"),
        ANSI_BLUE("\u001B[34m");

        private String color;

        color(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public static String changeColor(String colorName) {
            String color;
            switch (colorName) {
                case "red":
                    color = Logger.color.ANSI_RED.getColor();
                    break;
                case "green":
                    color = Logger.color.ANSI_GREEN.getColor();
                    break;
                case "yellow":
                    color = Logger.color.ANSI_YELLOW.getColor();
                    break;
                case "blue":
                    color = Logger.color.ANSI_BLUE.getColor();
                    break;
                default:
                    color = Logger.color.ANSI_RESET.getColor();
            }
            return color;
        }
    }
}
