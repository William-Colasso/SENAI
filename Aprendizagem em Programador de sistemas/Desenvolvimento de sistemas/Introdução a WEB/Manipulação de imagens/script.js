function alternarImagem(imageId) {
  var images = document.querySelectorAll(".image-container img");
  images.forEach(function (img) {
    img.style.display = "none";
  });

  document.getElementById(imageId).style.display = "block";
}

function adicionarNovoRegistro() {
  var nome = document.getElementById("nome").value;
  var idade = document.getElementById("idade").value;
  var cidade = document.getElementById("cidade").value;

  if (nome && idade > -1 && cidade) {
    var table = document
      .getElementById("myTable")
      .getElementsByTagName("tbody")[0];
    var newRow = table.insertRow();

    var cell1 = newRow.insertCell(0);
    var cell2 = newRow.insertCell(1);
    var cell3 = newRow.insertCell(2);

    cell1.innerHTML = nome;
    cell2.innerHTML = idade;
    cell3.innerHTML = cidade;

    document.getElementById("nome").value = "";
    document.getElementById("idade").value = "";
    document.getElementById("cidade").value = "";
  } else {
    alert("Existem campos em branco, ou inválidos.");
  }
}

function mostrarImagemSelecionada(event) {
  var input = event.target;
  var reader = new FileReader();

  reader.onload = function () {
    var dataURL = reader.result;
    var output = document.getElementById("uploadedImage");
    output.src = dataURL;
    output.style.display = "block";
  };

  if (input.files && input.files[0]) {
    reader.readAsDataURL(input.files[0]);
  }
}
