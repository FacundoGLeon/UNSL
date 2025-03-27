# This is a sample Python script.
from copy import deepcopy

# Press Mayús+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.

l1 = [1,5,12,7,9,6,5]
l2 = [1,5]
print("l1: ",l1)
print("l2: ",l2)
for i in deepcopy(l1):
    if i in l2:
        l1.remove(i)

print("l1: ",l1)

# See PyCharm help at https://www.jetbrains.com/help/pycharm/
