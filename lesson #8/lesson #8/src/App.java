public class App {
    public static void main(String[] args) throws Exception {
double dec = 5.3423;
int num = 923;

System.out.println(2%3);
System.out.println(5%2);

System.out.println();
System.out.println("space");
System.out.println();

System.out.println(String.format("%.3f",dec));
System.out.println(String.format("%12.3f",dec));
System.out.println(String.format("-7.3f",dec));

System.out.println();
System.out.println("space");
System.out.println();

System.out.printf("%.2f\n",dec);
System.out.printf("%d\n",num);
System.out.printf("%-6d\n",num);
System.out.printf("%-6d\n",num);
System.out.printf("%06d\n",num);
}
}
