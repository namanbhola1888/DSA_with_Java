arr = [5,5,1,5,5]

def minCost(arr):
    n = len(arr)
    if n <= 1:
        return 0

    best = float('inf')
    i = 1

    while i<n:
        j = i

        while j+1 < n and arr[j+1] == arr[i]:
            j+=1

        run = j-i+1
        best = min(best, (n-run)*arr[i])
        i = j+1

    return best

print(minCost(arr))
