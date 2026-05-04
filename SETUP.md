# Hướng Dẫn Cài Đặt và Chạy White-box Testing

## I. Cài đặt Java

### Windows
1. **Download Java 11+**
   - Truy cập: https://www.oracle.com/java/technologies/downloads/
   - Chọn: Java SE 11 LTS (hoặc phiên bản mới hơn)
   - Chọn: Windows x64 Installer

2. **Cài đặt**
   - Chạy installer và follow các bước
   - Mặc định cài vào: `C:\Program Files\Java\jdk-11` (hoặc tương tự)

3. **Verify**
   ```bash
   java -version
   javac -version
   ```
   - Kết quả hiển thị phiên bản là OK

4. **Set JAVA_HOME** (nếu cần)
   - Control Panel → System and Security → System → Advanced system settings
   - Environment Variables → New
   - Variable name: `JAVA_HOME`
   - Variable value: `C:\Program Files\Java\jdk-11`

---

### Linux/macOS

**Ubuntu/Debian:**
```bash
sudo apt-get update
sudo apt-get install -y openjdk-11-jdk
java -version
```

**macOS (Homebrew):**
```bash
brew install java11
# Hoặc tìm kiếm version mới hơn
brew search java
java -version
```

---

## II. Cài đặt Maven

### Windows
1. **Download Maven 3.6+**
   - Truy cập: https://maven.apache.org/download.cgi
   - Chọn: Apache Maven 3.9.x (Binary zip archive)

2. **Extract**
   - Extract vào thư mục, ví dụ: `C:\Maven\apache-maven-3.9.5`

3. **Set PATH**
   - Environment Variables → PATH → New
   - Thêm: `C:\Maven\apache-maven-3.9.5\bin`

4. **Verify**
   ```bash
   mvn -version
   ```
   - Kết quả hiển thị phiên bản là OK

---

### Linux/macOS

**Ubuntu/Debian:**
```bash
sudo apt-get install -y maven
mvn -version
```

**macOS (Homebrew):**
```bash
brew install maven
mvn -version
```

---

## III. Chạy Test

### 1. Mở Terminal/Command Prompt

**Windows:**
- Win + R → `cmd` (hoặc PowerShell)

**Linux/macOS:**
- Mở Terminal

### 2. Navigasi đến project
```bash
cd "d:\Đánh già và kiểm định chất lường phần mềm\project"

# Hoặc (Linux/macOS)
cd "~/path/to/project"
```

### 3. Chạy test
```bash
mvn clean test
```

**Output mong đợi:**
```
[INFO] -------------------------------------------------------
[INFO] Running com.whitebox.WhiteBoxLogicTest
[INFO] -------------------------------------------------------
[INFO] Tests run: 63, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.234 s
[INFO] BUILD SUCCESS
```

---

## IV. Xem Code Coverage Report

### Tạo JaCoCo Coverage Report
```bash
mvn clean test jacoco:report
```

### Mở Report trong trình duyệt
```bash
# Windows
start target/site/jacoco/index.html

# Linux
xdg-open target/site/jacoco/index.html

# macOS
open target/site/jacoco/index.html
```

### Report hiển thị:
- **Overall Coverage**: 100% Statement, 100% Branch
- **Chi tiết từng class**: Coverage của WhiteBoxLogic
- **Chi tiết từng method**: Coverage của mỗi hàm

---

## V. Chạy Test Cụ Thể

### Chạy một test class
```bash
mvn test -Dtest=WhiteBoxLogicTest
```

### Chạy một test method
```bash
mvn test -Dtest=WhiteBoxLogicTest#testRectanglePerimeterValid
```

### Chạy verbose (chi tiết)
```bash
mvn test -X
```

---

## VI. Troubleshooting

### Error: "mvn: command not found"
**Nguyên nhân**: Maven chưa được cài đặt hoặc PATH chưa config

**Giải pháp**:
1. Cài đặt Maven (xem phần II)
2. Verify: `mvn -version`
3. Restart terminal sau khi set PATH

---

### Error: "No Java compiler found"
**Nguyên nhân**: Java chưa được cài đặt

**Giải pháp**:
1. Cài đặt Java 11+ (xem phần I)
2. Verify: `javac -version`
3. Set `JAVA_HOME` environment variable

---

### Error: "Tests run: X, Failures: 1"
**Nguyên nhân**: Test case không pass

**Giải pháp**:
1. Xem error message chi tiết
2. Check input/expected output
3. Fix code logic hoặc test case

---

### Build Success nhưng không tạo JAR
**Nguyên nhân**: Bạn chỉ chạy `test`, không `package`

**Giải pháp**:
```bash
mvn clean package
# JAR sẽ ở: target/whitebox-testing-1.0.jar
```

---

## VII. Các lệnh Maven hữu ích

| Lệnh | Mô tả |
|------|-------|
| `mvn clean` | Xóa thư mục target (làm sạch build cũ) |
| `mvn compile` | Biên dịch code |
| `mvn test` | Chạy test cases |
| `mvn package` | Tạo JAR |
| `mvn clean test` | Clean + Run test |
| `mvn test jacoco:report` | Test + Generate coverage report |
| `mvn install` | Build + copy JAR vào local repo |

---

## VIII. Project Structure
```
project/
├── pom.xml                          # Maven configuration
│
├── src/
│   ├── main/java/com/whitebox/
│   │   └── WhiteBoxLogic.java       # 8 bài toán
│   │
│   └── test/java/com/whitebox/
│       └── WhiteBoxLogicTest.java   # 63 test cases
│
├── target/                          # Build output (tạo sau khi build)
│   ├── classes/                    # Compiled class files
│   ├── test-classes/               # Test class files
│   └── site/jacoco/                # Coverage report
│
├── README.md                        # Tài liệu chính
├── DanhSachTestCase.md             # Chi tiết từng test case
├── GITHUB_ISSUES.md                # Mẫu GitHub Issues
└── SETUP.md                        # File này

```

---

## IX. Quick Start (Tl;dr)

```bash
# 1. Đảm bảo Java & Maven đã cài
java -version
mvn -version

# 2. Vào project
cd "d:\Đánh già và kiểm định chất lường phần mềm\project"

# 3. Chạy test
mvn clean test

# 4. Xem coverage report
mvn jacoco:report
start target/site/jacoco/index.html
```

**Kết quả mong đợi:**
- ✓ All 63 tests PASS
- ✓ 100% Statement Coverage
- ✓ 100% Branch Coverage

---

## X. Liên hệ

Nếu gặp issue, hãy:
1. Kiểm tra Java: `java -version`
2. Kiểm tra Maven: `mvn -version`
3. Xóa `target/` folder: `mvn clean`
4. Chạy lại: `mvn test`

Good luck! 🚀
