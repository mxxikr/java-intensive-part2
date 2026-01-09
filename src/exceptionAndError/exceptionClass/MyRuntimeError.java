package exceptionAndError.exceptionClass;

class MyRuntimeError extends NullPointerException {
    MyRuntimeError(String param) {
        msg = param;
    }
    public String msg;
}