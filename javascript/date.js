var today= new Date();
console.log(today.getDate());
console.log(today.getDay());
console.log(today.getFullYear());
console.log(today.getHours());
console.log(today.getMilliseconds());
console.log(today);
console.log(today.getMinutes());
console.log(today.getMonth());
console.log(today.getTime());
console.log(today.getSeconds());
console.log(today.getTimezoneOffset());

//constructor overloading

var tdate=new Date(0);
console.log(tdate);
var consString = new Date('NOV 10');
console.log(consString);
var constYear = new Date(2017,10);
console.log(constYear);

//functions
console.log("=========functions=========");
//Named Function
function add(a,b){
    console.log('sum=',a+b);
}
add(10,20);
//Function Expression
var sum = function(c,d){
    console.log('sum=',c+d);
}
console.log(sum(20,30));

//fat arrow function
var bob = (num1,num2)=>{
    console.log(num1+num2);
}
bob(20,20);
//or
var bob1=num1=>{
    console.log(num1);
}
bob1(10);
//or

var bob2=(num1,num2)=>num1+num2;
var value= bob2(40,20);
console.log(value);


gretting('hello');// calling before declaring function. but only named function can be called this way.
function gretting(msg){
    console.log(msg);
}

great("hello");// expression function
var great = function(msg){
    console.log(msg);
}
var a =10;
console.log(a);
//fat arrow function
great2('dinga');
var great2 = (msg)=>{
    console.log('hi',msg);
}
console.log("=========functions=========");
