public class HelloWorld{
  public static void main(String... args){
    //Printing Hello World
    System.out.println("Hello World");
    int[] arr = {4,3,7,8,1,2,6};
    //Getting the return value
    int retVal = linearSearch(arr,2);
    System.out.println(retVal);
  }
  // Learning Github
  // Appending a few lines to check How to resolve n commits behind master
  public static int linearSearch(int[] arr, int ele){
    for(int i = 0; i < arr.length; i++){
      if(arr[i] == ele)
        return i;
      else
        return -1;
    }
  }
}
