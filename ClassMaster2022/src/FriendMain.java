public class FriendMain {

    public static void main(String[] args) {
       Friend friend1 = new Friend();
       System.out.println(friend1.name);
       System.out.println(friend1.age);
       friend1.name="Bob";
       friend1.age=16;
       System.out.println(friend1.name + " is " + friend1.age + " years old");
       Friend friend2 = new Friend();
       Friend friend3 = new Friend();
       friend2.name="Jenn";
       friend2.age=15;
       friend3.name="Andrew";
       friend3.age=14;
       System.out.println("My other friends are:");
       System.out.println(friend2.name);
       System.out.println(friend3.name);
    }
    
}
