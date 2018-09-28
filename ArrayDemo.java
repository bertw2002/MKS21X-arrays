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
}
