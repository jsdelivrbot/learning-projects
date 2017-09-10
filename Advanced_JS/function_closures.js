// What are function closures?

"use strict";

function sayHello(name) {
	var text = "Hello " + name;
	return function() {
		console.log(text);
	}
}

var sayAsim = sayHello("Asim")(); // Hello Asim
// Requires the extra set of parenthesis to call the returned function.

sayAsim(); // Hello Asim

// When a function returns a function, the returned function keeps a reference to any variables that it needs to use to produce its output.

// Closure: special set of references that a function needs in order to execute. (Outside of the bracket scope, but in the return)

var foo = [];
for (var i = 0; i < 10; i++) {
	foo[i] = function() { return i };
}

console.log(foo[0]());
console.log(foo[1]());
console.log(foo[2]());

// You think it would print 0, 1, 2. But it does not. When the closure is created, it doesn't get a copy of i. It points to the actual value of i in the outer scope. By the time we call the closure, i is already 10 because the closure scope points to what the variable CURRENTLY is.

// If you do want the [0, 1, 2], you can use an IIFE passing in the variable of your loop instead.

var foo = [];

for (var i = 0; i < 10; i++) {
	(function(y) {
		foo[y] = function() {
			return y
		};
	})(i);
}

// IIFE that actually performs a factorial
console.log(
	function f(n) {
		return ((n > 1) ? n * f(n-1) : n)
	})(4)
);

(function(x) {
	return (function(y) {
		console.log(x);
	})(2)
})(1);



var salary = "$1000";

(function() {
	console.log("Original salary was " + salary);
	var salary = "$5000";
	console.log("My New Salary " + salary);
})();