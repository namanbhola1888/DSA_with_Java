import pandas as pd

students = {
    "student_id": [101, 53, 128, 3],
    "name": ["Ulessys", "William", "Henry", "Henry"],
    "age": [13, 10, 6, 11]
}

def selectData(students: pd.DataFrame) -> pd.DataFrame:
    df = pd.DataFrame(students)
    return df.loc[df["student_id"] == 101, ["name", "age"]]

print(selectData(students))