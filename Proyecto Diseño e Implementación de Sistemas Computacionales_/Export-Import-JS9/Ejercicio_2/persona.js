export class Persona {
    constructor(nombre,edad) {
        this.edad = edad;
        this.nombre = nombre;
    }
    mostrarInformacion(){
        return`Nombre: $(this.nombre), Edad: $(this.edad)`;
    }
}