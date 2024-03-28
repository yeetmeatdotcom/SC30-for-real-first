public class App {
    public static void main(String[] args) throws Exception {
  String message1 = "I am very happy!";
  String target1 = "very ";

  String message2 = "that was great - lol.";
  String target2 = "lol";

        // Part one
        int startIndex1 = message1.indexOf(target1);
        if (startIndex1 != -1) { // If the target string is found
            int endIndex1 = startIndex1 + target1.length(); // Calculate end index
            String newMessage1 = message1.substring(0, startIndex1) + message1.substring(endIndex1);
            System.out.println("Part one:");
            System.out.println("Original Message: " + message1);
            System.out.println("New Message: " + newMessage1);
        } else {
            System.out.println("Part one:");
            System.out.println("Target string 'very ' not found in message1");
        }

        // Part two
        String newMessage2 = message2.replace(target2, "laugh out loud");
        System.out.println("\nPart two:");
        System.out.println("Original Message: " + message2);
        System.out.println("New Message: " + newMessage2);


    }
}
