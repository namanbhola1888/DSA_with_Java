# To revere a integer and return it

num = 1234

def reverse_num(num):
    reversed = 0

    while num > 0:
        digit = num % 10
        reversed = reversed * 10 + digit
        num //= 10

    return reversed

print(reverse_num(num))