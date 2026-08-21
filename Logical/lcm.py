from gcd import gcd_number

a = 12
b = 18

def lcm_number(a, b):
    gcd = gcd_number(a, b)
    return abs(a * b) // gcd
    
print(lcm_number(a, b))