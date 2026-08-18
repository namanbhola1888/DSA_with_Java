# Reverse a String

s = "hi who are you?"

def reverse(s):
    return s[::-1]

def reverseWords(s):
    s = s.split()
    s.reverse()
    return ' '.join(s)

print(reverse(s))

print(reverseWords(s))