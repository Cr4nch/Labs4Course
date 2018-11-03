import java.util.Scanner;
import java.lang.StringBuilder;

class StringTestClass{
    public static void main(String[] argv){

    }
    
    public static void test_string(){
        Scanner in = new Scanner(System.in);
      //  StringBuilder builder = new StringBuilder();
        while(true){
            String str = in.next();
            for(int i=0;i<str.length;i++){
                //TODO it
            }
        }
    }
    
    public static void test_string_builder(){
        Scanner in = new Scanner(System.in);
        StringBuilder builder  = new StringBuilder();
        while(true){
            System.out.println("length="+builder.length()+"\ncapacity="+builder.capacity());
            System.out.println("String: "+builder.toString());
            builder.append(in.next());
        }
    }
    
}
