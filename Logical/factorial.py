num = 4

def fact_recursion(n):

    if n < 1:
        return 1
    
    return n * fact_recursion(n-1)


def fact_iterative(n):
    if n < 0:
        return None

    ans = 1
    for i in range(n, 1, -1):
        ans *= i

    return ans

print(fact_recursion(num))

print(fact_iterative(num))