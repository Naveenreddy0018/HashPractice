import java.util.Map;
import java.util.HashMap;

public class HashPractice {
    // public static int customHashFunction(String input){
    //     int hashCode=0;
    //     for(int i=0;i<input.length();i++){
    //         hashCode += input.charAt(i);
    //     }
    //     return hashCode;

    // }
    // public static void main(String[] args) {
    //     Map<Integer, String> dataMap = new HashMap<>();

    //     String name = "Naveen";
    //     int hashCode = name.hashCode();

    //     dataMap.put(hashCode, name);
    //     String outputName = dataMap.get(hashCode);
    //     System.out.println("Name : " +outputName);
    // }
    public static void main(String[] args) {
        Map<Integer, String> dataMap = new HashMap<>();

        String name = "Naveen";
        int hashCode = name.hashCode();
        System.out.println(hashCode);
        // Key => hashCode
        dataMap.put(hashCode, name);
        String outputName = dataMap.get(hashCode);   
        System.out.println("Name: " + outputName);
    }
}
