var Emp = /** @class */ (function () {
    function Emp(name, num, sal) {
        var _this = this;
        this.getDetails = function () { return console.log("Name:".concat(_this.name, " \n ID:").concat(_this.num, " \n SALARY:").concat(_this.sal)); };
        this.name = name;
        this.num = num;
        this.sal = sal;
    }
    return Emp;
}());
var dis = new Emp('Ciril', 12, 16000);
dis.getDetails();
