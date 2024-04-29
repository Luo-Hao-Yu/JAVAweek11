import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterExample {
    public static void main(String[] args) {
        try{
            FileReader fileReader =new FileReader("input.txt");
            FileWriter fileWriter1 = new FileWriter("output1.txt");
            int character;
            while ((character = fileReader.read())!=-1){
                System.out.print((char)character);
                fileWriter1.write(character);
            }
            fileReader.close();
            fileWriter1.close();
            FileWriter fileWriter2=new FileWriter("output2.txt");
            fileWriter2.write("2024年1月29日");
            fileWriter2.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
