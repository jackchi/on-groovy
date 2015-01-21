// string literal operation
assert 'ab' == 'a' + 'b'    // OK, no slashy string
assert 'a' + 'b' == /ab/    // OK, slashy string on RHS
assert (/ab/ == 'a' + 'b')  // brackets currently required if slashy string is on LHS

// String interpolation
def shape = 'triangle'
def altT = "${shape} is my favorite shape"
assert altT.values[0]==shape

// collections
def books = ['GEB', 'Calculus', 'RFID']
books.each { println "read: $it"}
