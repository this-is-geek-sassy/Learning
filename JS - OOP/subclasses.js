class Book {
    constructor(title, author, year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    getSummary() {
        return `${this.title} is written by ${this.author} in ${this.year}.`;
    }
}


// magazine subclass
class Magazine extends Book {
    constructor(title, author, year, month) {
        super(title, author, year);
        this.month = month;
    }
}

// Instantiation
const book1 = new Book('book One', 'Jphn Doe', 2016);
console.log(book1);

const mag1 = new Magazine('Mag One', 'Jphn Doe', 2018, 'Jan');
console.log(mag1);
