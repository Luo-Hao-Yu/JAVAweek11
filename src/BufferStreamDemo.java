import java.io.*;

public class BufferStreamDemo {
    public static void main(String[] args) {
        try{
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("input3.txt"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output3.txt"));
            int data;
            while ((data=bis.read())!=-1){
                bos.write(data);
            }
            bis.close();
            bos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
