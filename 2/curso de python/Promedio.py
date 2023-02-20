promedio = 0

print("Sistema para calcular el promedio de un alumno." + "\n")

nombre = input("Para comenzar dame tu nombre: ")
nota1 = float(input("¿Cual es tu Calificacion de matematicas: "))
nota2 = float(input("¿Cual es tu calificacion de química: "))
nota3 = float(input("¿Cual es tu calificacion de Biología: "))

promedio = (nota1 + nota2 + nota3)/3

    
print(nombre + ", El promedio de tus notas es: ", round(promedio,2))

if promedio <= 6:
    print("Lo siento, haz reprobado.")
else:
    print("felicidades, haz aprobado el año.")
    
print("Fin.")

