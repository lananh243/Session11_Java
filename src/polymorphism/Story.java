package polymorphism;

public class Story extends Book{
//    Overriding
//    Điều kiện ghi đè
//    1. ĐK cần
//    - Phải cso quan hệ kế thừa
//    2. ĐK đủ
//    Cùng kiêu dữ liệu trả về, cùng phg thức, cùng tham số
//    Bổ từ truy cập của phg thức ghi đè pk có phạm vi > hoặc = phg thức bị ghi đè


    protected void displayData() {
        System.out.println("Thông tin truyện");
    }

    public String toString() {
        return "Ghi đè phg thức toString của obj";
    }
}
