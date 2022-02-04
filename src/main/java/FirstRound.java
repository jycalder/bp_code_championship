import java.util.Arrays;

public class FirstRound {

  public static void main(String[] args) {
    int[] values = {2 ,1 ,5 ,6 ,10};
    System.out.println(reports(values));
  }

  public static long reports(int[] reports){
    int[] values = new int[10];
    Arrays.fill(values,0);

    for(int i = 0; i< reports[0];i++) {
      int start = i == 0 ? 0 : (i*2)-1;
      int end = i == 0 ? 1 : i*2;
      values[start]=1;
      values[end]=2;
    }
    int totalOpen = 0;
    int counter = 0;
    for(int i = 0; i< values.length;i++){
      System.out.print(values[i] +",");
      if(values[i] == 1){
        ++totalOpen;
      }
      else if( values[i] == 2) {
        --totalOpen;
        if(totalOpen == 0){
          ++counter;
        }
      }
      if(totalOpen> 0){
        ++counter;
      }
    }

    System.out.println("");
    return counter;
  }
}
