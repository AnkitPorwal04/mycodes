#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'encryption' function below.
#
# The function is expected to return a STRING.
# The function accepts STRING s as parameter.
#

def encryption(s):
    n = ''
    ans = ''
    for i in s:
        if i != " ":
            n += i
    l = len(n)
    sqrt_l = math.sqrt(l)
    fl = math.floor(sqrt_l)
    cl = math.ceil(sqrt_l)
    if fl*cl <= l:
        for i in range(cl):
            st = ''
            for j in range(cl):
                if l>j*cl+i:
                    st += n[(j*cl)+i]
            ans += st + " "
        return ans
    else:
        for i in range(cl):
            st = ''
            for j in range(fl):
                if l>j*cl+i:
                    st += n[(j*cl)+i]
            ans += st + " "
        return ans
    

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = encryption(s)

    fptr.write(result + '\n')

    fptr.close()
