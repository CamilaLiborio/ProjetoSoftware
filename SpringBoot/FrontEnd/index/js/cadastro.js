//DOM - Manipular o HTML 

//Maneiras de selecionar o HTML

//document.getElementById() - selecionar pelo ID
// document.getElementById() - selecionar pela TAG
// document.getElementByClass() - selecionar pela CLASSE
//document.querySelector() - selecionar pela CLASSE ID ou TAG

const form = document.querySelector("#formProduto")

form.addEventListener('submit' , function(event){
    event.preventDefault()

    //ID's do HTML
    const nomeProduto = document.querySelector("#nome").value
    const marca = document.querySelector("#marca").value
    const tamanho = document.querySelector("#tamanho").value
    const preco = document.querySelector("#preco").value
    const quantidade = document.querySelector("#quantidade").value

    //formato json
    const dados = {
        nomeProduto : nomeProduto,
        marca : marca,
        tamanho : tamanho,
        preco : parseFloat(preco),
        quantidade : parseInt(quantidade)
    }

    // cabeçalho de uma requisição do protocolo HTTP
    fetch('http://localhost:8080/roupa' , {
        method : 'POST',
        headers : {
            "Content-type" : 'application/json'
        },

        body : JSON.stringify(dados)

    })

    .then(reponse => {

        if (reponse.ok) {
            Swal.fire({
                title : "ROUPA CADASTRADA COM SUCESSO",
                text : "ROUPA CADASTRADA",
                icon : "success"
            })
        } else {
            alert("Não deu certo")
        }

    })

    .catch( erro => {
        alert("Deu Ruim")
    })
}) 