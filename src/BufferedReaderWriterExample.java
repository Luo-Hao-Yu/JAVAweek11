import java.io.*;

public class BufferedReaderWriterExample {
    public static void main(String[] args) {
        try {
            // 创建BufferedReader对象并读取文件内容
            BufferedReader bufferedReader = new BufferedReader(new FileReader("output2.txt"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();

            // 创建BufferedWriter对象并写入文件内容
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output4.txt"));
            bufferedWriter.write("Hello, java!");
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}