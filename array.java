import java.util.*;
class array{
  public static void main(String[] args){
  int N=5;
  int sp=N/2;
  for(int row=1; row<=N/2+1; row++){
    for(int j=0; j< sp; j++)
      System.out.print(" ");

      sp--;
    for(int i=0; i<N*2-1; i++){
      System.out.print("*");
    }
    System.out.println();

  }

}
}