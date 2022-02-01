public class ErrorTest {

    private long ErrorNumber;
    private String ErrorName;


    public ErrorTest(long errorNumber, String errorName) {
        ErrorNumber = errorNumber;
        ErrorName = errorName;
    }


    public long getErrorNumber() {
        return ErrorNumber;
    }

    public String getErrorName() {
        return ErrorName;
    }
}
