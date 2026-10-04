import pandas as pd

animals = pd.DataFrame({
    "name": ["Tatiana", "Khaled", "Alex", "Jonathan", "Stefan", "Tommy"],
    "species": ["Snake", "Giraffe", "Leopard", "Monkey", "Bear", "Panda"],
    "age": [98, 50, 6, 45, 100, 26],
    "weight": [464, 41, 328, 463, 50, 349]
})


def findHeavyAnimals(animals: pd.DataFrame) -> pd.DataFrame:
    animals = (
        animals
        .loc[animals['weight'] > 100]
        .sort_values('weight', ascending=False)
        [['name']]
    )

    return animals

print(findHeavyAnimals(animals))