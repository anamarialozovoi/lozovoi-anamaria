public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("Application started");
        logger.log("Processing input...");
        logger.log("Finished processing input");
        logger.log("Generating output...");
        logger.log("Finished generating output");
        logger.log("Application ended");

        System.out.println(logger.getLogContents());
    }
}
