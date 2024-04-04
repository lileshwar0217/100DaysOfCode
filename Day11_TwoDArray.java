class Day11_2DArray {
    public static void main(String[] args) {
        
        int[][] twoDArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

       
        System.out.println("Element at row 1, column 2: " + twoDArray[0][1]);
        System.out.println("Element at row 2, column 3: " + twoDArray[1][2]);

     
        System.out.println("Printing the 2D array:");
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
