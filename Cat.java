public class Cat{
    String name;
    int age;
    boolean likesCuddles;


    public Cat(String name, int age, boolean likesCuddles){
        this.name = name;
        this.age = age;
        this.likesCuddles = likesCuddles;
    }

    public void displayInfo(){
        System.out.println("This is " + name + ", who is " + age + " years old. Oliver " + (likesCuddles ? "" : " doesn't ")+ "likes cuddles.");
    }
    public static void main(String[] atgs){
        Cat oliver = new Cat("Oliver", 17, false);
        Cat maca = new Cat("Maca", 1, true);
        oliver.displayInfo();
        maca.displayInfo();
    }
}