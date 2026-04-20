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

## File lien quan
- main.py: ma nguon chinh
- run_test.py: chay test case
- test_cases.txt: bang test case chi tiet
