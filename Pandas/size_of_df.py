import pandas as pd
from typing import List

players = {
    "player_id" : [846, 749, 155],
    "name": ["Mason", "Relay", "Bob"],
    "age": [21, 30, 28],
    "position": ["Forward", "Winger", "Striker"],
}

def getDataframeSize(players: pd.DataFrame) -> List[int]:
    return list(pd.DataFrame(players).shape)
    # df = pd.DataFrame(players)
    # return [df.shape[0], df.shape[1]]

print(getDataframeSize(players))
