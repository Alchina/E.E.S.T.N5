// Definición de la clase Animal
class Animal {
  constructor(id, especie, jaula, tipo, masa) {
      this.id = id;
      this.especie = especie;
      this.jaula = jaula;
      this.tipo = tipo;
      this.masa = masa;
  }
}

// Datos de los animales del zoológico
const animalesZoo = [
  new Animal(1, "Tigre de Bengala", 5, "Felino", 150),
  new Animal(2, "León Africano", 2, "Felino", 180),
  new Animal(3, "Águila Real", 3, "Ave", 2),
  new Animal(4, "Anaconda Verde", 4, "Reptil", 80),
  new Animal(5, "Jaguar", 5, "Felino", 100)
];

// Funciones de cálculo
function contarAnimalesPequenos() {
  return animalesZoo.reduce((count, animal) => 
      (animal.jaula === 5 && animal.masa < 3) ? count + 1 : count, 0);
}

function contarFelinosEnRango() {
  return animalesZoo.reduce((count, animal) => 
      (animal.tipo === "Felino" && animal.jaula >= 2 && animal.jaula <= 5) ? count + 1 : count, 0);
}

function buscarAnimalLigero() {
  const animalEncontrado = animalesZoo.find(animal => animal.jaula === 4 && animal.masa < 120);
  return animalEncontrado ? animalEncontrado.especie : "No se encontró ningún animal";
}

// Funciones para actualizar la interfaz
function actualizarResultado(mensaje) {
  document.getElementById('resultados').textContent = mensaje;
}

function mostrarListaAnimales() {
  const tabla = document.createElement('table');
  const encabezados = ['ID', 'Especie', 'Jaula', 'Tipo', 'Masa (kg)'];
  
  const encabezadoFila = tabla.insertRow();
  encabezados.forEach(texto => {
      const th = document.createElement('th');
      th.textContent = texto;
      encabezadoFila.appendChild(th);
  });

  animalesZoo.forEach(animal => {
      const fila = tabla.insertRow();
      Object.values(animal).forEach(valor => {
          const celda = fila.insertCell();
          celda.textContent = valor;
      });
  });

  const contenedor = document.getElementById('listaAnimales');
  contenedor.innerHTML = '';
  contenedor.appendChild(tabla);
}

// Event listeners
document.addEventListener('DOMContentLoaded', () => {
  document.getElementById('btnContarAnimalesPequenos').addEventListener('click', () => {
      actualizarResultado(`Animales pequeños en jaula 5: ${contarAnimalesPequenos()}`);
  });

  document.getElementById('btnContarFelinos').addEventListener('click', () => {
      actualizarResultado(`Felinos entre las jaulas 2 y 5: ${contarFelinosEnRango()}`);
  });

  document.getElementById('btnBuscarAnimalLigero').addEventListener('click', () => {
      actualizarResultado(`Animal ligero en jaula 4: ${buscarAnimalLigero()}`);
  });

  mostrarListaAnimales();
});