import math

INVALID = "INVALID"


def _is_number(value):
    return (
        isinstance(value, (int, float))
        and not isinstance(value, bool)
        and math.isfinite(value)
    )


def _is_int(value):
    return isinstance(value, int) and not isinstance(value, bool)


def rectangle_perimeter(length, width):
    """Return rectangle perimeter. Valid: length > 0, width > 0 (numbers)."""
    if not _is_number(length) or not _is_number(width):
        return INVALID
    if length <= 0 or width <= 0:
        return INVALID
    return 2 * (length + width)


def rectangle_area(length, width):
    """Return rectangle area. Valid: length > 0, width > 0 (numbers)."""
    if not _is_number(length) or not _is_number(width):
        return INVALID
    if length <= 0 or width <= 0:
        return INVALID
    return length * width


def solve_quadratic(a, b, c):
    """
    Solve ax^2 + bx + c = 0.
    Return (x1, x2) with x1 <= x2, a single root, "NO_REAL_ROOTS",
    or INVALID if inputs are not valid.
    """
    if not _is_number(a) or not _is_number(b) or not _is_number(c):
        return INVALID
    if a == 0:
        return INVALID
    d = (b * b) - (4 * a * c)
    if d < 0:
        return "NO_REAL_ROOTS"
    if d == 0:
        return -b / (2 * a)
    sqrt_d = math.sqrt(d)
    x1 = (-b - sqrt_d) / (2 * a)
    x2 = (-b + sqrt_d) / (2 * a)
    return (x1, x2) if x1 <= x2 else (x2, x1)


def days_in_month(month, year):
    """Return number of days in a month. Valid: month 1..12, year >= 1 (int)."""
    if not _is_int(month) or not _is_int(year):
        return INVALID
    if year <= 0 or month < 1 or month > 12:
        return INVALID
    is_leap = (year % 400 == 0) or (year % 4 == 0 and year % 100 != 0)
    if month in (1, 3, 5, 7, 8, 10, 12):
        return 31
    if month in (4, 6, 9, 11):
        return 30
    return 29 if is_leap else 28


def is_prime(n):
    """Return True/False for primality. Valid: integer n >= 0."""
    if not _is_int(n):
        return INVALID
    if n < 0:
        return INVALID
    if n < 2:
        return False
    if n in (2, 3):
        return True
    if n % 2 == 0:
        return False
    i = 3
    while i * i <= n:
        if n % i == 0:
            return False
        i += 2
    return True


def alternating_sum(n):
    """Return S = 1 - 2 + 3 - 4 + ... + n. Valid: integer n >= 1."""
    if not _is_int(n):
        return INVALID
    if n <= 0:
        return INVALID
    if n % 2 == 0:
        return -(n // 2)
    return (n + 1) // 2


def gcd(a, b):
    """Return greatest common divisor. Valid: integers a,b >= 0 and not both zero."""
    if not _is_int(a) or not _is_int(b):
        return INVALID
    if a < 0 or b < 0:
        return INVALID
    if a == 0 and b == 0:
        return INVALID
    return math.gcd(a, b)


def sum_factorials(n):
    """Return S = 1! + 2! + ... + n!. Valid: integer n >= 1."""
    if not _is_int(n):
        return INVALID
    if n <= 0:
        return INVALID
    total = 0
    fact = 1
    for i in range(1, n + 1):
        fact *= i
        total += fact
    return total
