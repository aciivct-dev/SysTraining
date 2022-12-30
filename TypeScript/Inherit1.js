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
var Car = /** @class */ (function () {
    function Car(color) {
        this.color = color;
    }
    return Car;
}());
var Audi = /** @class */ (function (_super) {
    __extends(Audi, _super);
    function Audi(brand, price, color) {
        var _this = _super.call(this, color) || this;
        _this.brand = brand;
        _this.price = price;
        return _this;
    }
    Audi.prototype.carDetails = function () {
        return "Car Brand: ".concat(this.brand, "\nCar Price: ").concat(this.price, "\nCar Color: ").concat(this.color);
    };
    return Audi;
}(Car));
var object1 = new Audi("Audi", 20000, "Black");
console.log(object1.carDetails());
var BMW = /** @class */ (function (_super) {
    __extends(BMW, _super);
    function BMW(brand, price, color) {
        var _this = _super.call(this, color) || this;
        _this.brand = brand;
        _this.price = price;
        return _this;
    }
    BMW.prototype.carDetails = function () {
        return "Car Brand: ".concat(this.brand, "\nCar Price: ").concat(this.price, "\nCar Color: ").concat(this.color);
    };
    return BMW;
}(Car));
var object2 = new Audi("BMW", 25000, "Blue");
console.log(object2.carDetails());
