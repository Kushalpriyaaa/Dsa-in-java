import java.util.Scanner;

public class A4 {
    public static void Reverse(int arr[]) {
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {  // Loop until first is less than last
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter 5 integers:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Reverse(arr);

        System.out.println("Reversed array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");  // Print the reversed array
        }
    }
}
