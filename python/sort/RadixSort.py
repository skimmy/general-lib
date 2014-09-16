#! /usr/bin/python

import math

def insertionSortInt(toSort, numberMask=0xFFFFFFFF):
    sortedOut = []
    for i in range(len(toSort)):
        sortedOut.append(toSort[i] & numberMask)
    return sortedOut

def bucketSort(toSort):
    sortedOut = []
    return sortedOut

def radixSort(toSort, nbuckets=16):
    sortedOut = []
    groupBitsCount = math.log(nbuckets, 2)
    for i in range(nbuckets):
        pass
    return sortedOut

if __name__ == "__main__":
    print( str(0xFF >> 4) )
    print("[DEMO] - RadixSort.py")
    print(insertionSortInt([4, 5, 3, 16], 0x1))
