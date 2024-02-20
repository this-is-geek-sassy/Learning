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
switch (colour) {
    case 'red':
        console.log('color is red');
        break;
    case 'blue':
        console.log('color is blue');
        break;
    default:
        console.log('color is not red or blue');
        break;
}