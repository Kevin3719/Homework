import java.util.*;
public class dataselecting {
  public int partition ( int [] data, int start, int end){
    Random a = new Random();
    int select = start + a.nextInt(end - start);
    int pivot = data[select];
    int back = 0;
    int front = 0;
    int temp  = 0;
    int output = 0;
    for (int i = start; i < end; i++) {
      if (data[start + front] > pivot) {
        temp = data[start + front];
        data[start + front] = data[end - back];
        data[end - back] = temp;
        back += 1;
      }
      else {
        if (data[start + front] == pivot) {
          output = start + front;
        }
        front += 1;
      }


    }
    return end - back;




}
}
