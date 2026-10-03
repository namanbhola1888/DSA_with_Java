import pandas as pd

weather = pd.DataFrame({
    "city": [
        "Jacksonville", "Jacksonville", "Jacksonville", "Jacksonville", "Jacksonville",
        "ElPaso", "ElPaso", "ElPaso", "ElPaso", "ElPaso"
    ],
    "month": [
        "January", "February", "March", "April", "May",
        "January", "February", "March", "April", "May"
    ],
    "temperature": [
        13, 23, 38, 5, 34,
        20, 6, 26, 2, 43
    ]
})

def pivotTable(weather: pd.DataFrame) -> pd.DataFrame:
    weather = weather.pivot(
        index= "month",
        columns= "city",
        values= "temperature"
    )

    return weather


print(pivotTable(weather))