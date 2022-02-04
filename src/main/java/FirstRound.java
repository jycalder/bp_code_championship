import java.util.Arrays;

public class FirstRound {

  public static void main(String[] args) {
    int[] values = {2 ,1 ,5 ,6 ,10};
    System.out.println(reports(values));
  }

  public static long reports(int[] reports){
    int[] values = new int[10];
    Arrays.fill(values,0);

    for(int i = 1; i< reports[0]*2;) {
      values[reports[i]-1]= 1;
      ++i;
      values[reports[i]-1]=2;
      ++i;
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
