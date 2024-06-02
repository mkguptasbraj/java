class animal{
public void make_sound()
{
    System.out.println("animal sound");
}

}
class dog extends animal{
    public void make_sound()
    {
        System.out.println("dog is barking");
    }
}
class cat extends animal{
    public void make_sound()
    {
        System.out.println("cat is meowing");
    }
}
public class animal_sound {
    public static void main(String[] args) {
        System.out.println(" hi animals");
        cat c1=new cat();
        c1.make_sound();
        dog d1=new dog();
        d1.make_sound();
    }
}
