package Bai5;

public class Square implements Colorable{
    private int adge;

    @Override
    public void setColor(String color) {
        System.out.println("Màu của hình vuông là: "+color);
    }
}
