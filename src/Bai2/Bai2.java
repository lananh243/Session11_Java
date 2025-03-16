package Bai2;

public class Bai2 {

/*
    - Tính trừu tượng trong lập trình hướng đối tượng là cơ chế ẩn đi các chi tiết cài đặt phức tạp và
    chỉ hiển thị những chức năng cần thiết cho người dùng. Điều này giúp lập trình viên làm việc với đối tượng
    thông qua các phương thức mà không cần quan tâm đến cách chúng được triển khai. Vai trò của tính trừu tượng là
    giúp mã nguồn gọn gàng, dễ bảo trì và mở rộng, đồng thời tăng tính bảo mật bằng cách giới hạn quyền truy
    cập vào các chi tiết bên trong của đối tượng.

    - Tính trừu tượng trong phần mềm phức tạp :
        + Giảm độ phức tạp: Ẩn chi tiết triển khai, chỉ hiển thị chức năng quan trọng.
        + Dễ bảo trì & mở rộng: Mã nguồn rõ ràng, dễ sửa đổi, phát triển thêm.
        + Tăng tính bảo mật: Giới hạn quyền truy cập vào các phần không cần thiết.
        + Hỗ trợ tái sử dụng: Tận dụng lại mã trong nhiều phần của chương trình
        + Tập trung vào cách sử dụng: Người dùng không cần hiểu chi tiết bên trong.
    - Sự khác biệt giữa lớp trừu tượng và giao diện trong Java :
        + Lớp trừu tượng (Abstract Class):
        - Mục đích:Dùng để chia sẻ code chung giữa các lớp con.
        - Phương thức: Có thể chứa cả phương thức có thân (concrete methods) và phương thức trừu tượng (abstract methods).
        - Biến (thuộc tính): Có thể có biến instance với các phạm vi truy cập khác nhau (private, protected, public).
        - Kế thừa (Inheritance): Một lớp có thể kế thừa từ một lớp trừu tượng bằng từ khóa extends.
        - Tính linh hoạt: Ít linh hoạt hơn vì chỉ có thể kế thừa từ một lớp trừu tượng
        - Hiệu suất: Có thể nhanh hơn do hỗ trợ cài đặt sẵn một số phương thức.
        + Giao diện (Interface):
        - Mục đích: Dùng để định nghĩa hành vi mà các lớp phải thực hiện.
        - Phương thức: Chỉ chứa phương thức trừu tượng (trước Java 8), từ Java 8 có thể có phương thức mặc định (default methods) và phương thức tĩnh (static methods).
        - Biến (thuộc tính): Chỉ có các hằng số (public static final).
        - Kế thừa (Inheritance): Một lớp có thể triển khai nhiều giao diện bằng từ khóa implements.
        - Tính linh hoạt: Linh hoạt hơn vì một lớp có thể triển khai nhiều giao diện.

    - Lấy ví dụ minh họa từ đời sống : Điều khiển TV
        - Ẩn chi tiết phức tạp: Người dùng không cần biết cách TV xử lý tín hiệu, chỉ cần bấm nút điều khiển.
        - Cung cấp giao diện đơn giản: Chỉ hiển thị các chức năng cần thiết như bật/tắt, chuyển kênh, tăng/giảm âm lượng.
        - Dễ sử dụng: Người dùng thao tác mà không cần hiểu cơ chế hoạt động bên trong.
        - Liên hệ lập trình: Giống như trong Java, tính trừu tượng giúp lập trình viên sử dụng phương thức mà không cần biết chi tiết triển khai.

* */
}
