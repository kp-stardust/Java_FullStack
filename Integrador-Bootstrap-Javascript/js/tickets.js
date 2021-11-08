const cantidad = document.getElementById('cantidadEntradas');

const calculo = document.getElementById('res');

const categoria = document.getElementById('cat');

const totalCompra = document.getElementById('totalCompra');


function resumenPago() {
   
    let c = parseInt(cantidad.value);
    
    let total;
    let precio = 200;
    let descuento;

    switch(categoria.value) {
        case 'estudiante':
            descuento = ((precio*80)/100);
            total = parseInt(precio - descuento) * c;
            break;
        case 'trainee':
            descuento = ((precio*50)/100);
            total = (precio - descuento) * c;
            break;
        case 'junior':
            descuento = ((precio*15)/100);
            total = (precio - descuento) * c;
            break;
    }

    totalCompra.innerHTML = total;
}

function borrarDatos() {

    totalCompra.innerHTML = 'Total a Pagar: $';
    cantidad.value = 1;
}
