const hobbies = ['sleeping','cricket','eating','coding','roaming'];
console.log(typeof(hobbies));
console.log(Array.isArray(hobbies));
console.log(hobbies.includes('coding',1));
console.log(hobbies.push('pubg','basketball'));
console.log(hobbies.pop());
console.log(hobbies.unshift('computer','lol'));
console.log((hobbies.shift()));
console.log('this is the original array');
console.log(hobbies)
console.log(hobbies.splice(1,2,'bird watching','fighting'));
console.log('after splice method',hobbies.slice(2,4));
console.log(hobbies.indexOf('eating'));
console.log(hobbies.join('-'))

console.log('------------------------------');
//adding in each and every element in array
//mmap method
// const numbers = [100,200,300,400];
// const numbers1 = [];
// for(let i=0;i<numbers.length;i++){
//  let value = numbers[i]+50;
    // console.log(value);
    
// }


//fat arrow function
// const num = numbers.map(value => value+50);
// console.log(num);

//filter method
const numbers = [100,200,300,400];
const numbers1 = [];
for(let i=0;i<numbers.length;i++){
  if(numbers[i]>200)
    console.log(numbers[i]);
    
}

const number = numbers.filter(function(value,index){
    if(value>200){
        return true;

    }else{
        return false;
    }
});
console.log(number);

const num = numbers.filter(value=>value>200)
console.log(num);


//assignment
/*const items = [{
    name : 'earing',
    id : 1,
    price : 5000, 
},
{
    name : 'kajal',
    id : 2,
    price : 1000, 
},
{
    name : 'trimmer',
    id : 3,
    price : 3000, 
},
{
    name : 'gel',
    id : 4,
    price : 170, 
}];

console.log(items);
*/
/*
Take 10 objects
use map method to add price
use filter method to price > 3000
*/

//Strings 
