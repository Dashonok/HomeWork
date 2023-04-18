import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        File somefiles = new File("K:\\Study\\Project\\Homework9\\files");
        File[] files = somefiles.listFiles();
        if (!somefiles.exists()){
            System.out.println("Файл не найден");
        }
        StringBuilder sb = new StringBuilder();
        for (File file : files) {
            BufferedReader br = new BufferedReader(new FileReader(file));
            sb.append(br.readLine()).append(" ");
        }
        System.out.println(sb);
        BufferedWriter bw = new BufferedWriter(new FileWriter("result.txt"));
        String text = String.valueOf(sb);
        bw.write(text);
        bw.flush();
        bw.close();
    }
}