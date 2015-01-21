/* String Interpolation with Closures */

// lazy evaluation
def date = new Date()
def eagerDate = "Creation date is ${new Date()}"
def lazyDate = "Evaluated date is ${-> new Date()}"
sleep 1000
println eagerDate
println lazyDate
assert eagerDate.values[0] instanceof Date
assert lazyDate.values[0] instanceof Closure

// parameter less Closure
def sayName = {
  print "inside function call"
  it  // returning the parameter
}
println "${sayName('name')}"
