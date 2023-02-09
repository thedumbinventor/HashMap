//import java.util.Arrays;
//import java.util.Scanner;
//
//public class StringAlphabetSort {
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        String word=scanner.next();
//        int arr[]=new int[word.length()];
//        for(int i=0;i<arr.length;i++)
//        {
//            arr[i]=word.charAt(i);
//        }
//        for(int i=0;i< arr.length-1;i++)
//        {
//            for(int j=0;j<arr.length-i-1;j++)
//            {
//                if(arr[j]<arr[j+1])
//                {
//                    char c=(char)arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=c;
//                }
//            }
//        }
//        for(int i=0;i<arr.length;i++)
//        {
//            System.out.print((char)arr[i]);
//        }
//
//
//    }
//}
