const emp = new Promise(function (resolve, reject) {
    if(10>20){
        resolve([{
            name : 'mark',
            age : 22,

        },{
            
            name : 'mark',
            age : 22,

        },{
            
            name : 'mark',
            age : 22,

        }])
    }else{
        reject('failed');
    }
})

emp.then(function (data) {
    console.log('Employee Data', data);
    
}).catch(function (error) {
    console.log('failure message:',error);
    
})
console.log('hello');
//closures
function outerFunction(counter) {
    function innerFunction() {
        let count;
        count = counter+10;
        return count;
    }
    return innerFunction;
}

let innerFunction = outerFunction(10);
let counter = innerFunction()
console.log('Counter Value',counter);
console.log('hello');



