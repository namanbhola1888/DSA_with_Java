import pandas as pd

employees = pd.DataFrame({
    "name": ["Jack", "Piper", "Mia", "Ulysses"],
    "salary": [19666 ,74754, 62509, 54866]
})

def modifySalaryColumn(employees: pd.DataFrame) -> pd.DataFrame:
    employees["salary"] = employees["salary"] * 2
    return employees

print(modifySalaryColumn(employees))