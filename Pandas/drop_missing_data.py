import pandas as pd

students = pd.DataFrame({
    "student_id": [32, 217, 779, 849],
    "name": ["Piper", None, "Georgia", "Willow"],
    "age": [5,19,20,24]
})

def dropMissingData(students: pd.DataFrame) -> pd.DataFrame:
    return students.dropna(subset=["name"])

print(dropMissingData(students))