def ejercicio2():
    # Crear y escribir en notas.txt
    materias = [
        "Base de datos",
        "Programación",
        "Instalación mantenimiento y reparación de redes"
    ]

    with open("notas.txt", "w") as archivo:
        for materia in materias:
            archivo.write(materia + "\n")

    # Leer notas.txt línea por línea
    print("\nContenido del archivo notas.txt:")
    with open("notas.txt", "r") as archivo:
        for linea in archivo:
            print(linea.strip())

if __name__ == "__main__":
    ejercicio2()