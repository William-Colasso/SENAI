document.getElementById(`clearButton`).addEventListener(`click`, cleam);
document.getElementById(`addButton`).addEventListener(`click`, send);
var actualCell = 0;

function cleam() {
  const inputs = document.querySelectorAll(".forms");

  inputs.forEach((input) => {
    input.value = "";
  });
}
function send() {
  const inputs = document.querySelectorAll(".forms");
  continues = true;
  inputs.forEach((input) => {
    if (continues) {
      if (input.value == "") {
        alert("Existem parametros vazios!");
        continues = false;
        cleam();
      } else {
        const table = document.getElementById("table");
        const newRow = document.createElement("tr");

        for (let i = 0; i < 6; i++) {
          var auxi = document.createElement("td");
          auxi.innerText = String(input.value);
          newRow.appendChild(auxi);
        }

        table.appendChild(newRow);
      }
    }
  });
}
