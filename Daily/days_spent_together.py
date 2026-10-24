class daysSpentTogether:

    def day_number(self, date: str) -> int:
        days = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

        month = int(date[:2])
        day = int(date[3:])

        total = sum(days[:month - 1]) + day

        return total


    def countDaysTogether(self, arriveAlice: str, leaveAlice: str, arriveBob: str, leaveBob: str) -> int:
        start = max(self.day_number(arriveAlice), self.day_number(arriveBob))
        end = min(self.day_number(leaveAlice), self.day_number(leaveBob))

        if start > end:
            return 0

        return end - start + 1


arriveAlice, leaveAlice, arriveBob, leaveBob = "08-15", "08-18", "08-16", "08-19"

obj = daysSpentTogether()
print(obj.countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob))