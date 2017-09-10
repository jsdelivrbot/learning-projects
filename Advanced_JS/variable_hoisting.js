// What is variable hoisting?

"use strict";

console.log(a);
var a = 1;

// "use strict" means that a variable has to be declared before it is used. We would expect the code to fail but if you run it, the error doesn't happen; instead `undefined` is printed by the console.log

// The way this code is actually processed is:

"use strict";
var a;

console.log(a); // undefined
a = 1;

// JS also performs hoisting on functions:

foo();

function foo() {
	var a;
	console.log(a);
	a = 1;
}

// This would also print out as undefined, as the function definition would go above the function call and the same rules would apply as earlier.

// What if we were to declare the function defined as a variable?

foo();

var foo = function foo() {
	var a;
	console.log(a);
	a = 1;
}

// `foo` is not a function

var foo;

foo();

foo = function foo() {
	var a;
	console.log(a);
	a = 1;
}

// Same as before, JS will assign `foo` undefined at the time of the function call, since it is still before the function definition.