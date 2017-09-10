// When you pass a variable to a function, such as `a`, are you passing a value or a reference to the function?

// When you pass a primitive type (string, numbers, boolean, etc.), you are passing by value. If you change the value of the variable (primitive type) within the function, you aren't changing the value in the outer scope (outside the function). You're just passing a copy of `a`, or just the 1 itself. You're not passing the ability to change the variable itself.

"use strict";

var a = 1;

function foo(a) {
	a = 2;
}

foo(a); // 2

console.log(a); // 1

// When you pass an object, you are passing by reference. If you want to change a property on the object, your function can do that. But you cannot entirely change the object; it will act as it did in the first example.

var a = {};
function foo(a) {
	a.moo = false;
}
foo(a); // { moo: false }
console.log(a); // { moo: false }