class Car {
  color;
  constructor(color) {
    this.color = color;
  }
}
class Audi extends Car {
  brand;
  price;
  constructor(brand, price, color) {
    super(color);
    this.brand = brand;
    this.price = price;
  }
  carDetails() {
    return `Car Brand: ${this.brand}\nCar Price: ${this.price}\nCar Color: ${this.color}`;
  }
}
var object1 = new Audi("Audi", 20000, "Black");
console.log(object1.carDetails());
class BMW extends Car {
  brand;
  price;
  constructor(brand, price, color) {
    super(color);
    this.brand = brand;
    this.price = price;
  }
  carDetails() {
    return `Car Brand: ${this.brand}\nCar Price: ${this.price}\nCar Color: ${this.color}`;
  }
}
var object2 = new Audi("BMW", 25000, "Blue");
console.log(object2.carDetails());

