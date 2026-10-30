class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class SinglyLinkedList:
    def __init__(self):
        self.head = None

    def insert_at_begining(self, data):
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node

    def insert_at_end(self, data):
        new_node = Node(data)

        if self.head is None:
            self.head = new_node
            return

        temp = self.head

        while temp.next:
            temp = temp.next

        temp.next = new_node

    def delete_node(self, key):
        if self.head is None:
            return

        if self.head.data == key:
            self.head = self.head.next
            return 

        temp = self.head

        while temp.next and temp.data != key:
            temp = temp.next

        if temp.next:
            temp.next = temp.next.next
        

    def search_node(self, key):
        if self.head is None:
            return

        temp = self.head
        index = 0

        while temp:
            if temp.data == key:
                return index

            temp = temp.next
            index += 1

        return -1

    def display_list(self):
        temp = self.head

        while temp:
            print(temp.data, end=" -> ")
            temp = temp.next

        print(None)
        

    def list_to_linked_list(self, arr):
        dummy = Node(-1)
        temp = dummy

        for val in arr:
            temp.next = Node(val)
            temp = temp.next

        self.head = dummy.next

arr = [1,24,2,34,1]

obj = SinglyLinkedList()
obj.list_to_linked_list(arr)


obj.insert_at_begining(23)
obj.insert_at_end(2)

obj.display_list()

obj.delete_node(2)

print(obj.search_node(34))

obj.display_list()