class JavaMethod {
    private String methodName;
    private String methodSignature;

    public JavaMethod(String methodName, String methodSignature) {
        this.methodName = methodName;
        this.methodSignature = methodSignature;
    }

    @Override
    public String toString() {
        return methodName + " (" + methodSignature + ")";
    }
}