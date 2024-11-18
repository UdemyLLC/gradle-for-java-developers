/**
 * A simple closure that prints out to the console
 * */
c = { println("Closures are super simple") }
c.call()

/**
 * A simple closure that prints out to the console
 * */
b = { name -> println("Hello $name") }
b.call("german");