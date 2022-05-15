import java.util.*;
class Main {
  public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);          
    int[] arr = new int[5];

System.out.println("Enter numbers: ");
  for(int i=0; i<5; i++){
          arr[i] = sc.nextInt();
  }

// array print using for each loop
  for(int i: arr){
          System.out.print(i+ " ");
          
  }
System.out.println();

//array print using for loop
  for(int i=0; i<5; i++){
        System.out.print(arr[i]+ " ");
  }
System.out.println();

//array print using toString method
System.out.println(Arrays.toString(arr));

          
//array of string or objects
String[] str = new String[4];
System.out.println("Enter string: ");
      for(int i=0; i<str.length; i++){
              str[i] = sc.next();
      }
System.out.println(Arrays.toString(str));

//modify
str[1] = "Saadat";
System.out.println(Arrays.toString(str));
          
          
  }
}