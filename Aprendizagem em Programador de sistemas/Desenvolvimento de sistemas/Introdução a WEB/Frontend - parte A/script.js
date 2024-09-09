const buttonSend = document.getElementById("sendData");
buttonSend.addEventListener("click", exibirSelecionados);

function exibirSelecionados() {
  const inputText = document.getElementById("inputText");
  const textArea = document.getElementById("textArea");

  var checkboxes = document.querySelectorAll('input[type="checkbox"]:checked');
  var checkValues = [];
  checkboxes.forEach((checkbox) => {
   
    checkValues.push(checkbox.value);
  });

  var radioButtons = document.querySelectorAll(
    'label input[name="radios"]:checked'
  );
  var radioValue = radioButtons.length > 0 ? radioButtons[0].value : "Nenhum";

  const textInputResult = document.getElementById("textInputResult");
  const textAreaResult = document.getElementById("textAreaResult");
  const checkBoxResult = document.getElementById("checkBoxResult");
  const radioResult = document.getElementById("radioResult");

  textInputResult.value = inputText.value;
  textAreaResult.textContent = textArea.value;
  checkBoxResult.value = "Checkboxes selecionados: "+checkValues;
  radioResult.value = "Radio selecionado: "+radioValue;
  inputText.value = "";
  textArea.value = "";  
  
}

const buttonAddTable = document.getElementById('addTable')
buttonAddTable.addEventListener('click', addTable)
function addTable(){
    
    const tbody = document.querySelector('tbody')
    const trow = document.createElement('tr')

    const c1 = document.createElement('td')
    const nome = document.getElementById('nome')
    c1.innerText = nome.value
    nome.value = ""
    const c2 = document.createElement('td')
    const idade = document.getElementById('idade')
    c2.innerText = idade.value
    idade.value = ""
    const c3 = document.createElement('td')
    const email = document.getElementById('email')
    c3.innerText = email.value
    email.value = ""


    trow.appendChild(c1)
    trow.appendChild(c2)
    trow.appendChild(c3)
    tbody.append(trow)
}