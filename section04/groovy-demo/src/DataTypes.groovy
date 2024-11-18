
// print out a simple string to the console
println("groovy is cool and awesome");

// declares a variable
// and infers the data type from assignation
def a = 10;
println(a);
println(a.class)

// declares a variable
// and explicitly sets the data type
float b = 10.25F
println(b)

// string interpolation works
// with double quotes
def name = "German"
def lastName = "Valencia"
def fullName = "Sr. $name $lastName"
println(fullName);

// declaring a string in multiple lines
// using single quotes
def fullAddress =
'''
CR 8 No. 172 A - 85
TO. 2 APTO. 104
'''
println(fullAddress);
