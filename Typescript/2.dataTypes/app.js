// var __extends = (this && this.__extends) || (function () {
//     var extendStatics = function (d, b) {
//         extendStatics = Object.setPrototypeOf ||
//             ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
//             function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
//         return extendStatics(d, b);
//     };
//     return function (d, b) {
//         extendStatics(d, b);
//         function __() { this.constructor = d; }
//         d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
//     };
// })();
// var myName = 'Akhil Mukesh';
// console.log(myName, typeof (myName));
// var age;
// console.log(age, typeof (age));
// var phone = 123456;
// console.log(phone, typeof (phone));
// var address;
// address = 'aksdj';
// address = 123456889;
// console.log(address, typeof (address));
// var calAge = function () {
//     console.log('Age is 22');
// };
// calAge();
// //user defined types variables:
// // creating class
// var person = /** @class */ (function () {
//     function person(name, age) {
//         this.name = name;
//         this.age = age;
//     }
//     return person;
// }());
// var per = new person('Akhil MUkesh', 22);
// console.log(per);
// // inhritance
// var Student = /** @class */ (function (_super) {
//     __extends(Student, _super);
//     function Student(name, age, rollno) {
//         var _this = _super.call(this, name, age) || this;
//         _this.rollno = rollno;
//         return _this;
//     }
//     return Student;
// }(person));
// var stud = new Student('magambo', 19, 122);
// console.log(stud);
