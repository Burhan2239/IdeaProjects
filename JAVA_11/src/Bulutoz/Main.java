package Bulutoz;

public class Main {
    public static void main(String[] args) {
        System.out.println("Online Ögrenci : " + Student.howStudent());
        Student s1 = new Student("Ali" , 220, 100);
        Student s2 = new Student("Ayse" , 330, 90);
        Student s3 = new Student("Mehmet" , 200, 80);
        System.out.println("Online Ögrenci : " + Student.howStudent());
        s1.exit();
        System.out.println("Online Ögrenci : " + Student.howStudent());

        int[] notlar = new int[3];
        notlar[0] = s1.point;
        notlar[1] = s2.point;
        notlar[2] = s3.point;

        System.out.println(Student.calcOverall(notlar));
    }
}
