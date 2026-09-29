import pandas as pd

students = pd.DataFrame({
    "id": [1,2,3,4,5],
    "first": ["Mason", "Ava", "Taylor", "Georgia", "Thomas"],
    "last": ["King", "Wright", "Hall", "Thompson", "Moore"],
    "age": [6,7,16,18,10]
})

def renameColumns(students: pd.DataFrame) -> pd.DataFrame:
    students.rename(columns={
        "id": "student_id",
        "first": "first_name",
        "last": "last_name",
        "age": "age_in_years"
    }, inplace=True)
    
    return students

print(renameColumns(students))