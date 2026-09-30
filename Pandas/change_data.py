import pandas as pd

students = pd.DataFrame({
    "student_id": [1,2,3,4,5],
    "name": ["Mason", "Ava", "Taylor", "Georgia", "Thomas"],
    "age": [6,7,16,18,10],
    "grade": [73.0, 87.0, 23.1, 74.21, 23.1]
})

def changeDatatype(students: pd.DataFrame) -> pd.DataFrame:
    students["grade"] = students["grade"].astype(int)
    return students

print(changeDatatype(students))