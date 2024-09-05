<<<<<<< HEAD
document.getElementById('clearButton').addEventListener('click', cleam);
document.getElementById('addButton').addEventListener('click', send);
var actualCell = 0;

function cleam() {
  const inputs = document.querySelectorAll('.forms');

  inputs.forEach((input) => {
    input.value = '';
=======
document.getElementById("clearButton").addEventListener("click", cleam);
document.getElementById("addButton").addEventListener("click", send);
const table = document.getElementById("table");
const inputs = document.querySelectorAll(".forms");

function cleam() {
  inputs.forEach((input) => {
    input.value = "";
>>>>>>> 60714aa19a954bd191be444d88f7bbc17a7170c0
  });
}

function send() {
<<<<<<< HEAD
  const inputs = document.querySelectorAll('.forms');
  let continues = true;
  if (inputs.length > 0) {
    var table = document.getElementById('table');
    var newRow = document.createElement('tr'); // Cria uma nova linha

    inputs.forEach((input) => {
      if (continues) {
        if (input.value == '') {
          alert('Existem parâmetros vazios!');
          continues = false;
          cleam();
        } else {
          var auxi = document.createElement('td'); // Cria uma nova célula
=======
  let continues = true;
  if (inputs.length > 0) {
    var newRow = document.createElement("tr"); // Cria uma nova linha

    inputs.forEach((input) => {
      if (continues) {
        if (input.value == "") {
          alert("Existem parâmetros vazios!");
          continues = false;
        } else {
          var auxi = document.createElement("td"); // Cria uma nova célula
>>>>>>> 60714aa19a954bd191be444d88f7bbc17a7170c0
          auxi.innerText = String(input.value); // Define o texto da célula como o valor do input
          newRow.appendChild(auxi); // Adiciona a célula à linha
        }
      }
    });
<<<<<<< HEAD

    if (continues) {
      table.appendChild(newRow); // Adiciona a nova linha à tabela se todos os inputs forem válidos
=======
    if (continues) {
      table.appendChild(newRow); // Adiciona a nova linha à tabela se todos os inputs forem válidos
      cleam();
>>>>>>> 60714aa19a954bd191be444d88f7bbc17a7170c0
    }
  }
}
