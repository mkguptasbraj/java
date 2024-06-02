class employee {
    int id;
    int salary;
    String name;


    void insert(int i, String n, int s) {
        id = i;
        name = n;
        salary = s;

    }

    void displayinfo() {
        System.out.println(name + " " + id + " " + salary);
    }
    }

public class e { 
    public static void main(String[] args) { 
        employee e1 = new employee();
        employee e2  = new employee();
        employee e3 = new employee();
        e1.insert(001, "Monu", 100000);
        e2.insert(002, "Sonu", 50000);
        e3.insert(003, "Gaurav", 25000);
        e1.displayinfo();
        e2.displayinfo();
        e3.displayinfo();
    
}
    
}
