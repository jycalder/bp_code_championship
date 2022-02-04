public class FirstRound {

  public static void main(String[] args) {

  }

  public static long reports(int[] reports){
    int[] values = new int[50000000];

    for(int i = 1; i< reports[0];i++)
    {
      values[(i*2)-1]=1;
      values[i*2]=2;
    }
    int totalOpen = 0;
    int counter = 0;
    for(int i = 0; i< values.length;i++){
      if(values[i] == 1){
        ++totalOpen;
      }
      else if( values[i] == 2)
      {
        --totalOpen;
        if(totalOpen == 0){
          ++counter;
        }
      }
      if(totalOpen> 0){
        ++counter;
      }
    }

    return counter;
  }
}
