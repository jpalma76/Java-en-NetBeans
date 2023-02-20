import base64 as b64


archivo_lectura = open('texto.txt','r')
arcivo_escritura = open('resultado.txt','w')
texto_sin_codificar = archivo_lectura.read()


texto_decodificado = b64.b64decode(texto_codificado)
print('El texto decodificado es: {} '.format(texto_decodificado))

archivo_escritura.write(str(texto_codificado))
archivo_escritura.write(str(texto_decodificado))

archivo_escritura.close()
archivo_lectura.close()
                        
