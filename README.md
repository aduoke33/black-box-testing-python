# Black Box Testing Project (Python)

## Mo ta bai toan
Project nay gom 8 bai toan co ham rieng va kiem tra dau vao. Neu input khong hop le thi tra ve "INVALID".

1. Tinh chu vi hinh chu nhat
2. Tinh dien tich hinh chu nhat
3. Giai phuong trinh bac 2
4. Tinh so ngay cua mot thang (co xet nam nhuan)
5. Kiem tra n co phai so nguyen to
6. Tinh tong S = 1 - 2 + 3 - 4 + ... + n
7. Tim UCLN cua a va b
8. Tinh tong S = 1! + 2! + 3! + ... + n!

## Ky thuat kiem thu hop den da ap dung
- Equivalence partitioning (phan lop tuong duong)
- Boundary value analysis (phan tich gia tri bien)

## Cach chay
1. Mo terminal tai thu muc project
2. Chay lenh:
   python run_test.py

## Giai thich ngan gon tung bai
- Chu vi hinh chu nhat: input la length, width (so duong). Output la 2 * (length + width).
- Dien tich hinh chu nhat: input la length, width (so duong). Output la length * width.
- Phuong trinh bac 2: input a, b, c (so), a != 0. Output la 2 nghiem, 1 nghiem, "NO_REAL_ROOTS", hoac "INVALID".
- So ngay cua thang: input month (1..12), year (>=1). Output la 28/29/30/31.
- So nguyen to: input n (so nguyen >= 0). Output True/False.
- Tong luan phien: input n (so nguyen >= 1). Output la tong S = 1 - 2 + 3 - 4 + ... + n.
- UCLN: input a, b (so nguyen >= 0 va khong dong thoi bang 0). Output la UCLN.
- Tong giai thua: input n (so nguyen >= 1). Output la 1! + 2! + ... + n!.

## File lien quan (Python)
- main.py: ma nguon chinh
- run_test.py: chay test case
- test_cases.txt: bang test case chi tiet

---

# Kiểm Thử Hộp Trắng - White-box Testing (Java)

## Mô tả
Phần này triển khai 8 bài toán tương tự nhưng sử dụng **White-box Testing** trong Java, với mục tiêu đạt **100% Statement Coverage** và **100% Branch Coverage**.

## Bài toán được kiểm thử
1. **Chu vi & Diện tích HCN** - Xử lý lỗi nếu cạnh ≤ 0
2. **Giải phương trình bậc 2** - Đầy đủ các trường hợp: a=0, Δ>0, Δ=0, Δ<0
3. **Tính số ngày trong tháng** - Xử lý năm nhuận (400, 100, 4 tuples)
4. **Kiểm tra số nguyên tố** - Xử lý n<2, n=2, n lẻ, sqrt optimization
5. **Tính tổng S = 1 - 2 + 3 - 4 + ... + n** - Xử lý n<1
6. **Tìm ƯCLN của a và b** - Euclid algorithm, xử lý trường hợp 0, âm số
7. **Tính giai thừa n!** - Base case (0!, 1!), loop
8. **Tính tổng S = 1! + 2! + ... + n!** - Tách hàm giai thừa riêng

## Cấu trúc dự án Maven
```
project/
├── pom.xml                                  # Maven configuration
├── src/
│   ├── main/java/com/whitebox/
│   │   └── WhiteBoxLogic.java              # 8 bài toán logic
│   └── test/java/com/whitebox/
│       └── WhiteBoxLogicTest.java          # Test cases 100% coverage
├── DanhSachTestCase.md                     # Chi tiết từng test case
└── README.md                                # File này
```

## Yêu cầu
- **Java 11+**
- **Maven 3.6+**

## Cách chạy

### 1. Cài đặt Maven (nếu chưa có)
**Windows:**
```bash
# Download từ https://maven.apache.org/download.cgi
# Extract và thêm `bin` folder vào PATH
```

**Linux/macOS:**
```bash
brew install maven          # macOS
sudo apt-get install maven  # Ubuntu/Debian
```

### 2. Chạy tests
```bash
cd "d:\Đánh già và kiểm định chất lường phần mềm\project"
mvn clean test
```

### 3. Xem kết quả coverage
```bash
mvn clean test jacoco:report
# Report được tạo tại: target/site/jacoco/index.html
```

## Các công cụ sử dụng
- **JUnit 5** - Framework test
- **JaCoCo** - Công cụ đo code coverage
- **Maven Surefire** - Plugin chạy test

## Mục tiêu Coverage
| Metric | Target | Status |
|--------|--------|--------|
| Statement Coverage | 100% | ✓ |
| Branch Coverage | 100% | ✓ |
| Line Coverage | 100% | ✓ |

## Test Case Strategy
Mỗi phương thức được kiểm thử với:
- ✓ Happy path (trường hợp bình thường)
- ✓ Edge cases (giá trị biên)
- ✓ Exception cases (trường hợp ngoại lệ)
- ✓ Boundary values (giá trị ranh giới)
- ✓ All branches in if/else, switch-case, loops

## File liên quan (Java White-box Testing)
- `src/main/java/com/whitebox/WhiteBoxLogic.java` - Logic chính
- `src/test/java/com/whitebox/WhiteBoxLogicTest.java` - Test cases
- `DanhSachTestCase.md` - Danh sách chi tiết test cases
- `pom.xml` - Maven configuration
