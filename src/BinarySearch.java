public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int search = -1, flag = 0;
        int lowerBound = 0, upperBound = arr.length - 1, mid = 0;
        while (lowerBound <= upperBound) {
            mid = lowerBound + (upperBound - 1) / 2;
            if (arr[mid] == search)
                flag = 1;

            if (arr[mid] < search)
                lowerBound = mid + 1;
            else
                upperBound = mid - 1;
        }
        if (flag == 0)
            System.out.println("Not found");
        else
            System.out.println("Element found");
    }
}
