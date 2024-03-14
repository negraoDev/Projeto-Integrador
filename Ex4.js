let resul = document.getElementById('Resultado')
let vprodutos = prompt('Digite o número de produtos vendidos:') * 1
let preco = prompt ('Digite o valor unitário dos produtos vendido:') * 1

function  cálculoVenda ( ) {
    let  valorTotal  =  vprodutos * preco 
        if  (  valorTotal  >=  100 ) {
            return  alert( 'O valor da venda foi de R$${ valorTotal }.' ) 
        }
        else{
            let frete = valorTotal + 15
            return alert('O valor da venfa foi de R$${frete}, por conta do frete.')
        } 
}
calculoVenda()
