// https://jsfiddle.net/bradtraversy/e5rb0x0a/

const companies= [
    {name: "Company One", category: "Finance", start: 1981, end: 2004},
    {name: "Company Two", category: "Retail", start: 1992, end: 2008},
    {name: "Company Three", category: "Auto", start: 1999, end: 2007},
    {name: "Company Four", category: "Retail", start: 1989, end: 2010},
    {name: "Company Five", category: "Technology", start: 2009, end: 2014},
    {name: "Company Six", category: "Finance", start: 1987, end: 2010},
    {name: "Company Seven", category: "Auto", start: 1986, end: 1996},
    {name: "Company Eight", category: "Technology", start: 2011, end: 2016},
    {name: "Company Nine", category: "Retail", start: 1981, end: 1989}
  ];
  
  const ages = [33, 12, 20, 16, 5, 54, 21, 44, 61, 13, 15, 45, 25, 64, 32];


// console.log(companies);

companies.forEach((company, index, companies) => console.log(company.name));

const leagalAges = ages.filter((age) => age >= 21 );
console.log(leagalAges);

const retailCompanies = companies.filter((company) => company.category == 'Retail');
console.log(retailCompanies);

let retailCompanies2 = [];
companies.forEach((company) => {
    if(company.category == 'Retail') {
        retailCompanies2.push(company);
    }
});
console.log(retailCompanies2);

const get80sCompanies = companies.filter(company => (company.start >= 1980 && company.start <= 1989));
console.log(get80sCompanies);

const companyName = companies.map((company) => `${company.name} : ${company.start} - ${company.end}`);
console.log(companyName);

const ageSquare = ages.map(age => Math.sqrt(age));
console.log(ageSquare);

const ageMap = ages
    .map(age => Math.sqrt(age))
    .map(age => age*2);

console.log(ageMap);

// const sortedCompanies = companies.sort((company1, company2) => {
//     if(company1.start > company2.start) {
//         return 1;
//     } else {
//         return -1;
//     }
// });

// Sorting:
const sortedCompanies = companies.sort((a, b) => (a.start > b.start)? 1 : -1);

console.log(sortedCompanies);

// sort ages
const sortedAges = ages.sort((a, b) => a-b);
console.log(sortedAges);

// reduce
let ageSum = 0;
// for (let i = 0; i < ages.length; i++) {
//     ageSum += ages[i];
// }
// console.log(ageSum);

ageSum = ages.reduce((total, age) => total+age, 0);
console.log(ageSum);

const totalYears = companies.reduce((total, company) => total + (company.end - company.start), 0);
console.log(totalYears);