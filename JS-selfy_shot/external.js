
// prompt() always returns data in forms of string

if (confirm("Do you want to delete this folder?")) {
    alert("You are brave");
} else {
    alert("Wise decision");
}

var num1 = Number(prompt("Enter the first number:", 0));
        var num2 = parseInt(prompt("Enter the second number:", 0));
        
        function add(num1, num2) {
            return num1+num2;
        }

        function sub(num1, num2) {
            return num1 - num2;
        }

        var addResult = add(num1, num2);
        var subResult = sub(num1, num2);

        document.getElementById("spanAdd").innerText = addResult;
        document.getElementById("spanSub").innerText = subResult;
        