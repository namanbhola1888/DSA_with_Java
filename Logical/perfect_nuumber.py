num = 28

def is_perfect(n):
    total = 0

    for i in range(1, n//2 + 1):                # We don't need to check numbers greater than n/2
        if n % i == 0:                          # For n = 28, no number greater than 14 (except 28 itself) can divide 28.
            total += i

    return n == total

print(is_perfect(num))