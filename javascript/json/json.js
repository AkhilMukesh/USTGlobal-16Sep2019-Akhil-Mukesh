const person = {
    name : 'sundra',
    age : 21,
    color : 'white',
    address : {
        city : 'Banglore',
        state : 'karnataka',
        pincode : 560017
    },
    hobbies : ['coding','bird watching','singing']
    
}
console.log('javascript person object',person);

const jsonObject = JSON.stringify(person);

console.log('JSON object',jsonObject);

const jsObject = JSON.parse(jsonObject);
console.log('javacript object ',jsObject);

localStorage.setItem('email','billgates@microsft.com');
const emailID = localStorage.getItem('email')
console.log('Email Id is',emailID);
localStorage.clear();