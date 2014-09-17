#! /usr/bin/python

import math

def insertionSortInt(toSort, numberMask=0xFFFFFFFF):
    n = len(toSort)
    for j in range(2,n):
        key = toSort[j]
        i = j - 1
        while i > 0 and (toSort[i] & numberMask) > (key & numberMask):
            toSort[i + 1] = toSort[i]
            i = i - 1
        toSort[i + 1] = key
    return toSort

def bucketSort(toSort):
    n = len(toSort)
    B = [[]] * n
    for i in range(n):
        pass
#        (B[]).append(toSort[i])
    return toSort

def radixSortHex(toSort, D=8):
    nbucket = 16
    n = len(toSort)
    B = [[]]*nbucket
    for d in range(D):
        shift = d * 4
        mask = (0xF << shift)
#        print "%d %X" % (shift,mask)
        for i in range(n):            
            b = (toSort[i] & mask) >> shift # bucket_of(toSort[i])
            print "%s, %d" % ("{0:b}".format(toSort[i]), b)
            B[b].append(toSort[i])
        toSort = []
        for j in range(nbucket):
            toSort.extend(B[j])
            B[j] = []
    return toSort

if __name__ == "__main__":
    print("[DEMO] - RadixSort.py")
    print(insertionSortInt([4, 5, 3, 16]))
    print(radixSortHex([1,2,100,-34,40, 127,3]))
