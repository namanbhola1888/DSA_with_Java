# To check if number is palindrome or not

num = 121

def palindrome_num(num):
    s = str(num)
    left = 0
    right = len(s) - 1

    while left < right:
        if s[left] != s[right]:
            return False

        left+=1
        right-=1

    return True

def is_palindrome(num):
    if num < 0:
        return False

    original = num
    reversed = 0

    while(num > 0):
        digit = num % 10
        reversed = reversed * 10 + digit
        num //= 10

    return original == reversed

print(palindrome_num(num))

print(is_palindrome(num))