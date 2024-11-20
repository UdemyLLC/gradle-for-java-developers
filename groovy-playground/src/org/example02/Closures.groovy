package org.example02

/**
 * A closure that prints a fixed message to the console.
 */
def a = {
    println("Hello, world!")
}
a.call()

/**
 * A closure that prints a personalized greeting to the console.
 *
 * @param name: the name to include in the greeting.
 */
def b = { name ->
    println("Hello, $name!")
}
b.call("Alice")

/**
 * A closure that prints a greeting using Groovy's implicit parameter `it`.
 *
 * This is useful for single-parameter closures where the parameter name
 * doesn't need to be explicitly defined.
 *
 * @param it: the implicit parameter containing the name for the greeting.
 */
def c = {
    println("Hello, $it!")
}
c.call("German")

/**
 * A closure that prints a personalized greeting to the console.
 *
 * @param name: the name to include in the greeting.
 * @patam age: the age of the person
 */
def personClosure = { name, age ->
    println "Name: $name, Age: $age"
}

/**
 * A function that accepts a closure with parameters
 *
 * @param message: customized message to print out
 * @param closure: the closure to execute
 */
def exePersonClosure(String message, Closure closure) {
    println "Message: $message"
    closure("Alice", 30) // Call the closure with arguments
}

// Pass the closure with parameters
exePersonClosure("Passing parameters to closure:", personClosure)
