public class Triangle {
    private int a;
    private int b;
    private int c;
    public Triangle(){};
    public Triangle(int a, int b, int c){
        this.a = a;
        this.b= b;
        this.c = c;
    }
    public Boolean check(){
        if(a+b>c && b+c>a && c+a>b) return true;
        else return false;

    }
    public int getParameter() throws IllegalTriangleException{
        if(check()){
            return a+b+c;
        }
        else throw new IllegalTriangleException("Not a triangle");
    }
}
