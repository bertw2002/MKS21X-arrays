
public class ArrayDemo{
  public static void printArray(int[]ary){
    String var = "";
    for (int x = 0; x < ary.length; x ++){
      if (x != ary.length - 1){
        var += ary[x] + ", ";
      }else{
        var += ary[x];
      }
    }
    return var;
  }
  public static void printArray(int[][]ary){
    String var = "";
    for (int x = 0; x < ary.length; x ++){
      for (int y = 0; y < ary[].length; y++){
        if (x != ary.length - 1){
          var += ary[x][y] + ", ";
        }else{
          var += ary[x][y];
        }
      }

    }
    return var;
  }
}
