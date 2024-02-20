// string properties and methods
const s = 'Hello world!\n This is supposed to be the next line';
// window.console.log(s);
console.log(s);
// console is an object of windpow api

console.error("This is a sample error!");
console.warn("this is a sample warning!");

console.log(s.length);
console.log(s.toUpperCase());
console.log(s.substring(0,4).toLowerCase());

const s_arr = s.split('\n ');
const s_arr2 = s.split();
const s_arr_3 = s.split('');
console.log(s_arr, s_arr2, s_arr_3);


//console.clear();
console.info("this is a sample information bulletine");
console.log("this is also  sample information bulletine \nBut it is generated using console.log()");