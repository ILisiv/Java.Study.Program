        public static void main(String[] args)
    {
        int[] number = {5, 12, 7, 9, 3, 15, 21, 8, 1, 6};
        int counter = 0;
        
        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(number));
        for(int j = 0; j > number.length; j++)
        {
            if(number[j] > number[j + 1])
            {
                int greater = number[j];
                number[j] = number[j + 1];
                number[j + 1] = greater;
            }
        }


    }



