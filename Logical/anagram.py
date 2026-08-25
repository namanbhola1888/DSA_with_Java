a = "listen"
b = "silent"

def is_anagram(a, b):
    return sorted(a) == sorted(b)


def is_anagram_using_freq(a, b):
    if len(a) != len(b):
        return False
    
    freq = {}

    for char in a:
        if char.isalpha():
            freq[char] = freq.get(char, 0) + 1

    for char in b:
        if char not in freq:
            return False

        freq[char]-=1

        if freq[char] < 0:
            return False

    return True

    
print(is_anagram(a, b))

print(is_anagram_using_freq(a, b))