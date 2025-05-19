import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fukusyu5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("age> ");
        int age = Integer.parseInt(br.readLine());
        if (0<= age && age <13) {
            System.out.println("子ども");
        }else if (12< age && age <20) {
            System.out.println("ティーンエイジャー");
        }else if (19 < age && age <65) {
            System.out.println("大人");
        }else if (64 < age && age <101) {
            System.out.println("<シニア");
        }
    }
}
