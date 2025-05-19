import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fukusyu4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("num>");
        int num = Integer.parseInt(br.readLine());
        if(num>0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }

    }
}
