import java.util.Scanner;

class Student{
    int id;
    String name;
    String major;
    long phone;

    public Student(int id, String name, String major, long phone) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    public long getPhone() {
        return phone;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getPhoneNumber() {
        String num = Long.toString(phone);

        if (num.length() == 10) {
            num = "0" + num;
        }

        String first = num.substring(0, 3);
        String middle = num.substring(3, 7);
        String last = num.substring(7);

        return first + "-" + middle + "-" + last;
    }

    public String toString() {
        return id + " " + name + " " + major + " " + getPhoneNumber();
    }
}

public class Homework2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        for(int i=0; i<3; i++){
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            int id = sc.nextInt();
            String name = sc.next();
            String major = sc.next();
            long phone = sc.nextLong();


            students[i] = new Student(id, name, major, phone);
        }

        System.out.print("\n");
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        System.out.println("첫번째 학생: " + students[0]);
        System.out.println("두번째 학생: " + students[1]);
        System.out.println("세번째 학생: " + students[2]);
    }
}
