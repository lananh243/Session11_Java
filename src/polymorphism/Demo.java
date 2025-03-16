package polymorphism;

public class Demo {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.add(5,10);
        e.add(3.4F,7.5F);
        e.add(4,5,6);
        Story story = new Story();
        story.displayData();
    }
}
