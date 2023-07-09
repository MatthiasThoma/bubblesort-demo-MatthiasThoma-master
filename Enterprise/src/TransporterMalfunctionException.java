public class TransporterMalfunctionException extends Exception{
    public TransporterMalfunctionException() {
    }

    public TransporterMalfunctionException(String message) {
        super(message);
    }

    public TransporterMalfunctionException(String message, Throwable cause) {
        super(message, cause);
    }

    public TransporterMalfunctionException(Throwable cause) {
        super(cause);
    }

    public TransporterMalfunctionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
