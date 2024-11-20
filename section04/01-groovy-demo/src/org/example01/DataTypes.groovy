package org.example01

/**
 * Print out a simple string to the console
 * */
println("groovy is cool and awesome");

/**
 * Declares a variable
 * and infers the data type from assignation
 * */
def a = 10;
println(a);
println(a.class)

/**
 * Declares a variable
 * and explicitly sets the data type
 * */
float b = 10.25F
println(b)

/**
 * String interpolation
 * with double quotes
 * */
def name = "German"
def lastName = "Valencia"
def fullName = "Sr. $name $lastName"
println(fullName);

/**
 * Multi line string declaration
 * */
def fullAddress =
'''
CR 8 No. 172 A - 85
TO. 2 APTO. 104
'''
println(fullAddress);
