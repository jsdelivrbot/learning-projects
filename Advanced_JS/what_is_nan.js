// What is the type of NaN?

NaN // NaN
typeof(NaN) // number

"abc"/4 // NaN

NaN == 1 // false
NaN == false // false
NaN == NaN // false

// NaN compared to any other value at all is always false, even when it's compared to itself.

isNaN(NaN) // true - This is the only function that you can use to check for NaN.
isNaN(1) // false
isNaN("1") // false
isNaN("A") // true - Implicit conversion. JS is trying to coerce "A" into a number so it can identify whether or not it is a number.

Number("1") // 1
isNaN(1) // false ??

// The isNaN function isn't really that useful unless the value you're checking in the function is actually SUPPOSED to be a number.

// The only foolproof way to check if a value is NaN:

var a = NaN
a !== a // true

a = 1
a !== a // false

a = 'a'
a !== a // false

// Check if a variable is not equal to itself; this is the only way to tell if it is NaN because NaN is the only thing in JS that is not equal to itself.
