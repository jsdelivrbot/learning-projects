// What's the differenec between == and ===?
// Good reference material: JavaScript Equality Table

// === checks for both type and value equality.
0 === 0; // true
0 !== 1; // true
0 === '' // false - If both the values are different types, this will always be false.
0 === '0' // false
false == 'false' // false

// The rules by which JavaScript tries to convert values on either side of the == sign are fairly complicated.


// == checks for value equality only.
0 == 0; // true
0 != 1; // true
'' == '0' // false
0 == '' // true
0 == '0' // true - JS intelligently tries to figure out a way to convert both values so they are of the same type. 0 and '0' are both converted to a string, and then they are equal in value.