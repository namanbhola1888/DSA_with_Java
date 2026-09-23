import pandas as pd

employees = {
    "employee_id": [3, 90, 9, 60],
    "name": ["Bob", "Alice", "Harry", "Jerry"],
    "department": ["Operations", "Sales", "IT", "Development"],
    "salary": [6238, 2392, 9378, 4822]
}

def selectFirstRows(employees: pd.DataFrame) -> pd.DataFrame:
    return pd.DataFrame(employees).head(3)

print(selectFirstRows(employees))