import java.util.*;

class test
{
  public int largestSquareMatrix(int rows, int cols, int[][] matrix) {
    if(matrix == null || rows == 0 || cols == 0)
      return 0;
    

    int max = 0;
    int[][] dp = new int[rows + 1][cols + 1];

    for(int i = 1; i <= rows; i++){
      for(int j = 1; j <= cols; j++){
        if(matrix[i-1][j-1] == 1){
          dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1])) + 1;
          max = Math.max(max, dp[i][j]);
      }
    }

  }
    System.out.println(max);
    return max * max;
  }
 	
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int cols = sc.nextInt();
    int [][] matrix = new int[rows][cols];
    for(int i = 0; i < rows; i++)
      for(int j = 0; j < cols; j++)
        matrix[i][j] = sc.nextInt();
    
    test obj = new test();
    int result = obj.largestSquareMatrix(rows, cols, matrix);
    System.out.println(result); 
  }
}