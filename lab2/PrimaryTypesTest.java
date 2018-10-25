import java.util.Random;

public class PrimaryTypesTest{
    byte    notInitializedByte,
            initializedByte=10,
            initializedWithCalculationsByte;
    short   notInitializedShort,
            initializedShort =12,
            initializedWithCalculationsShort;
    int     notInitializedInt,
            initializedInt=5,
            initializedWithCalculationsInt;
    long    notInitializedLong,
            initializedLong,
            initializedWithCalculationsLong;
    float   notInitializedFloat,
            initializedFloat=45,
            initializedWithCalculationsFloat;
    double  notInitializedDouble,
            initializedDouble,
            initializedWithCalculationsDouble;
    boolean notInitializedBoolean,
            initializedBoolean=true,
            initializedWithCalculationsBoolean;
    char    notInitializedChar,
            initializedChar,
            initializedWithCalculationsChar;
    
    {
        Random rnd = new Random();
        initializedWithCalculationsByte =(byte) rnd.nextInt(127);
        initializedWithCalculationsShort =(short) rnd.nextInt(32767);
        initializedWithCalculationsInt= rnd.nextInt();
        initializedWithCalculationsLong = rnd.nextLong();
        initializedWithCalculationsFloat = rnd.nextFloat();
        initializedWithCalculationsDouble = rnd.nextDouble();
        initializedWithCalculationsBoolean = rnd.nextBoolean();
        initializedWithCalculationsChar =  (char) (48 + rnd.nextInt(47));
    }
    
    public static void main(String[] args){
        PrimaryTypesTest tst = new PrimaryTypesTest();
        tst.print_data();
    }
    
    PrimaryTypesTest(){}
    
    public void print_byte(){
        System.out.println("______________byte values________________");
        System.out.printf( "|initialized   byte= %5dd 0x%2x         |\n",initializedByte,initializedByte);
        System.out.printf( "|uninitialized byte= %5dd 0x%2x         |\n",notInitializedByte,notInitializedByte);
        System.out.printf( "|calculations  byte= %5dd 0x%2x         |\n",initializedWithCalculationsByte,initializedWithCalculationsByte);
        System.out.println("_________________________________________");
    }
    
    public void print_short(){
        System.out.println("______________short values___________________");
        System.out.printf( "|initialized   short= %5dd 0x%4x         |\n",initializedShort,initializedShort);
        System.out.printf( "|uninitialized short= %5dd 0x%4x         |\n",notInitializedShort,notInitializedShort);
        System.out.printf( "|calculations  short= %5dd 0x%4x         |\n",initializedWithCalculationsShort,initializedWithCalculationsShort);
        System.out.println("_____________________________________________");
    }
    
    public void print_int(){
        System.out.println("______________int values____________________________");
        System.out.printf( "|initialized   int= %11dd 0x%8x         |\n",initializedInt,initializedInt);
        System.out.printf( "|uninitialized int= %11dd 0x%8x         |\n",notInitializedInt,notInitializedInt);
        System.out.printf( "|calculations  int= %11dd 0x%8x         |\n",initializedWithCalculationsInt,initializedWithCalculationsInt);
        System.out.println("____________________________________________________");        
    }
    
    public void print_long(){
        System.out.println("______________long values_____________________________________________");
        System.out.printf( "|initialized   long= %20dd 0x%16x         |\n",initializedLong,initializedLong);
        System.out.printf( "|uninitialized long= %20dd 0x%16x         |\n",notInitializedLong,notInitializedLong);
        System.out.printf( "|calculations  long= %20dd 0x%16x         |\n",initializedWithCalculationsLong,initializedWithCalculationsLong);
        System.out.println("______________________________________________________________________");
    }
    
    public void print_float(){  
        System.out.println("______________float values_________________________");
        System.out.printf( "|initialized   float= %20f        |\n",initializedFloat,initializedFloat);
        System.out.printf( "|uninitialized float= %20f        |\n",notInitializedFloat,notInitializedFloat);
        System.out.printf( "|calculations  float= %20f        |\n",initializedWithCalculationsFloat,initializedWithCalculationsFloat);
        System.out.println("___________________________________________________");    
    }
    
    public void print_double(){  
        System.out.println("______________double values_________________________");
        System.out.printf( "|initialized   double= %20f        |\n",initializedDouble,initializedDouble);
        System.out.printf( "|uninitialized double= %20f        |\n",notInitializedDouble,notInitializedDouble);
        System.out.printf( "|calculations  double= %20f        |\n",initializedWithCalculationsDouble,initializedWithCalculationsDouble);
        System.out.println("____________________________________________________");    
    }
    
    public void print_boolean(){  
        System.out.println("______________boolean values_________");
        System.out.printf( "|initialized   boolean= %5b        |\n",initializedBoolean,initializedBoolean);
        System.out.printf( "|uninitialized boolean= %5b        |\n",notInitializedBoolean,notInitializedBoolean);
        System.out.printf( "|calculations  boolean= %5b        |\n",initializedWithCalculationsBoolean,initializedWithCalculationsBoolean);
        System.out.println("_____________________________________");    
    }
    
    public void print_char(){  
        System.out.println("______________char values__________");
        System.out.printf( "|initialized   char= %2c  %4x      |\n",initializedChar,(short)initializedChar);
        System.out.printf( "|uninitialized char= %2c  %4x      |\n",notInitializedChar,(short)notInitializedChar);
        System.out.printf( "|calculations  char= %2c  %4x      |\n",initializedWithCalculationsChar,(short)initializedWithCalculationsChar);
        System.out.println("___________________________________");    
    }
    
    public void print_data(){
        print_byte();
        print_short();
        print_int();
        print_long();
        print_float();
        print_double();
        print_boolean();
        print_char();
    }
    
}
