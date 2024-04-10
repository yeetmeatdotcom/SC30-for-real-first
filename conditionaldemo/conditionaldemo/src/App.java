public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        int x = -1;

        // This conditiom check if x over 5
        if (x>5){
            System.out.println("BIG NUMBER");}
            // this is -12 < x < 5 because 5 ready checked
            else if (x > -12) {
                System.out.println("Mild weather");
            }
            // this is x =< -12 becasue the others have been checkd 
            else {
                System.out.println("very cold");

            }
        
    
             boolean isCold = false;

               if (!isCold) {
               System.out.println("war a coat");
             System.out.println("war a Gloves");
        }
    }
}


