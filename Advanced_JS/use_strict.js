// What does "use strict" do?

// Strict mode allows you to place a program or a function in what is called a "strict" operating context. It makes debugging easier. Code errors that would otherwise have been ignored, or failed silently, will now generate exceptions.

// Why is it a string? Older browsers didn't support strict mode initially. If "use strict" is in a JavaScript file run on an older browser, it would attempt to parse `use strict` as keywords, and the entire file would simply fail. Used as a string, older browsers would just ignore it.

// Put "use strict" at the top of your file.

// If you are working on legacy JavaScript code (unlikely these days), you can add "use strict" into a function definition to use it only within the context of the function.

// In "use strict" mode, using a variable before it's been defined causes an error. If you are not in "use strict" mode, using a variable before declaration creates a global variable on the file. In the browser, the global object is `window`. But if you're in Node, the global object is `global`. By declaring

asim = 1;

// you've created window.asim