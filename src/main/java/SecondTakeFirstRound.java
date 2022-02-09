import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondTakeFirstRound {

  public static void main(String[] args) {
    int[] values = {8 ,1 ,5 ,4 ,10,4,15,4,20,1,15,1,20,6,16,25,40};
    System.out.println("\n" +reports(values));
  }

  public static long reports(int[] reports){
    int counter = 0;
    List<Integer[]> ranges = new ArrayList<>();
    for(int i = 1; i< reports[0]*2; i++,i++){
      ranges.add(new Integer[]{reports[i],reports[i+1]});
    }
    Collections.sort(ranges,(a,b)->a[0].compareTo(b[0]));
    Integer[] current=ranges.get(0);
    for(int i=1; i< ranges.size(); i++){
      //do not collide
      if (ranges.get(i)[0] > current[1]) {
        counter += current[1]-current[0] +1;
        current = ranges.get(i);
      }
      else {
        current[1] = current[1] >= ranges.get(i)[1] ? current[1] : ranges.get(i)[1];
      }
      if(i+1 == ranges.size()){
        counter += current[1]-current[0] +1;
      }

    }

    return counter;
  }
}
