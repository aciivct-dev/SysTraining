var p=new Promise(function pro(x,y) {
res=false;
if(res)
x("It is True");
else
setTimeout(() => {
    y("Access Denied")
}, 1000);
})
console.log(p)
p.then(function(val) {console.log(val);} )
.catch(function (val) {console.log(Error);} )
.finally("test")




