
var button = document.getElementById('add');
button.addEventListener('click', ()=>{
var texto = String(document.getElementById('algo').value);
var areaTexto = document.getElementById('areaTexto');


auxi = (String(areaTexto.value)+texto)+"\n";


areaTexto.innerHTML = auxi ;


    


})

