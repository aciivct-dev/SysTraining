class Circle
{
    shape;
    area;
    constructor(shape,area)
    {
        this.shape=shape;
        this.area=area;
    }
}
class Shapes extends Circle{
disp():void
{
    console.log(`Shape is ${this.shape} \nArea is ${this.area}`);
}
}
var obj1=new Shapes("Circle",120);
obj1.disp();