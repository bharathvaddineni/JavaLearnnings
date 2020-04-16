package aBC;

public class MultiArrays {

	public static void main(String[] args) {

		int[] values = {1, 6, 2};
         
        System.out.println(values[1]);
         
        int[][] grid = {
            {1, 2, 3, 4, 5, 6},
            {1, 2},
            {1}
        };
         
        System.out.println(grid[0][4]);
        System.out.println(grid[2][0]);
         
        String[][] texts = new String[2][3];
         
        texts[0][1] = "Hello there";
         
        System.out.println(texts[0][1]);
         
        for(int row=0; row < grid.length; row++) {
            for(int col=0; col < grid[row].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
             
            System.out.println();
        }
         
        String[][] words = new String[2][];
         
        System.out.println(words[0]);
        words[0] = new String[3];
         
        words[0][1] = "I'm learining Java";
         
        System.out.println(words[0][1]);


	}

}
