 class max {
    public static void main(String[] args) {
        int[] intArray = {23,90,34,11,44,55};

        int maxNum = intArray[0];

        for (int j : intArray) {
            if (j > maxNum)
                maxNum = j;
        }

        System.out.println("Maximum number = " + maxNum);
    }
}