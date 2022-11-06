// Constructors

function Book(title, year, author) {
    // console.log("Book instatiated..");
    this.title = title;
    this.author = author;
    this.year = year;

    this.getSummery = function() {
        return `${this.title} is written by ${this.author} in ${this.year}.`;
    }
}

const book1 = new Book('Book One', 'John Doe', 2013);
const book2 = new Book('Book Two', 'Jane Doe', 2016);

console.log(book1.title, book1);
console.log(book1.getSummery());