var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Circle = /** @class */ (function () {
    function Circle(shape, area) {
        this.shape = shape;
        this.area = area;
    }
    return Circle;
}());
var Shapes = /** @class */ (function (_super) {
    __extends(Shapes, _super);
    function Shapes() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Shapes.prototype.disp = function () {
        console.log("Shape is ".concat(this.shape, " \nArea is ").concat(this.area));
    };
    return Shapes;
}(Circle));
var obj1 = new Shapes("Circle", 120);
obj1.disp();
