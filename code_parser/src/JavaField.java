class JavaField {
    private String fieldName;
    private String fieldType;

    public JavaField(String fieldName, String fieldType) {
        this.fieldName = fieldName;
        this.fieldType = fieldType;
    }

    @Override
    public String toString() {
        return fieldName + " (" + fieldType + ")";
    }
}