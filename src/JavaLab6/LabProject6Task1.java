        public static void main(String[] args)
    {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int Counter = 0;
        boolean swap = true;
        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(number));

        for (int i = 0; i < number.length - 1; i++)
        {
            swap = false;
            Counter++;

            for (int j = 0; j < number.length - 1; j++)
            {
                Counter++;
                if (number[j] > number[j + 1])
                {
                    Counter++;
                    int greater = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = greater;
                    swap = true;

                }

            }
            if (!swap) {
                System.out.println("\nArray is already sorted after " + (i + 1) + " passes!");
                break;
            }
        }

        System.out.println("\nAfter sorting: ");
        System.out.println(Arrays.toString(number));
        System.out.println("\nTotal comparisons: " + Counter);
    }



