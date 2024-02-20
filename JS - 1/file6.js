// conditional [ == vs ===]

let x = 20;

if (x == '20') {   // == & === are a little bit different in JS, take care of that
    console.log(true);
} else if (x > 10) {
    console.log(`x>10)`);
} else {
    console.log(`x<10`);
}

// ternary op
x = 10;
const colour = x > 10 ? 'red' : 'blue';
console.log(colour);

// switch case
