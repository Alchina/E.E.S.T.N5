import sqlite3

def ejercicio3():
    # Crear conexión y base de datos
    conexion = sqlite3.connect('escuela.db')
    cursor = conexion.cursor()

    # Crear tabla alumnos
    cursor.execute('''
        CREATE TABLE IF NOT EXISTS alumnos (
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            nombre TEXT NOT NULL,
            curso TEXT NOT NULL
        )
    ''')

    # Insertar 3 alumnos
    alumnos = [
        ('Ana García', '1º Bachillerato'),
        ('Carlos Rodríguez', '2º ESO'),
        ('María López', '4º ESO')
    ]

    cursor.executemany('INSERT INTO alumnos (nombre, curso) VALUES (?, ?)', alumnos)

    # Guardar cambios y cerrar conexión
    conexion.commit()
    conexion.close()

    print("\nBase de datos creada y datos insertados correctamente.")

if __name__ == "__main__":
    ejercicio3()