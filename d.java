
class student {
    int rollno;
    String name;


void insertrecord(int r, String n){
    rollno = r;
    name = n;

}
void displayinformation(){
    System.out.println(rollno + " "+ name);
}
}
public class d {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();
        student s3 = new student();

        s1.insertrecord(111,"monu");
        s2.insertrecord(112, "sonu");
        s3.insertrecord(113, "deepak");
        s1.displayinformation();
        s2.displayinformation();
        s3.displayinformation();

    }

}
