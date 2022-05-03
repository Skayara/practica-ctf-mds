""" from itertools import combinations
A = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
temp = combinations(A, 8)
for i in list(temp):
	print (i[0],i[1],i[2],i[3],i[4],i[5],i[6],i[7]) """

from math import factorial

def potencia(c):
    if len(c) == 0:
        return [[]]
    r = potencia(c[:-1])
    return r + [s + [c[-1]] for s in r]

def imprime_ordenado(c):
    for e in sorted(c, key=lambda s: (len(s), s)):
        strings = [str(integer) for integer in e]
        a_string = "". join(strings)
        an_integer = int(a_string)
        print(an_integer)

def combinaciones(c, n):
    return [s for s in potencia(c) if len(s) == n]

def inserta(x, lst, i):
    return lst[:i] + [x] + lst[i:]

def inserta_multiple(x, lst):
    return [inserta(x, lst, i) for i in range(len(lst) + 1)]

def permuta(c):
    if len(c) == 0:
        return [[]]
    return sum([inserta_multiple(c[0], s) for s in permuta(c[1:])], [])

def permutaciones(c, n):
    return sum([permuta(s) for s in combinaciones(c, n)],[])

imprime_ordenado(permutaciones([1, 2, 3, 4, 5, 6, 7, 8, 9, 0], 8))