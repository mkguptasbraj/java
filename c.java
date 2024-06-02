
class student {
    int rollno;
    String name;

}

public class c {

    public static void main(String[] args) {

        student s1 = new student();
        student s2 = new student();
        s1.rollno = 111;
        s1.name = "monu gupta";
        s2.rollno = 112;
        s2.name = "sonu gupta ";
        student s3 = new student ();
        s3.name = "DEEpak gupta";
        s3.rollno = 113;

        System.out.println(s1.rollno + "  " + s1.name);
         
       System.out.println(s2.rollno + "  " + s2.name);
       System.out.println(s3.rollno + " " + s3.name);
       

    }

}
