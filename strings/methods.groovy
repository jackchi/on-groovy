// String representation

def o= new Object()
assert String.valueOf( o ) == o.toString() //this works for any object in Groovy
assert String.valueOf( true ) == true.toString() //boolean value
assert String.valueOf( 'd' as char ) == ('d' as char).toString() //character
assert String.valueOf( 7.5d ) == 7.5d.toString() //double
assert String.valueOf( 8.4f ) == 8.4f.toString() //float
assert String.valueOf( 13i ) == 13i.toString() //integer
assert String.valueOf( 14L ) == 14L.toString() //long
assert String.valueOf( ['a', 'b', 'c'] ) == ['a', 'b', 'c'].toString()
//list, etc, etc, etc


// Size & Substrings
def alpha = 'abcdefghijk'
assert alpha.length() == 11 && alpha.size() == 11
assert alpha.substring(4,11) == alpha.substring(4)

// tokenize
assert 'say no\ttoday\nyes\rtmrw'.tokenize() == ['say', 'no', 'today', 'yes', 'tmrw']
