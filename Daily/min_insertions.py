class MinInsertions:
    def minInsertions(self, s: str) -> int:
        insertions = 0
        need = 0

        for c in s:
            if c == '(':
                need += 2

                if need % 2 == 1:
                    insertions += 1
                    need -= 1

            else:
                need -= 1

                if need < 0:
                    insertions += 1
                    need = 1

        return need + insertions

s = "(()))"

obj = MinInsertions()
print(obj.minInsertions(s))