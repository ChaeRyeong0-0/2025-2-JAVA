import java.util.*;
import java.io.*;

public class Homework9 {
    public static void main(String[] args) {

        Map<String, String> userMap = new HashMap<>();

        try {
            FileInputStream fis = new FileInputStream("db.txt");  // 상대경로
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            String line;

            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                String[] parts = line.split(" ");
                if (parts.length != 2) continue;

                String id = parts[0].trim();
                String pw = parts[1].trim();

                userMap.put(id, pw);
            }

            br.close();
            isr.close();
            fis.close();

        } catch (FileNotFoundException e) {
            System.out.println("db.txt 파일을 찾을 수 없습니다.");
            return;

        } catch (Exception e) {
            System.out.println("파일을 읽는 도중 오류가 발생했습니다.");
            return;
        }

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nid와 password를 입력해주세요.");
            System.out.print("id : ");
            String id = sc.nextLine().trim();

            if (!userMap.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            System.out.print("password : ");
            String password = sc.nextLine().trim();

            if (!userMap.get(id).equals(password)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            System.out.println("id와 비밀번호가 일치합니다.");
            break;
        }

        sc.close();
    }

}
