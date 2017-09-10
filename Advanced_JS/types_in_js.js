// What are the different types in JavaScript?

// ECMAScript5, 5 primitive types, 1 non-primitive

// Primitive: boolean, number, string, null, undefined

// Non-Primitive: object

// Using typeof for `null` produces `object` even though it is supposed to be `null`

// What is the difference between a dynamically typed language and a statically typed language?
// Statically typed language (like Java), you must specify what types each variable will hold.
// Dynamically typed language (JavaScript), the type of the values will be determined at runtime.

typeof(null); // object(?)

var a; // `undefined` is what JavaScript sets a variable to when it has not yet been given a variable. Uninitialized or missing parameters, etc.
// Null is usually used by programmers to indicate that variables do not yet have a value. Default, for when they intend to assign the value after some user interaction or something else.
console.log(a); // undefined