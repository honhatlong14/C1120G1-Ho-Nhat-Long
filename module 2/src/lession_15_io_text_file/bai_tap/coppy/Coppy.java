package lession_15_io_text_file.bai_tap.coppy;

import java.io.*;
public class Coppy {
    public static void main(String[] args) {
        File file = new File("src/lession_15_io_text_file/bai_tap/coppy/source file.csv");
        File file1 = new File("src/lession_15_io_text_file/bai_tap/coppy/target file.csv");

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader =new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1));
            String line;
            while ((line =bufferedReader.readLine()) !=null){
                System.out.println(line);
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
