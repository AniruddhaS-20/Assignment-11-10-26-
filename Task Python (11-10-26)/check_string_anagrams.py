def anagrams(str1, str2):
    cleanstr1 = str1.lower().replace(" ", "")
    cleanstr2 = str2.lower().replace(" ", "")
    if len(cleanstr1) != len(cleanstr2):
        return False
    charcount = {}
    for char in cleanstr1:
        charcount[char] = charcount.get(char, 0) + 1
    for char in cleanstr2:
        if char not in charcount:
            return False
        charcount[char]-=1
    for count in charcount.values():
        if count != 0:
            return False         
    return True
first="listen"
second="silent"
print(f"Are anagrams:{True if anagrams(first,second) else False}")
