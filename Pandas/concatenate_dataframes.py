import pandas as pd

df1 = pd.DataFrame({
    "student_id": [1,3,2,4],
    "name": ["Mason", "Ava", "Taylor", "Georgia"],
    "age": [8,6,15,17]
})

df2 = pd.DataFrame({
    "student_id": [6,5],
    "name": ["Leo", "Alex"],
    "age": [7,7]
})

def concatenateTables(df1: pd.DataFrame, df2: pd.DataFrame) -> pd.DataFrame:
    result =  pd.concat([df1, df2])
    return result

print(concatenateTables(df1, df2))