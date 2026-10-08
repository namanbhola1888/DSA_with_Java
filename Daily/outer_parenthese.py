class OuterParentheses:
    def removeOuterParentheses(self, s: str) -> str:
            res, level = [], 0

            for c in s:
                if c == ')':
                    level -= 1
                if level > 0:
                    res.append(c)
                if c == '(':
                    level += 1

            return "".join(res)

s = "(()())(())"

obj = OuterParentheses()
print(obj.removeOuterParentheses(s))