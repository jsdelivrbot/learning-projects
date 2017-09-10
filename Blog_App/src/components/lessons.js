// What does "use strict" do?

// Strict mode allows you to place a program or a function in what is called a "strict" operating context. It makes debugging easier. Code errors that would otherwise have been ignored, or failed silently, will now generate exceptions.

// Why is it a string? Older browsers didn't support strict mode initially. If "use strict" is in a JavaScript file run on an older browser, it would attempt to parse `use strict` as keywords, and the entire file would simply fail. Used as a string, older browsers would just ignore it.

// Put "use strict" at the top of your file.