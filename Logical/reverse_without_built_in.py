s = "hi what's going on ?"

def reverse_without_builtin(s: str) -> str:
    reversed_str = ""

    for char in s:
        reversed_str = char + reversed_str

    return reversed_str


def reverse_whole_word(s: str) -> str:
    s = s.split()
    reverse_words = ""

    for word in s:
        reverse_words = word + " " + reverse_words

    return reverse_words

print(reverse_without_builtin(s))
print(reverse_whole_word(s))