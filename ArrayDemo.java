  public class ArrayDemo{

//0a
  public static void printArray(int[]ary){
    for (int x = 0; x < ary.length; x ++){
      if (x != ary.length - 1){
        System.out.print(ary[x] + ", ");
      }else{
        System.out.print(ary[x]);
      }
    }
  }


//0b
  public static void printArray(int[][]ary){
    int counter = 0;
    for (int x = 0; x < ary.length; x++){
      for (int y = 0; y < ary[x].length; y++){
          System.out.print(ary[x][y] + " ");
      }
      System.out.println();
    }
  }

//1
    public static int countZeros2D(int[][] nums){
      int val = 0;
      for (int x = 0; x < nums.length; x++){
        for (int y = 0; y < nums[x].length; y++){
          if (nums[x][y] == 0){
            val ++;
          }
        }
      }
      return val;
    }

//2a
    public static void fill2D(int[][] vals){
      for (int x = 0; x < vals.length; x++){
        for (int y = 0; y < vals[x].length; y++){
          if (x != y){
            vals[x][y] = 1;
          }else{
            vals[x][y] = 3;
          }
        }
      }
      printArray(vals);
    }

//2b
    public static int[][] fill2DCopy(int[][] vals){
      int[][] newarr = new int[vals.length][vals[0].length];
      for (int x = 0; x < vals.length; x++){
        for (int y = 0; y < vals[x].length; y++){
          if (vals[x][y] < 0){
            newarr[x][y] = 3;
          } else{
            newarr[x][y] = 1;
          }
        }
      }
      return newarr;
    }


    public static void main(String[] args){
      int[][] negarr = {
        {-3,4,7,8,9,-100},
        {-4,-3,-2,3,4,5}
      };
      int[] array = {
        0,0,1,2,3,4,5,6,7
      };

      int[][] ar = {
        {0,1,4,6,6},
        {3,4,8,0,3}
      };
      printArray(array);
      System.out.println();
      System.out.println();
      printArray(ar);
      System.out.println();
      System.out.println(countZeros2D(ar));
      System.out.println();
      fill2D(ar);
      System.out.println();
      printArray(fill2DCopy(negarr));
      }
}
