a = 48
b = 18

def gcd_number(a, b):
    while b != 0:
        a,b = b, a%b

    return a

print(gcd_number(a, b))
