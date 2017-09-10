// IIFE - Immediately-Invoked Function Expression ("Iffy")

// main.js
var thing = {
	'hello': 'main'
};

console.log("main: ", thing);

// other.js
var thing = {
	'hello': 'other'
};

console.log("other: ", thing);

// HTML file first loads main.js, then other.js

// If I were to try to print out 'thing' in the browser window, it's going to print 'other' because it was the last thing to assign to `thing`.

// The global namespace (`window` object) is now polluted and global variables are being overwritten.


// Now we can wrap the `other.js` thing definition into a function scope:

// main.js
var thing = {
	'hello': 'main'
};

console.log("main: ", thing);

// other.js
function otherScope() {
	var thing = {
		'hello': 'other'
	};
}

console.log("other: ", thing);

// The global `thing` variable will be from main.js again.

"use strict";

(function() {

	// your code

})();

// Everything will be wrapped in a function scope and not able to change anything from any other files, in case you happen to share variable names.

