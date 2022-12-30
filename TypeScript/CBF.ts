function fun1(x,y)
{
    console.log(`Entered Number is ${y}`);
    x();
}
function fun2()
{
    console.log("Function-2");
}
fun1(fun2,120);