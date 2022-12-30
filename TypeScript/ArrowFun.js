var display = function (a, b) {
    return console.log(a + b);
};
console.log("\nThis is a Simple Parameterless Arrow Function");
display(10, 20);
var resty = function (name) {
    var Numb = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        Numb[_i - 1] = arguments[_i];
    }
    return console.log("\nname: ".concat(name, "\nNumbers: ").concat(Numb.join()));
};
resty('Ciril', 1, 2, 3, 4, 4, 5, 5, 6, 7, 8, 8, 9);
