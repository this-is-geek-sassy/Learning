// Object of protos
const bookProtos = {
    getSummary : function() {
        return `${this.title} is written by ${this.author} in ${this.year}.`;
    },

    getAge: function() {
        const years = new Date().getFullYear() - this.year;
        return `${this.title} is ${years} old.`;
    }
}

// const book1 = Object.create(bookProtos);
// book1.title = 'Book One';
// book1.author = 'John Doe';
// book1.year = 2013;

const book1 = Object.create(bookProtos, {
    title : {value: 'Book One'},
    author : {value: 'Jena Doe'},
    year : {value: 2013}
});

console.log(book1);