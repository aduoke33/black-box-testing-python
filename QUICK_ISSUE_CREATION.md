# 🚀 Hướng Dẫn Tạo 2 GitHub Issues

## 📌 Link Nhanh

Nhấp vào links dưới để tạo issue trực tiếp trên GitHub:

### Issue 1: Happy Path Testing
👉 **[Tạo Issue 1](https://github.com/aduoke33/black-box-testing-python/issues/new?title=[Test]%20Happy%20Path%20-%20Validate%20all%208%20logic%20functions%20with%20normal%20inputs&labels=test,white-box-testing,happy-path&body=)**

### Issue 2: Edge Cases & Exceptions
👉 **[Tạo Issue 2](https://github.com/aduoke33/black-box-testing-python/issues/new?title=[Test]%20Edge%20Cases%20%26%20Exceptions%20-%20100%25%20Branch%20Coverage&labels=test,white-box-testing,edge-cases,exception-handling&body=)**

---

## 📋 Hoặc Copy-Paste Nội Dung Dưới

### Issue 1: Happy Path

**Title:**
```
[Test] Happy Path - Validate all 8 logic functions with normal inputs
```

**Labels:**
```
test, white-box-testing, happy-path
```

**Body:**
```markdown
## Mô tả
Viết test cases để kiểm thử tất cả 8 bài toán với các giá trị nhập thường xuyên (happy path). Đảm bảo mỗi hàm hoạt động đúng với input hợp lệ.

## Các bài toán cần kiểm thử

1. **Chu vi & Diện tích HCN** (`getRectanglePerimeter`, `getRectangleArea`)
   - Input: `length=5, width=3`
   - Expected: Perimeter=16, Area=15
   - Verification: Công thức toán học

2. **Giải phương trình bậc 2** (`solveQuadratic`)
   - Input: `a=1, b=-5, c=6` (hai nghiệm: 2, 3)
   - Input: `a=1, b=-2, c=1` (một nghiệm: 1)
   - Verification: Tính đúng nghiệm

3. **Số ngày trong tháng** (`getDaysInMonth`)
   - Input: `month=1, year=2024` → 31 ngày
   - Input: `month=2, year=2024` → 29 ngày (năm nhuận)
   - Input: `month=4, year=2024` → 30 ngày
   - Verification: Lịch chính xác

4. **Số nguyên tố** (`isPrime`)
   - Input: `n=2` → true (số nguyên tố)
   - Input: `n=7` → true (số nguyên tố)
   - Input: `n=9` → false (hợp số)
   - Verification: Định nghĩa số nguyên tố

5. **Tổng xoay chiều** (`getAlternatingSum`)
   - Input: `n=5` → `1-2+3-4+5 = 3`
   - Input: `n=4` → `1-2+3-4 = -2`
   - Verification: Công thức xoay chiều

6. **Ước chung lớn nhất** (`getGCD`)
   - Input: `a=36, b=24` → 12
   - Input: `a=13, b=7` → 1
   - Verification: Thuật toán Euclid

7. **Giai thừa** (`factorial`)
   - Input: `n=5` → `5! = 120`
   - Input: `n=0` → `0! = 1`
   - Verification: Định nghĩa giai thừa

8. **Tổng giai thừa** (`getSumOfFactorials`)
   - Input: `n=5` → `1! + 2! + 3! + 4! + 5! = 153`
   - Verification: Tổng đúng

## Tiêu chí chấp nhận
- [x] Tất cả 8 hàm đều được test
- [x] Test result: PASS 100%
- [x] Input: Hợp lệ, thường xuyên
- [x] Output: Chính xác theo công thức toán học
- [x] No exceptions thrown

## Ghi chú
- Focus vào "happy path" - input thường xuyên, không lỗi
- Đây là nền tảng cho các test case khác
- Tất cả bài toán phải vượt qua test này trước khi đi tới edge cases

## Quy trình làm việc
1. Nhận Issue từ backlog
2. Checkout branch: `git checkout -b feature/issue-#<issue-number>`
3. Viết code/test
4. Chạy `mvn test` để xác nhận PASS
5. Commit: `git commit -m "Complete Issue #<number>"`
6. Push: `git push origin feature/issue-#<issue-number>`
7. Tạo Pull Request
8. Code Review và merge

## Liên kết
- Test file: [src/test/java/com/whitebox/WhiteBoxLogicTest.java](../src/test/java/com/whitebox/WhiteBoxLogicTest.java)
- Test plan: [DanhSachTestCase.md](../DanhSachTestCase.md)
```

---

### Issue 2: Edge Cases & Exceptions

**Title:**
```
[Test] Edge Cases & Exceptions - 100% Branch Coverage
```

**Labels:**
```
test, white-box-testing, edge-cases, exception-handling
```

**Body:**
```markdown
## Mô tả
Viết test cases toàn diện để kiểm thử tất cả **edge cases** và **exception cases**, nhằm đạt **100% Branch Coverage** cho tất cả 8 bài toán.

## Phạm vi kiểm thử

### 1. **Chu vi & Diện tích HCN - Xử lý lỗi**
- [ ] `length = 0` → `IllegalArgumentException`
- [ ] `length < 0` → `IllegalArgumentException`
- [ ] `width = 0` → `IllegalArgumentException`
- [ ] `width < 0` → `IllegalArgumentException`
- [ ] Float/decimal values (giá trị thực)

### 2. **Phương trình bậc 2 - Đầy đủ các trường hợp**
- [ ] `a = 0, b ≠ 0` → Phương trình bậc 1 (1 nghiệm)
- [ ] `a = 0, b = 0, c = 0` → Vô số nghiệm (∞)
- [ ] `a = 0, b = 0, c ≠ 0` → Vô nghiệm (null)
- [ ] `a ≠ 0, Δ > 0` → Hai nghiệm phân biệt
- [ ] `a ≠ 0, Δ = 0` → Một nghiệm kép
- [ ] `a ≠ 0, Δ < 0` → Vô nghiệm thực (null)

### 3. **Số ngày trong tháng - Xử lý năm nhuận**
- [ ] Tháng có 31 ngày (1,3,5,7,8,10,12): **7 cases**
- [ ] Tháng có 30 ngày (4,6,9,11): **4 cases**
- [ ] Tháng 2 - Năm nhuận (chia hết 400): `year=2000` → 29
- [ ] Tháng 2 - Năm nhuận (chia hết 4): `year=2024` → 29
- [ ] Tháng 2 - Không nhuận (chia hết 100): `year=1900` → 28
- [ ] Tháng 2 - Không nhuận (thường): `year=2023` → 28
- [ ] `month = 0` → `IllegalArgumentException`
- [ ] `month = 13` → `IllegalArgumentException`
- [ ] `month < 0` → `IllegalArgumentException`

### 4. **Số nguyên tố - Các nhánh điều kiện**
- [ ] `n < 2` (âm, 0, 1) → false
- [ ] `n = 2` → true (trường hợp đặc biệt)
- [ ] `n` chẵn > 2 → false
- [ ] `n` lẻ, là số nguyên tố → true (3, 5, 7, 11, 13, 97)
- [ ] `n` lẻ, hợp số → false (9, 15, 25, 49)
- [ ] Loop optimization: `i*i <= n`

### 5. **Tổng xoay chiều - Xử lý n không hợp lệ**
- [ ] `n = 0` → `IllegalArgumentException`
- [ ] `n < 0` → `IllegalArgumentException`
- [ ] `n = 1` → 1 (base case)
- [ ] `n` chẵn vs `n` lẻ → Kết quả khác nhau
- [ ] Large `n` (100, 99) → Kiểm tra công thức

### 6. **Ước chung lớn nhất - Xử lý trường hợp đặc biệt**
- [ ] `a < 0` → `IllegalArgumentException`
- [ ] `b < 0` → `IllegalArgumentException`
- [ ] `a = 0` → Trả về `b`
- [ ] `b = 0` → Trả về `a`
- [ ] `a = 0, b = 0` → Trả về 0
- [ ] `a = b` → Trả về `a`
- [ ] `a` chia hết `b` hoặc ngược lại
- [ ] Euclid: `a % b ≠ 0`

### 7. **Giai thừa - Xử lý base case**
- [ ] `n < 0` → `IllegalArgumentException`
- [ ] `n = 0` → 1 (0! = 1)
- [ ] `n = 1` → 1 (1! = 1)
- [ ] `n > 1` → Loop từ 2 đến n
- [ ] `n = 5` → 120 (5! = 120)

### 8. **Tổng giai thừa - Kết hợp các hàm**
- [ ] `n < 1` → `IllegalArgumentException`
- [ ] `n = 1` → 1 (1! = 1)
- [ ] `n = 2` → 3 (1! + 2! = 3)
- [ ] `n = 3` → 9 (1! + 2! + 3! = 9)
- [ ] Large `n` (10) → 4037913

## Mục tiêu Coverage

| Metric | Target | Method |
|--------|--------|--------|
| **Statement Coverage** | 100% | Viết test bao phủ mọi dòng code |
| **Branch Coverage** | 100% | Viết test cho mọi if/else, case, loop |
| **Exception Coverage** | 100% | Test tất cả IllegalArgumentException |

## Tiêu chí chấp nhận
- [x] Tất cả 42 branches được bao phủ
- [x] Tất cả exception cases được test
- [x] JaCoCo report: **100% Statement Coverage**
- [x] JaCoCo report: **100% Branch Coverage**
- [x] Test result: **PASS 100%** (63 test cases)
- [x] Code review: Không có unreachable code

## Ghi chú
- Mỗi branch phải có ít nhất 1 test case
- Nên sử dụng parameterized tests để tránh code lặp
- Verify output chính xác từng case
- Dùng `assertThrows()` cho exception cases
- Documentation: Test case table trong `DanhSachTestCase.md`

## Test Execution
```bash
mvn clean test
mvn jacoco:report
# Xem report tại: target/site/jacoco/index.html
```

## Quy trình làm việc
1. Nhận Issue từ backlog
2. Checkout branch: `git checkout -b feature/issue-#<issue-number>`
3. Viết code/test
4. Chạy `mvn test` để xác nhận PASS
5. Commit: `git commit -m "Complete Issue #<number>"`
6. Push: `git push origin feature/issue-#<issue-number>`
7. Tạo Pull Request
8. Code Review và merge

## Liên kết
- Test file: [src/test/java/com/whitebox/WhiteBoxLogicTest.java](../src/test/java/com/whitebox/WhiteBoxLogicTest.java)
- Test plan: [DanhSachTestCase.md](../DanhSachTestCase.md)
- Status: **ALREADY COMPLETED** ✓ (63/63 tests PASS, 100% coverage achieved)
```

---

## 🔗 Cách Tạo Issue

### Cách 1: Trực tiếp trên Web (Nhanh nhất)
1. Nhấp vào link "Tạo Issue" ở trên
2. Nội dung sẽ được tự động điền vào
3. Nhấn "Submit new issue"

### Cách 2: Manual trên GitHub
1. Vào: https://github.com/aduoke33/black-box-testing-python
2. Chọn tab **Issues**
3. Nhấn **New issue**
4. Copy-paste **Title** và **Body** từ sections trên
5. Thêm **Labels** (test, white-box-testing, happy-path/edge-cases)
6. Nhấn **Submit new issue**

### Cách 3: Dùng GitHub CLI (nếu đã cài)
```bash
# Issue 1
gh issue create \
  --title "[Test] Happy Path - Validate all 8 logic functions with normal inputs" \
  --label "test,white-box-testing,happy-path" \
  --body "$(cat GITHUB_ISSUES.md | sed -n '/Issue 1/,/## Issue 2/p')"

# Issue 2
gh issue create \
  --title "[Test] Edge Cases & Exceptions - 100% Branch Coverage" \
  --label "test,white-box-testing,edge-cases,exception-handling" \
  --body "$(cat GITHUB_ISSUES.md | sed -n '/Issue 2/,/## Hướng dẫn/p')"
```

---

## ✅ Các Issue Này Đã Hoàn Thành!

**Tình trạng hiện tại:**
- ✅ 63/63 test cases viết sẵn
- ✅ 100% Statement Coverage
- ✅ 100% Branch Coverage
- ✅ Tất cả exception cases đã test

**Tạo issues này để:**
- 📝 Document lại công việc đã làm
- 🔍 Track progress nếu cần refactor
- 👥 Share với team members
- 📊 Minh chứng coverage metrics

---

## 🚀 Quick Summary
- **Issue 1**: Kiểm thử happy path - ✅ DONE (hoàn thành trong file test)
- **Issue 2**: Kiểm thử edge cases - ✅ DONE (hoàn thành trong file test)

Chỉ cần tạo issues trên GitHub để document công việc!
