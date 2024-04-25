public class App {

private int fun;

public void change(){
    int fun = 99;
    System.out.println(fun);
}
public void print(){
    System.out.println(fun);
}
    public static void main(String[] args) throws Exception {
        App test = new App();
        test.print();
        test.change();
    }
}
