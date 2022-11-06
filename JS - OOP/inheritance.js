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

function Magazine(title, author, year, month) {
    Book.call(this, title, author, year);
    this.month = month;
}

// inherit prototype
Magazine.prototype = Object.create(Book.prototype);

// using magazine constructor
Magazine.prototype.constructor = Magazine;

// instantiate 
mag1 = new Magazine('Mag One', 'John Doe', 2018, 'Jan');
console.log(mag1);

console.log(mag1.getSummery());