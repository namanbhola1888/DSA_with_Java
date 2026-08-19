# To check if a number is prime or not

num = 7

def is_prime(n):
    if n <= 1:
        return False
    
    for i in range(2, n):
        if n % i == 0:
            return False

    return True


def is_prime_optimize(n):
    if n <= 1:
        return False

    i = 2
    while i * i <= n:
        if n % i  == 0:
            return False
        i+=1

    return True


def prime_range(start, end):

    primes = []
    for num in range(max(2, start), end + 1):
        is_prime = True

        i = 2
        while i * i <= num:
            if num % i == 0:
                is_prime = False
                break
            i+=1

        if is_prime:
            primes.append(num)

    return primes

print(is_prime(num))

print(is_prime_optimize(num))

start = 4
end = 15
print(prime_range(start, end))