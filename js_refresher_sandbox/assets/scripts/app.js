// import { apiKey } from "./util";

// import apiKey from "./util";
// import { name, age } from "./util";

import * as utils from "./util.js";

console.log(utils.apiKey); // default import
console.info(utils.name, utils.age);

class User {
  constructor(name, age) {
    this.name = name;
    this.age = age;
  }
  greet() {
    console.log("Hello");
  }
}

const u1 = new User("Emanuel", 39);
console.log(u1);

const hobbies = ["sports", "movies", "redaing"];

console.log(hobbies[0]);
const editedHobbies = hobbies.map((item) => ({ text: item }));
console.log(editedHobbies);

const [firstName, lastName] = ["saswata", "mishra"];
console.log(firstName);
console.log(lastName);

const user = {
  name: "saswata",
  age: 34,
};

const { name: userName, age } = user;
console.log(userName, age);

const newHobbies = ["cooking"];
const allHobies = [...hobbies, ...newHobbies];
console.log(allHobies);

const extendedUser = {
  isAdmin: true,
  ...user
};
console.log(extendedUser);