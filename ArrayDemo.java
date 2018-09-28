  public class ArrayDemo{

    public static void printArray(int[][]ary){
      int counter = 0;
      for (int x = 0; x < ary.length; x++){
        for (int y = 0; y < ary[x].length; y++){
            System.out.print(ary[x][y] + " ");
        }
        System.out.println();
      }
    }




    public static void printArray(int[]ary){
      for (int x = 0; x < ary.length; x ++){
        if (x != ary.length - 1){
          System.out.print(ary[x] + ", ");
        }else{
          System.out.print(ary[x]);
        }
      }
    }

    public static void main(String[] args){

      int[] array = {
        3,4,5,67,8,9,9,3
      };

      int[][] ar = {
        {1,23,4,6,6},
        {3,4,56,7,3}
      };
      printArray(array);
      System.out.println();
      System.out.println();
      printArray(ar);
      }
}
