text="racecar"
def ispalindrome(s):
    if len(s)<=1:
        return True
    if s[0]!=s[-1]:
        return False
    return ispalindrome(s[1:-1])
print("Is Palindrome:",ispalindrome(text))