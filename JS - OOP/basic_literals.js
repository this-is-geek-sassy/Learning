const s1 = "hello";
console.log(s1.toLocaleUpperCase());  // js behind the screen adds a wrapper to it

const s2 = new String('Hello');
console.log(typeof s1, typeof s2);

console.log(window);
console.log(navigator.userAgent);

const book1 = {
    title : 'Book one',
    author : 'John Doe', 
    year : 2013,

    getSummery() {
        return `${this.title} is written by ${this.author} in ${this.year}.`;
    }
};

const book2 = {
    title : 'Book two',
    author : 'Jane Doe', 
    year : 2016,

    getSummery() {
        return `${this.title} is written by ${this.author} in ${this.year}.`;
    }
};

console.log(book1);
console.log(book1.getSummery());
console.log(book2.getSummery());

console.log(Object.keys(book2), Object.values(book2));