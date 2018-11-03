import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



public class SortTask{
    private static final int MAX_VALUE =100;
    private static final int MAX_STEPSIZE=10;

    public static void main(String[] argv){
        int len = (new Scanner(System.in)).nextInt();
        int[] data = gen_array(len);
        System.out.println("len="+len);
        int[][] arr = gen_step_array(len);
        print_step_array(arr);
        step_array_sort(arr);
       // print_step_array(arr);
        return;
    }
    
    public static void print_array(int[] arr){
       // for(int i=0;i<arr.length;i++)
        System.out.println(Arrays.toString(arr));
       // System.out.println();
    }
    
    public static void print_step_array(int[][] arr){
            for(int i=0;i<arr.length;i++)
                print_array(arr[i]);
    }
    
    public static int[] gen_array(int len){
        int[] res = new int[len];
        Random rnd = new Random();
        for(int i=0;i<len;i++)
            res[i]=rnd.nextInt()%MAX_VALUE;
        return res;
    }
    
    public static int[][] gen_step_array(int len){
        int[][] step_array = new int[len][];
        Random rnd = new Random();
        for(int i=0;i<len;i++){
            int sz = (rnd.nextInt()%MAX_STEPSIZE+MAX_STEPSIZE)%MAX_STEPSIZE+1;
            step_array[i] = new int[sz];
            for(int j=0;j<sz;j++)
                step_array[i][j]=rnd.nextInt()%MAX_VALUE;
        }
        return step_array;
    }
    
    public static void bubble_sort(int arr[]){    
        int len= arr.length;
        for(int i=0;i<len;i++)
            for(int j=i+1;j<len-1;j++){
                if(arr[i]<arr[j]){
                    int tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
    }
    
    public static void step_array_sort(int[][] arr){
        for(int i=0;i<arr.length;i++)
            Arrays.sort(arr[i]);
    }
    
    
    
    
    
}
