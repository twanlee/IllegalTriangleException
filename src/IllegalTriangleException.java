public class IllegalTriangleException extends  Exception{
    private String errorMes;
    public IllegalTriangleException(String errorMes){
        this.errorMes = errorMes;
    }

    public String getErrorMes() {
        return errorMes;
    }

    public void setErrorMes(String errorMes) {
        this.errorMes = errorMes;
    }
}
