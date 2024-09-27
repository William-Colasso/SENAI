var button = document.getElementById("add");
button.addEventListener("click", () => {
  var texto = document.getElementById("algo");

  var areaTexto = document.getElementById("areaTexto");

  if (texto != "") {
    areaTexto.innerHTML = String(areaTexto.value) + String(texto.value) + "\n";
    texto.value = "";
  } else alert("Por favor, digite algo");
});
