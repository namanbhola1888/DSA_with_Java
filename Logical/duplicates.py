st = "The guilty dog barks the loudest."

def identify_duplicates_characters(st):
    freq = {}

    for char in st.lower():
        if char.isalpha():
            freq[char] = freq.get(char, 0) + 1

    duplicates = []

    for char in freq:
        if freq[char] > 1:
            duplicates.append(char)                 

    return duplicates


def identify_duplicates_characters_using_set(st):
    seen = set()
    duplicates = set()

    for char in st.lower():
        if char in seen:
            duplicates.add(char)
        else:
            seen.add(char)

    return duplicates


def remove_duplicate_characters(st):
    seen = set()
    result = []

    for char in st.lower():
        if char.isalpha() and char not in seen:
            seen.add(char)
            result.append(char)

    return ''.join(result)


def identify_duplicate_words(st):
    words = st.split()
    seen = set()
    duplicates = []

    for word in words:
        word = word.lower()
        
        if word in seen:
            duplicates.append(word)
        else:
            seen.add(word)

    return duplicates


def remove_duplicate_words(st):
    words = st.split()
    seen = set()
    result = []

    for word in words:
        word = word.lower()

        if word not in seen:
            result.append(word)
            seen.add(word)

    return ' '.join(result)


print(identify_duplicates_characters(st))

print(identify_duplicates_characters_using_set(st))

print(remove_duplicate_characters(st))

print(identify_duplicate_words(st))

print(remove_duplicate_words(st))