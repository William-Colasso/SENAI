document.getElementById("clearButton").addEventListener("click", cleam);
document.getElementById("addButton").addEventListener("click", send);
const table = document.getElementById("table");
const inputs = document.querySelectorAll(".forms");

function cleam() {
  inputs.forEach((input) => {
    input.value = "";
  });
}

function send() {
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
          auxi.innerText = String(input.value); // Define o texto da célula como o valor do input
          newRow.appendChild(auxi); // Adiciona a célula à linha
        }
      }
    });
    if (continues) {
      table.appendChild(newRow); // Adiciona a nova linha à tabela se todos os inputs forem válidos
      cleam();
    }
  }
}
