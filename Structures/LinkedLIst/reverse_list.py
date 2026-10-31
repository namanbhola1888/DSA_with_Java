class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class LinkedList:
    def __init__(self):
        self.head = None

    def reverse_linked_list(self):
        prev = None
        curr = self.head

        while curr:
            next_node = curr.next
            curr.next = prev
            prev = curr
            curr = next_node

        self.head = prev

    def display(self):
        temp = self.head

        while temp:
            print(temp.data, end=" -> ")
            temp = temp.next

        print("None")

    def arr_to_list(self, arr):
        dummy = Node(-1)
        temp = dummy

        for val in arr:
            temp.next = Node(val)
            temp = temp.next

        self.head = dummy.next


arr = [1, 2, 3, 4]

ll = LinkedList()

ll.arr_to_list(arr)
ll.display()

ll.reverse_linked_list()
ll.display()