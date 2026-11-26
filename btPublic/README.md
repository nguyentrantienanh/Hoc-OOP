# Bài tập: Thực hành Access Modifiers (public & private) - Class Bike

## 📌 Đề bài yêu cầu (Slide Thực Hành)

1. **Yêu cầu 1:** Thêm các từ khóa `public` vào class hôm trước (`Bike`) và chạy thử (`run`).
2. **Yêu cầu 2:** Thêm 1 thuộc tính `private`, kiểu dữ liệu (`datatype`) là `double`, tên thuộc tính là `gia;`.
3. **Yêu cầu 3:** Tạo phương thức `private InThongTin`, kiểu trả về `void`, nội dung phương thức (body method) in chuỗi `"Đây là xe đạp"`.

---

## 📊 Sơ đồ thiết kế lớp (Class Diagram)

```
+------------------------------------------+
|                   Bike                   |
+------------------------------------------+
| - color: String                          |
| - size: String                           |
| - gia: double                            |
+------------------------------------------+
| + lock(): void    (Tắt / khóa xe)        |
| + unlock(): void  (Mở khóa xe)           |
| - InThongTin(): void                     |
+------------------------------------------+
```

> **Ký hiệu trong UML:**
> * `+` : `public` (Truy xuất tự do từ bất kỳ đâu).
> * `-` : `private` (Chỉ truy xuất được bên trong nội bộ class).

---

## 💡 Kiến thức cốt lõi cần nhớ

1. **`public` (Công khai):**
   * Các thuộc tính hoặc phương thức có từ khóa `public` phía trước sẽ được truy xuất trực tiếp bởi bất kỳ đối tượng hay class nào bên ngoài.

2. **`private` (Riêng tư - Đóng gói):**
   * Các thuộc tính hoặc phương thức có từ khóa `private` chỉ có thể được gọi và sử dụng **bên trong chính class đó**.
   * Nếu từ bên ngoài (`class Main` hoặc class khác) cố tình gọi trực tiếp `object.gia` hoặc `object.InThongTin()`, trình biên dịch Java sẽ chặn lại và báo lỗi: `has private access`.
