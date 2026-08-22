num = 153

def is_armstrong(n):
    original = n
    total = 0

    while n > 0:
        digit = n % 10
        total += digit ** 3
        n //= 10

    return original == total

print(is_armstrong(num))