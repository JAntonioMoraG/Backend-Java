# Practica LineUp (MultiHilos)
## Practica realizada por José Antonio Mora Guzmán 
En esta practica se debe hacer el lineup de un concierto con hilos, interfaces, herencia, polimorfismo, poner audio y video
En esta ocasion yo lo hice a modo de dos escenarios, en el escenario uno toca molotov mientras el escecnario 2 no tiene presentacion y al terminar molotov entra panteon rococo al escenario 2 y cuando finaliza panteon rococo entra el estelar que es valentin elizalde para cerrar el concierto en el escenario 1.
### NOTA IMPORTANTE: Para la parte gráfica hice uso de la libreria "imonsh" la cual nos fue proporcionada por la MC [Fernanda Ochoa](https://github.com/FernandaOchoa) como no es una biblioteca la cual yo haya desarrollado no puedo subirla al repositorio porque es de uso exclusivo para los cursos de LAUNCH X, gracias por la atencion :)
* [Clic aqui](https://github.com/JAntonioMoraG/Backend-Java/tree/main/Practicas-POO/05-practicaLineUp/src) para ver el codigo.


## Diagrama de practica:

<img src="https://github.com/JAntonioMoraG/Backend-Java/blob/main/Practicas-POO/05-practicaLineUp/capturas/diagramaConcierto01.png" alt="Diagrama de clases">
<img src="https://github.com/JAntonioMoraG/Backend-Java/blob/main/Practicas-POO/05-practicaLineUp/capturas/diagramaConcierto02.png" alt="Diagrama de clases">

## Codigo para poner la musica
### Para poner las canciones se uso la siguiente fraccion de codigo. Las canciones no las agregue en el repositorio por cuestiones de derechos de autor, para que funcionen deben ponerlas en formato wav y dentro de la carpeta src
```java
 try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("./src/amisenemigos.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Error al reproducir el sonido." +ex);
        }
 ```
## Capturas del funcionamiento

#### Muestra los dos escenarios antes de iniciar
<img src="https://github.com/JAntonioMoraG/Backend-Java/blob/main/Practicas-POO/05-practicaLineUp/capturas/01.png" alt="captura prueba 01">
<br>

#### Presentacion de Molotov en escenario 1 
<img src="https://github.com/JAntonioMoraG/Backend-Java/blob/main/Practicas-POO/05-practicaLineUp/capturas/02.png" alt="captura prueba 02">
<br>

#### Presentacion de Panteon Rococo en escenario 2
<img src="https://github.com/JAntonioMoraG/Backend-Java/blob/main/Practicas-POO/05-practicaLineUp/capturas/03.png" alt="captura prueba 03">
<br>

#### Presentacion de Valentin el Gallo de oro en el escenario 1
<img src="https://github.com/JAntonioMoraG/Backend-Java/blob/main/Practicas-POO/05-practicaLineUp/capturas/04.png" alt="captura prueba 04">

