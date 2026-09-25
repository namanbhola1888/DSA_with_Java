import pandas as pd

employees = pd.DataFrame({
    "name": ["Piper", "Grace", "Georgia", "Willow", "Finn", "Thomas"],
    "salary": [4548, 28150, 1103, 6593, 7476, 24433]
})

def createBonusColumn(employees: pd.DataFrame) -> pd.DataFrame:
    employees["bonus"] = employees["salary"] * 2
    return employees

print(createBonusColumn(employees))