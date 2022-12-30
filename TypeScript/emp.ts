class Emp
{
    name:string;
    num:number;
    sal:number;

    constructor(name:string,num:number,sal:number)
    {
        this.name=name;
        this.num=num;
        this.sal=sal;
    }

    getDetails=() => console.log(`Name:${this.name} \n ID:${this.num} \n SALARY:${this.sal}`);
}
let dis=new Emp('Ciril',12,16000)
dis.getDetails();