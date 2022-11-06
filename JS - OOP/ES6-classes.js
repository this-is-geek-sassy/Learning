class Book {
    constructor(title, author, year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    getSummary() {
        return `${this.title} is written by ${this.author} in ${this.year}.`;
    }
    getAge() {
        const years = new Date().getFullYear() - this.year;
        return `${this.title} is ${years} old.`;
    }
    revise(newYear) {
        this.year = newYear;
        this.isRevised = true;
    }

    // static methods
    static topBookStores() {
        return 'Bares & Noble';
    }
}

// Instantiation
const book1 = new Book('book One', 'Jphn Doe', 2016);
console.log(book1);

book1.revise(2018);
console.log(book1);

console.log(Book.topBookStores());