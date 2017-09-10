// What is the scope chain?

// Functions can nest inside other function scopes. When an inner function needs to use a variable, it looks up the scope chain.

"use strict";

function foo() {
	console.log(myvar);
}

function goo() {
	var myvar = 1;
	foo();
}

goo(); // myvar is not defined


function goo() {
	var myvar = 1;
	function foo() {
		console.log(myvar);
	}
	foo();
}

goo(); // 1


var myvar = 1;

function goo() {
	function foo() {
		console.log(myvar);
	}
	foo();
}

goo(); // 1

