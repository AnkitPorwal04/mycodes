#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'acmTeam' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts STRING_ARRAY topic as parameter.
#

def acmTeam(topic, n):
    max_kn = 0
    x = 0
    for i in range(n):
        for j in range(i+1, n):
            kn = 0
            for k in range(len(topic[i])):
                if topic[i][k] == '1' or topic[j][k] == '1':
                    kn += 1
            if kn>max_kn:
                max_kn = kn
                x = 1
            elif kn==max_kn:
                x += 1
    return [max_kn, x]

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    first_multiple_input = input().rstrip().split()

    n = int(first_multiple_input[0])

    m = int(first_multiple_input[1])

    topic = []

    for _ in range(n):
        topic_item = input()
        topic.append(topic_item)

    result = acmTeam(topic, n)

    fptr.write('\n'.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
