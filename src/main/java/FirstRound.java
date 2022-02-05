import java.util.Arrays;

public class FirstRound {

  public static void main(String[] args) {
    int[] values = {8 ,1 ,5 ,4 ,10,4,15,4,20,1,15,1,20,6,16,25,40};
    System.out.println("\n" +reports(values));
  }

  public static long reports(int[] reports){
    int[] values = new int[50000000];
    Arrays.fill(values,0);

    for(int i = 1; i< reports[0]*2;) {
      values[reports[i]-1]-= 1;
      ++i;
      values[reports[i]-1]+=1;
      ++i;
    }
    int totalOpen = 0;
    int counter = 0;
    for(int i = 0; i< values.length;i++){
      //System.out.print(values[i] + ",");
      if(values[i] > 0 && (totalOpen + values[i]) == 0){
        ++counter;
      }
      totalOpen += values[i];
      if(totalOpen != 0){
        ++counter;
      }
    }

    return counter;
  }
}
