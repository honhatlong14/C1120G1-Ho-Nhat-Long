package lession_16_io_binary_file_serialization.thuc_hanh.coppy_file_co_dung_luong_lon;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(),dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    private static void copyFileUsingStream(File soure, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        is = new FileInputStream(soure);
        os = new FileOutputStream(dest);
        byte [] buffer = new byte[1024];
        int length;
        while ((length = is.read(buffer)) > 0){
            os.write(buffer, 0 , length);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("Enter source file: ");
        String sourcePath = in.nextLine();
        System.out.printf("Enter destination file:");
        String destPath = in.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        try {
            copyFileUsingJava7Files(sourceFile, destFile);
            System.out.printf("Coppy complete");
        } catch (IOException e) {
            System.out.printf("cant copy that file");
            System.out.printf(e.getMessage());
        }
    }
}
