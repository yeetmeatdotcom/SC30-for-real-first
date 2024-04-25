public class App {
    public static void main(String[] args) throws Exception {
        Triangle test = new Triangle(1,1,1);
        test.print();
    
        test.setSides(4,4,4);
        test.print();
    
        test.setSides(1,56,22);
        test.print();
    }
}
