class min {
    public static void main(String[] args) {
        int[] intArray = {23,90,34,11,44,55};

        int minNum = intArray[0];

        for (int j : intArray) {
            if (j < minNum)
                minNum = j;
        }

        System.out.println("Minimum number = " + minNum);
    }
}