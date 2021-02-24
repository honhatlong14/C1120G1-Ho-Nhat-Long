package lession_16_io_binary_file_serialization.bai_tap.copy_file_nhi_phan;

import java.io.*;

public class CopyBinary {
    public static void main(String[] args) {
        String sourceFile = "src/lession_16_io_binary_file_serialization/bai_tap/copy_file_nhi_phan/source file.csv";
        String destFile = "src/lession_16_io_binary_file_serialization/bai_tap/copy_file_nhi_phan/target file.csv";
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(sourceFile);
            fos = new FileOutputStream(destFile);

            byte[] buffer = new byte[1024];
            int bytes;

            System.out.println("Copying file successful");
            // đọc byte từ tệp nguồn và ghi vào tệp đích
            while ((bytes = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytes);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found" + e);
        }
        catch (IOException ioe) {
            System.out.println("Exception while copying file " + ioe);
        }
        finally {
            // đóng các luồng bằng phương thức đóng
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            }
            catch (IOException ioe) {
                System.out.println("Error while closing stream: " + ioe);
            }
        }
    }
}
