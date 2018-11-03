import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Mycp{
    static final int BUFF_SIZE=512;
    
    static void cp(String src,String dst){
        byte[] buff = new byte[BUFF_SIZE];
        FileInputStream in  = new FileInputStream(src);
        FileOutputStream out = new FileOutputStream(dst);
        int cnt=0;
        int offset=0;
        while((cnt=in.read(buff))!=-1){
            out.write(b,offset,cnt);
            offset+=cnt;
        }
    }

    
    public static void main(String[] argv){
    }

}
