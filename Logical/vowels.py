st = "grass is always greener on the other side"

def count_vowels(st):
    vowels = ['a', 'e', 'i', 'o', 'u']
    count = 0

    for char in st:
        if char in vowels:
            count+=1

    return count


def count_consonants(st):
    vowels = ['a', 'e', 'i', 'o', 'u']
    count = 0
    
    for char in st:
        if char not in vowels:
            count+=1
    
    return count

def count_vowels_consonants(st):
    vowels = ['a', 'e', 'i', 'o', 'u']
    count_vowels = 0
    count_consonants = 0
    list_vowels = []
    list_consonants = []
    
    for char in st.lower():
        if char.isalpha():
            if char in vowels:
                list_vowels.append(char)
                count_vowels+=1
            else:
                list_consonants.append(char)
                count_consonants+=1

    print(f"Count vowels: {count_vowels} and consonants: {count_consonants}")
    print(f"Vowels: {list_vowels} and Consonants: {list_consonants}")


print(count_vowels(st))

print(count_consonants(st))

count_vowels_consonants(st)