// What does the `this` keyword mean?

console.log(this);
// Printed in the global scope, it points to the global window object

this.asim = 1;

console.log(this.asim); // 1
console.log(window.asim); // 1
console.log(asim); // 1

function checkThis() {
	console.log(this);
}

checkThis();

