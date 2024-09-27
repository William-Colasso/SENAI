var clear = document.getElementById('clearButton').addEventListener('click',cleam)

function cleam() {
    const inputs = document.querySelectorAll('.userForm');
    inputs.forEach(input => {
        input.value = "";
    });
}