st = "after all who cares..."

def count_freq(st):
    freq = {}

    for char in st.lower():
        if char in freq:
            freq[char]+=1
        else:
            freq[char] = 1

    return freq

print(count_freq(st))