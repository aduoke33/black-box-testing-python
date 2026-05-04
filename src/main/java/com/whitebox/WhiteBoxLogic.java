package com.whitebox;

/**
 * White-box Testing Logic - 8 Problems
 * Cung cấp các hàm tính toán để kiểm thử hộp trắng
 */
public class WhiteBoxLogic {

    // ============ Problem 1: Rectangle Area & Perimeter ============
    /**
     * Tính chu vi hình chữ nhật
     * @param length chiều dài
     * @param width chiều rộng
     * @return chu vi
     * @throws IllegalArgumentException nếu cạnh <= 0
     */
    public static double getRectanglePerimeter(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Chiều dài và chiều rộng phải > 0");
        }
        return 2 * (length + width);
    }

    /**
     * Tính diện tích hình chữ nhật
     * @param length chiều dài
     * @param width chiều rộng
     * @return diện tích
     * @throws IllegalArgumentException nếu cạnh <= 0
     */
    public static double getRectangleArea(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Chiều dài và chiều rộng phải > 0");
        }
        return length * width;
    }

    // ============ Problem 2: Quadratic Equation ============
    /**
     * Giải phương trình bậc 2: ax^2 + bx + c = 0
     * @return mảng chứa nghiệm(s), hoặc null nếu không có nghiệm
     */
    public static double[] solveQuadratic(double a, double b, double c) {
        // Trường hợp 1: a = 0 => bx + c = 0
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    return new double[]{Double.POSITIVE_INFINITY}; // Vô số nghiệm
                } else {
                    return null; // Vô nghiệm
                }
            } else {
                return new double[]{-c / b}; // Một nghiệm
            }
        }

        // Trường hợp 2: a != 0
        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            // Hai nghiệm phân biệt
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{x1, x2};
        } else if (delta == 0) {
            // Một nghiệm kép
            double x = -b / (2 * a);
            return new double[]{x};
        } else {
            // Vô nghiệm
            return null;
        }
    }

    // ============ Problem 3: Days in Month ============
    /**
     * Tính số ngày trong tháng
     * @param month tháng (1-12)
     * @param year năm
     * @return số ngày trong tháng
     * @throws IllegalArgumentException nếu tháng không hợp lệ
     */
    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Tháng phải từ 1-12");
        }

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 0;
        }
    }

    /**
     * Kiểm tra năm nhuận
     */
    private static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }

    // ============ Problem 4: Prime Number Check ============
    /**
     * Kiểm tra số nguyên tố
     * @param n số cần kiểm tra
     * @return true nếu n là số nguyên tố
     */
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // ============ Problem 5: Alternating Sum ============
    /**
     * Tính tổng S = 1 - 2 + 3 - 4 + ... + n
     * @param n
     * @return tổng
     * @throws IllegalArgumentException nếu n < 1
     */
    public static long getAlternatingSum(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n phải >= 1");
        }

        long sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sum += i;
            } else {
                sum -= i;
            }
        }
        return sum;
    }

    // ============ Problem 6: GCD (ƯCLN) ============
    /**
     * Tìm Ước Chung Lớn Nhất (GCD) sử dụng Euclidean Algorithm
     * @param a số thứ nhất
     * @param b số thứ hai
     * @return ƯCLN của a và b
     * @throws IllegalArgumentException nếu a hoặc b < 0
     */
    public static int getGCD(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("a và b phải >= 0");
        }

        // Chuyển về dương nếu cần
        a = Math.abs(a);
        b = Math.abs(b);

        // Trường hợp đặc biệt
        if (a == 0) return b;
        if (b == 0) return a;

        // Euclidean algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // ============ Problem 7: Sum of Factorials ============
    /**
     * Tính giai thừa n!
     * @param n
     * @return n!
     * @throws IllegalArgumentException nếu n < 0
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n phải >= 0");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Tính tổng S = 1! + 2! + 3! + ... + n!
     * @param n
     * @return tổng các giai thừa
     * @throws IllegalArgumentException nếu n < 1
     */
    public static long getSumOfFactorials(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n phải >= 1");
        }

        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += factorial(i);
        }
        return sum;
    }

    // ============ Problem 8: Already in Problem 7 - Sum of Factorials ============
    // (Phần này đã được bao gồm trong Problem 7)
}
