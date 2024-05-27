
import java.util.List;
import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {

//Normal array of size 10
String[] namesArray = new String[10];

//Creates a blank string Array list
List<String> nameList = new ArrayList<String>();



// adding elements ot Array list

nameList.add("Wolf");
nameList.add("Fox");

// Add to a particular position
nameList.add(1,"Sutter");

System.out.println(nameList);

System.out.println(nameList.size()); //.size() instead of length

//Retreve an element from ArrayList
System.out.println(nameList.get(0));

//Remove elements from arrayList

nameList.remove(0);//Remove element 0
System.out.println(nameList);

//-----------------------------------------------------------

//ArraList with Numbers
List numList = new ArrayList();

numList.add(4);

numList.add(0,7);

System.out.println(numList);
System.out.println(numList.size());

    }
}
