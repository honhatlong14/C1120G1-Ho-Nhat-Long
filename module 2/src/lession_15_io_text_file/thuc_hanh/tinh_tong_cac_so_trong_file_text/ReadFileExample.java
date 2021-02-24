package lession_15_io_text_file.thuc_hanh.tinh_tong_cac_so_trong_file_text;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath) throws FileNotFoundException {
        try {
            // đọc file theo đường dẫn
            File file = new File(filePath);

            // kiểm tra file nếu file không tồn tại thì ném ra ngoại lệ.
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            //đọc từng dòng của file và tiến hành cộng tổng lại.
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();

            // Hiển thị ra màn hình tổng các số nguyên trong file
            System.out.println("tổng =" + sum);
        } catch (IOException e) {
            // file không tồn tại hoặc nội dung file có lỗi thì sẽ hiển thị thông báo lỗi.
            System.err.println("file không tồn tại or nội dung có lỗi !");
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
}


