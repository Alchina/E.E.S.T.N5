def ejercicio1():
    # Crear y escribir en el archivo
    with open("mi archivo.txt", "w") as archivo:
        archivo.write("Hola, estoy aprendiendo Python")

    # Leer el archivo
    with open("mi archivo.txt", "r") as archivo:
        contenido = archivo.read()
        print("\nContenido del archivo 1:")
        print(contenido)

if __name__ == "__main__":
    ejercicio1()
