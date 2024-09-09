function exibirSelecionados(){

    var checkboxes = document.querySelectorAll('input[type="checkbox"]:checked')
    var checkValues = []
    checkboxes.forEach((checkbox) => {
        checkValues.push(checkbox.value)
    });

    var radioButtons = document.querySelectorAll('label input[name="experience"]:checked')
    var radioValue = radioButtons.length>0 ? radioButtons[0].value : "Nenhum";

    var selectValue = document.getElementById('country').value || "Nenhum"

    var output = document.getElementById('output')
    output.innerHTML = "<strong>Navegadores selecionados</strong>"+ (checkValues.length> 0 ? checkValues.join(","): "Nenhuma")+"<br><strong>Nível de experiência:</strong>"+radioValue+"<br><strong>País Selecionado:</strong>" + selectValue;

}