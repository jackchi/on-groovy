/*
  2 kinds of Strings in Groovy
   - Java.lang.String
   - Groovy.lang.GString

*/

def str = 'String'
assert str instanceof java.lang.String
def gstr = "G${str}"
assert gstr instanceof groovy.lang.GString

// multi-lines strings
def multiStartNewLine = '''
line one
line two
line three
'''
print multiStartNewLine

def multiStrippedNewLine = '''\
line one
line two
line three
'''
print multiStrippedNewLine

// slashy String literals
def emoticons = /^_^/
def winpath = /C:\windows\system64\//
println emoticons
println winpath

// Immutability
universalDonor = "o-positive"
myType = universalDonor
universalDonor = "o"
assert myType == "o-positive"
