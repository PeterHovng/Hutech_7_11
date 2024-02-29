public class Calculation {
    private int a;
    private int b;

    public Calculation (int a, int b){
        this.a=a;
        this.b=b;
    }

    public int sum(){
        return a+b;
    }

    public int minus(){
        return a-b;
    }

    public static void main(String[] args){
        Calculation cal= new Calculation(5, 7);
        System.out.println(cal.sum());
    }
}