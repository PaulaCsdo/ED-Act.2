# ED-Act.2
#### Pasos para subir al repositorio el proyecto inicial (de la actividad 1):
1. Navego a la carpeta en mi entorno local 
2. Añado la dirección del repositorio de github donde quiero subir el proyecto: git remote add ED-Act.2 git@github.com:PaulaCsdo/ED-Act.2.git
3. Al hacer un push al repo ED-Act.2 me da un error "unrelated histories" por lo que tengo que hacer git push ED-Act.2 --allow-unrelated-histories
4. Al intentar unir ambos proyectos, obtengo un conflicto porque hay dos archivos con el mismo nombre README.md. Como hemos decidido crear un nuevo readme para esta actividad, manualmente corrijo el conflicto en el archivo
5. Finalmente consigo hacer el push y el repositorio PaulaCsdo/ED-Act.2.git es actualizado con el proyecto de la actividad 1
6. Navego a la carpeta donde voy a guardar en mi entorno local el proyecto de la actividad 2. Ahí hago un git clone git@github.com:PaulaCsdo/ED-Act.2.git y establezco mi rama remote origin git@github.com:PaulaCsdo/ED-Act.2.git
Estos pasos sólo se han realizado una vez.  

#### Actualización de la clase Suma
1. He creado una rama en mi repositorio y directamente me he posicionado en ella: git checkout -b suma.
2. He realizado los cambios necesarios en la clase Suma en eclipse.
3. He añadido los archivos modificados a stage: git add bin/com/itt/calculadora/Suma.class src/com/itt/calculadora/Suma.java 
4. He hecho un commit: git commit -m "actualizado metodo Suma.sumaReales()"
5. He cambiado a la rama main: git checkout main
6. He hecho un merge: git merge suma
7. He hecho un push y establecido el default para futuros push como la rama main del repositorio remoto: git push -u origin main
