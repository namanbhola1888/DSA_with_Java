num1 = [1,2,3,4]
num2 = [3,4,5,6]

def merge_list(num1, num2):
    merged = []
    i = 0
    j = 0
    n = len(num1)
    m = len(num2)

    while i < n and j < m:
        if num1[i] < num2[j]:
            merged.append(num1[i])
            i+=1
        else:
            merged.append(num2[j])
            j+=1
        
    while i < n:
        merged.append(num1[i])
        i+=1

    while j < m:
        merged.append(num2[j])
        j+=1

    return merged


print(merge_list(num1, num2))