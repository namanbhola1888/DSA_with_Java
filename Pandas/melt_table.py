import pandas as pd

reports = pd.DataFrame({
    "product": ["Umbrella", "SleepingBag"],
    "quarter_1": [417, 800],
    "quarter_2": [224, 936],
    "quarter_3": [379, 93],
    "quarter_4": [611, 875]
})

def meltTable(reports: pd.DataFrame) -> pd.DataFrame:
    reports = reports.melt(
        id_vars="product",
        var_name="quarter",
        value_name="sales"
    )

    return reports

print(meltTable(reports))