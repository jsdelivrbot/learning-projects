// What are the different scopes in JS?

var asim = 1; // Global variable (outside a function) - available from any part of your application, including deeply nested in your functions. All global variables are actually properties of the window object.

function moo() {
	var foo = 1;
}
console.log(foo); // not defined

// Scope of variable `foo` is only available to us within the block of the function defined by the curly braces.

for (var i = 0; i < 5; i ++) {
	var j = 5;
}

console.log(j); // 5

// The for loop is in the global scope and creates global variables `i` and `j`.