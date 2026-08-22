num = 7

def fib_recursion(n):
    if n <= 1:
        return n

    return fib_recursion(n - 1) + fib_recursion(n - 2)

def fib_rescursion_with_print(n, a=0, b=1):
    if n == 0:
        return

    print(a, end=" ")

    fib_rescursion_with_print(n-1, b, a+b)


def fib_iterative(n):
    a = 0
    b = 1
    result = []

    for i in range(0, n):
        result.append(a)
        a,b = b, a+b

    return result


print(fib_recursion(num))

print(fib_iterative(num))

fib_rescursion_with_print(num)