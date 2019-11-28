console.log('window object',window);
//this keyword refers to window object
console.log('this keyword',this);
//checking whether the this keyword is equal to window object 
//except one case.
console.log(this===window);

//pop message in browser
// window.alert('Welcome to Javascript');
// alert('Hey, Welcome to Javascript z');
// let confirmDelete = confirm('are you want to save or delete');
// console.log('confirmDelete',confirmDelete);

// let username = prompt('what is your name','Akhil');
console.log('username',username);

const person={
    Firstname : 'alia',
    age:26,
    lastname : 'bhatt',
    fullname : function(params) {
        console.log('this keyword',this);// only case:this keyword will change only by using object rference.all the properties will be printed.
        return this.Firstname+" "+this.lastname;
    }
}
 let getname = person.fullname();
console.log('getname:',getname);

//DOM

 let element=document.getElementById('demo');
 console.log('element is:',element);
 console.log('Text content is:',element.textContent);
 element.textContent = 'yo yo man';

 //create element
let button = document.createElement('button');
console.log("this is a :",button);
button.textContent = "click me";
//when we want to apply this on webpage
document.body.appendChild(button);

let list = createElement('ul');
let li1lement = createElement('li');
let li2lement = createElement('li');
let li3lement = createElement('li');

button.style.color='red';
element.style.fontSize = '30px';

// function showMessage(){
//     alert('hello welocme');
// }

// function changeColor() {

//    let pElement = document.getElementById('mover');
//     pElement.style.color = 'red';
    
// }

// function removeColor(params) {
//     let pElement = document.getElementById('mover');
//     pElement.style.color = 'black';
// }

// function printHello() {
//     let iElement = document.getElementById('username').value;
//     document.getElementById('showUsername').textContent = iElement;
//     // console.log('peopel wassup');
    
// }

let name = 'akhil'
let age= 21;
let phone = 1234567;
console.log(`name is ${name} Age is ${age} phone is ${phone}`);//string interpolation


