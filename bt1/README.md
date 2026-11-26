# 📚 TỔNG HỢP KIẾN THỨC & BÀI TẬP OOP - THƯ MỤC BT1

Thư mục này tổng hợp các bài tập nhập môn Lập trình hướng đối tượng (OOP) bằng ngôn ngữ **Java**, bao gồm các khái niệm cốt lõi: **Class, Object, Constructor, Method (void vs non-void), Access Modifiers (public vs private)** và từ khóa **`static`**.

---

## 📂 Danh sách các file và ý nghĩa từng bài

| Tên file | Chủ đề kiến thức chính | Mục đích thực hành |
| :--- | :--- | :--- |
| [Cookie.java](file:///d:/UTE/OOP/Hoc-OOP/bt1/Cookie.java) | **Class & Object cơ bản** | Làm quen với việc khai báo một class và tạo đối tượng đầu tiên bằng từ khóa `new`. |
| [Bike.java](file:///d:/UTE/OOP/Hoc-OOP/bt1/Bike.java) | **Class toàn diện & Constructor** | Xây dựng thuộc tính, viết nhiều Constructor (nạp chồng), viết method và tạo nhiều object (`myBike`, `bike_2`, `bike_3`...). |
| [hinhvuong.java](file:///d:/UTE/OOP/Hoc-OOP/bt1/hinhvuong.java) | **Phân loại Method (Hàm)** | Phân biệt phương thức có trả về (`int`, có `return`) và phương thức không trả về (`void`). |
| [public.java](file:///d:/UTE/OOP/Hoc-OOP/bt1/public.java) | **Phạm vi truy cập (Access Modifiers)** | Thử nghiệm sự khác nhau giữa `public` (truy cập tự do) và `private` (bị khóa, báo lỗi khi gọi từ ngoài). |
| [tinhdientich.java](file:///d:/UTE/OOP/Hoc-OOP/bt1/tinhdientich.java) | **Từ khóa `static`** | Tạo phương thức tĩnh (`static method`), gọi trực tiếp qua tên class mà không cần tạo object (`new`). |

---

## 📖 Chi tiết từng bài học

### 1. `Cookie.java` - Khởi tạo đối tượng
* **Khái niệm:** Class là "bản thiết kế", còn Object là "ngôi nhà" thực tế được xây dựng từ bản thiết kế đó.
* **Cú pháp:**
  ```java
  Cookie myC = new Cookie(); // Tạo một đối tượng myC từ class Cookie
  ```

---

### 2. `Bike.java` - Thuộc tính & Constructor (Hàm khởi tạo)
* **Constructor không tham số:** Khởi tạo giá trị mặc định cố định cho xe.
* **Constructor có tham số (`this`):** Nhận giá trị từ bên ngoài truyền vào lúc tạo xe:
  ```java
  public Bike(int gia, String mau) {
      this.gia_ban = gia;
      this.mau_sac = mau;
  }
  ```
  *(Từ khóa `this.mau_sac` chỉ thuộc tính của class, còn `mau` là tham số nhận vào).*

---

### 3. `hinhvuong.java` - Phân loại Phương thức (Method)
* **`void method` (Không có `return`):** Chỉ thực thi công việc (như in ra màn hình) rồi kết thúc.
* **`non-void method` (Có `return`):** Bắt buộc phải trả về một giá trị cùng kiểu đã khai báo (`int`, `double`...):
  ```java
  int TinhDienTich(int canh) {
      return canh * canh; // Bắt buộc phải có return
  }
  ```

---

### 4. `public.java` - Tính đóng gói (Public vs Private)
* **`public`:** Cho phép tất cả các class khác bên ngoài truy cập và sửa đổi.
* **`private`:** Chỉ nội bộ class đó mới được dùng. Khi class khác cố truy cập thuộc tính private, Java sẽ báo lỗi:
  ```text
  error: mau_sac has private access in Bike
  ```
  *(Đây là nền tảng của tính chất **Đóng gói (Encapsulation)** trong OOP).*

---

### 5. `tinhdientich.java` - Phương thức Static
* Bình thường muốn dùng hàm trong class phải tạo object (`new`).
* Khi thêm từ khóa **`static`**, phương thức trở thành của chung toàn bộ class, có thể gọi trực tiếp:
  ```java
  CONG_THUC.TINH_DIEN_TICH(2, 5); // Không cần new CONG_THUC()
  ```

---

## ⚠️ Các lỗi người mới học Java hay gặp & Cách tránh

1. **Gõ nhầm Inlay Hints của VS Code:**
   * Trong VS Code, chữ mờ mờ như `canh: 10` hay `i: dt` chỉ là gợi ý hiển thị.
   * ❌ **Không gõ:** `hv.TinhDienTich(canh: 10);`
   * 👉 **Chỉ gõ:** `hv.TinhDienTich(10);`
2. **Khai báo hàm có kiểu trả về (`int`, `double`) nhưng quên `return`:**
   * Khi khai báo kiểu dữ liệu cho hàm, cuối hàm bắt buộc phải có câu lệnh `return <giá trị>;`.
3. **Hàm `main` phải nằm trong class:**
   * Trong Java, mọi hàm (kể cả `main`) bắt buộc phải nằm bên trong cặp ngoặc `{ }` của một class.
4. **Quy tắc chạy file Java đơn lẻ (`java TenFile.java`):**
   * Class chứa hàm `main` nên đặt ở **đầu file** để Java tìm thấy ngay.

---

## ▶️ Cách chạy file trong Terminal
Đứng tại thư mục `bt1`, gõ:
```powershell
java TenFile.java
```
*Ví dụ:* `java Bike.java`, `java hinhvuong.java`, `java tinhdientich.java`.
