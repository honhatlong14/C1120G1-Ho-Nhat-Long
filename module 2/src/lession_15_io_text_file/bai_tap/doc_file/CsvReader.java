package lession_15_io_text_file.bai_tap.doc_file;

import java.io.*;

public class CsvReader {
    public static void main(String[] args) {
        File file = new File("src/lession_15_io_text_file/bai_tap/doc_file/source.csv");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String csv = ",";
            while ((line = bufferedReader.readLine())!=null){
                String [] country = line.split(csv);
                System.out.println("Country [code" + country[country.length-2] +" , name = " + country[country.length-1]+ "]");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
