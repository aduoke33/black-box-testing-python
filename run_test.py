from main import (
    rectangle_perimeter,
    rectangle_area,
    solve_quadratic,
    days_in_month,
    is_prime,
    alternating_sum,
    gcd,
    sum_factorials,
)


def print_case(tc_id, result, expected):
    print(f"{tc_id}: result={result} | expected={expected}")


print("=== Rectangle Perimeter ===")
# TC-RP-01: length=5, width=3 -> 16 (valid)
print_case("TC-RP-01", rectangle_perimeter(5, 3), 16)
# TC-RP-02: length=1, width=1 -> 4 (boundary)
print_case("TC-RP-02", rectangle_perimeter(1, 1), 4)
# TC-RP-03: length=0, width=4 -> INVALID (invalid boundary)
print_case("TC-RP-03", rectangle_perimeter(0, 4), "INVALID")
# TC-RP-04: length="a", width=2 -> INVALID (invalid)
print_case("TC-RP-04", rectangle_perimeter("a", 2), "INVALID")

print("\n=== Rectangle Area ===")
# TC-RA-01: length=4, width=2.5 -> 10.0 (valid)
print_case("TC-RA-01", rectangle_area(4, 2.5), 10.0)
# TC-RA-02: length=1, width=2 -> 2 (boundary)
print_case("TC-RA-02", rectangle_area(1, 2), 2)
# TC-RA-03: length=-1, width=3 -> INVALID (invalid)
print_case("TC-RA-03", rectangle_area(-1, 3), "INVALID")
# TC-RA-04: length=5, width=None -> INVALID (invalid)
print_case("TC-RA-04", rectangle_area(5, None), "INVALID")

print("\n=== Quadratic Equation ===")
# TC-QE-01: a=1, b=-3, c=2 -> (1.0, 2.0) (valid)
print_case("TC-QE-01", solve_quadratic(1, -3, 2), (1.0, 2.0))
# TC-QE-02: a=1, b=2, c=1 -> -1.0 (boundary d=0)
print_case("TC-QE-02", solve_quadratic(1, 2, 1), -1.0)
# TC-QE-03: a=1, b=0, c=1 -> NO_REAL_ROOTS (valid)
print_case("TC-QE-03", solve_quadratic(1, 0, 1), "NO_REAL_ROOTS")
# TC-QE-04: a=0, b=2, c=1 -> INVALID (invalid)
print_case("TC-QE-04", solve_quadratic(0, 2, 1), "INVALID")
# TC-QE-05: a="1", b=2, c=3 -> INVALID (invalid)
print_case("TC-QE-05", solve_quadratic("1", 2, 3), "INVALID")

print("\n=== Days In Month ===")
# TC-DM-01: month=1, year=2024 -> 31 (valid)
print_case("TC-DM-01", days_in_month(1, 2024), 31)
# TC-DM-02: month=2, year=2024 -> 29 (boundary leap year)
print_case("TC-DM-02", days_in_month(2, 2024), 29)
# TC-DM-03: month=2, year=2023 -> 28 (valid)
print_case("TC-DM-03", days_in_month(2, 2023), 28)
# TC-DM-04: month=13, year=2024 -> INVALID (invalid)
print_case("TC-DM-04", days_in_month(13, 2024), "INVALID")
# TC-DM-05: month=2, year=0 -> INVALID (invalid)
print_case("TC-DM-05", days_in_month(2, 0), "INVALID")

print("\n=== Prime Check ===")
# TC-PR-01: n=2 -> True (boundary)
print_case("TC-PR-01", is_prime(2), True)
# TC-PR-02: n=9 -> False (valid)
print_case("TC-PR-02", is_prime(9), False)
# TC-PR-03: n=1 -> False (boundary)
print_case("TC-PR-03", is_prime(1), False)
# TC-PR-04: n=-5 -> INVALID (invalid)
print_case("TC-PR-04", is_prime(-5), "INVALID")
# TC-PR-05: n=3.5 -> INVALID (invalid)
print_case("TC-PR-05", is_prime(3.5), "INVALID")

print("\n=== Alternating Sum ===")
# TC-AS-01: n=1 -> 1 (boundary)
print_case("TC-AS-01", alternating_sum(1), 1)
# TC-AS-02: n=6 -> -3 (valid even)
print_case("TC-AS-02", alternating_sum(6), -3)
# TC-AS-03: n=5 -> 3 (valid odd)
print_case("TC-AS-03", alternating_sum(5), 3)
# TC-AS-04: n=0 -> INVALID (invalid boundary)
print_case("TC-AS-04", alternating_sum(0), "INVALID")
# TC-AS-05: n="4" -> INVALID (invalid)
print_case("TC-AS-05", alternating_sum("4"), "INVALID")

print("\n=== GCD ===")
# TC-GCD-01: a=54, b=24 -> 6 (valid)
print_case("TC-GCD-01", gcd(54, 24), 6)
# TC-GCD-02: a=0, b=15 -> 15 (boundary)
print_case("TC-GCD-02", gcd(0, 15), 15)
# TC-GCD-03: a=0, b=0 -> INVALID (invalid)
print_case("TC-GCD-03", gcd(0, 0), "INVALID")
# TC-GCD-04: a=-6, b=9 -> INVALID (invalid)
print_case("TC-GCD-04", gcd(-6, 9), "INVALID")
# TC-GCD-05: a=7, b=2.5 -> INVALID (invalid)
print_case("TC-GCD-05", gcd(7, 2.5), "INVALID")

print("\n=== Sum Of Factorials ===")
# TC-SF-01: n=1 -> 1 (boundary)
print_case("TC-SF-01", sum_factorials(1), 1)
# TC-SF-02: n=3 -> 9 (valid)
print_case("TC-SF-02", sum_factorials(3), 9)
# TC-SF-03: n=5 -> 153 (valid)
print_case("TC-SF-03", sum_factorials(5), 153)
# TC-SF-04: n=0 -> INVALID (invalid)
print_case("TC-SF-04", sum_factorials(0), "INVALID")
# TC-SF-05: n=2.2 -> INVALID (invalid)
print_case("TC-SF-05", sum_factorials(2.2), "INVALID")
