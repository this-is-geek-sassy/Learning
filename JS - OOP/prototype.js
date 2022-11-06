// Constructors

function Book(title, author, year) {
    // console.log("Book instatiated..");
    this.title = title;
    this.author = author;
    this.year = year;

    // this.getSummery = function() {
    //     return `${this.title} is written by ${this.author} in ${this.year}.`;
    // }
}

// getsummery
Book.prototype.getSummery = function() {
    return `${this.title} is written by ${this.author} in ${this.year}.`;
}

// getAge
Book.prototype.getAge = function() {
    const years = new Date().getFullYear() - this.year;
    return `${this.title} is ${years} old.`;
}

// Revise //change year
Book.prototype.revise = function(newYear) {
    this.year = newYear;
    this.isRevised = true;
}

const book1 = new Book('Book One', 'John Doe', 2013);
const book2 = new Book('Book Two', 'Jane Doe', 2016);

console.log(book1.title, book1);
console.log(book1.getSummery());
console.log(book2.getAge());
// console.log(typeof book2.year);

console.log(book2);
book2.revise(2018);
console.log(book2);
console.log(book1);