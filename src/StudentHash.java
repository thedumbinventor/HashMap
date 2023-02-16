//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class StudentHash {
//    public static void main(String[] args) {
//        Map<String, Integer> studentMap = new HashMap<>();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("EnterDetails");
//        while (scanner.hasNextLine()) {
//            String line = scanner.nextLine();
//            if (line.isEmpty()) {
//                break;
//            }
//            String[] parts = line.split(" ");
//            String name = parts[0];
//            int studentId = Integer.parseInt(parts[1]);
//            studentMap.put(name, studentId);
//        }
//        System.out.println("Information");
//        for (Map.Entry<String, Integer> entry : studentMap.entrySet()) {
//            System.out.println("Name: " + entry.getKey() + ", ID: " + entry.getValue());
//        }
//    }
//}
