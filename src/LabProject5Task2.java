
public static void main()
{
    int[] arr = new int[10];
    Random rand = new Random();
    for (int i = 0; i < arr.length; i++) {
        arr[i] = rand.nextInt(100) + 1;
    }
    int min = arr[0];
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    System.out.print("Array: ");
    for (int num : arr) {
        System.out.print(num + " ");
    }
    System.out.println();
    System.out.println("Minimum: " + min);
    System.out.println("Maximum: " + max);
}

