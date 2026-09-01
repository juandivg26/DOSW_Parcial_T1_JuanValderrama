# DOSW_Parcial_T1_JuanValderrama

- Nombre completo: Juan Valderrama
- Grupo DOSW: 1
- Nombre del enunciado: 2
- Bitacora: https://github.com/juandivg26/BitacoraDOSW.git

## Requisitos previos

- Repositorio GitHub con nombre: DOSW_Parcial_T1_JuanValderrama
- Rama creada: `develop`
- Profesor agregado como colaborador

## Evidencias de acceso a herramientas

### Herramienta de modelado

- [x] Lucidchart / Draw.io / Miro: adjunte captura de pantalla de sesión activa o acceso a la cuenta.
draw.io
<img width="1829" height="830" alt="imagen" src="https://github.com/user-attachments/assets/6e3a2fc0-cb96-4c89-aa2a-fcb806940401" />

lucid
<img width="1822" height="854" alt="imagen" src="https://github.com/user-attachments/assets/ea533e7f-679f-4044-af53-31e4af81de26" />

### Figma

- [x] Figma: adjunte captura de pantalla de acceso a la cuenta.
<img width="1837" height="887" alt="imagen" src="https://github.com/user-attachments/assets/17710ca6-d3d1-4717-a99d-5c9e6e96e4ac" />


### Evidencia de Maven

- [x] Captura o evidencia de que el proyecto se ejecuta correctamente con Maven.

<img width="931" height="829" alt="imagen" src="https://github.com/user-attachments/assets/226fca87-0a70-4c57-9421-d8c70016769a" />

# PARCIAL SOLUCION

1.	Realice el diagrama de contexto con las generalidades del sistema. (Añadirlo al README.md)

<img width="524" height="411" alt="imagen" src="https://github.com/user-attachments/assets/d2a1a5f5-04a4-4c2b-a796-cc718c6d6f7d" />

2.	Identifique 5 requerimientos del sistema: 3 funcionales y 2 no funcionales. Garantice que al menos 1 requerimiento funcional utilice Chain of Responsibility y al menos 1 utilice Adapter. (Añadirlo al README.md)
  
   ## Requirimientos Funcioanles
- validar cada turno a través de una cadena de pasos ordenados antes de confirmarlo. (Chain of resposanbility)
- procesar pagos a través de NEQUI.(Adapter)
- Crear turno

   ## Requirimientos no Funcionales
- Colores de la marca Azul (#1B2A4A) y Rojo oscuro (#7B2D2D)
- Procesar un turno en ≤ 2 s para el 95% de las solicitudes

4.	Seleccione los 2 requerimientos funcionales más importantes y desarrolle un diagrama de casos de uso con su respectiva historia de usuario. Al menos uno debe utilizar un patrón identificado. (Añadirlo al README.md)
## validar cada turno a través de una cadena de pasos ordenados antes de confirmarlo.
<img width="660" height="545" alt="imagen" src="https://github.com/user-attachments/assets/fb2dee1e-87c9-414a-8ead-5e6abadca026" />

Historia de usaurio:
- Como dueño quiero saber si el turno requerido cumple los criterios de rechazo para poder confirmarlo

## procesar pagos a través de NEQUI

Historia de usuario

- Como dueño quiero saber si el proceso del pago fue exitoso para poder separar la frnaja al cliente
- Como cliente quiero saber si mi proceso de pago fue exitoso para saber si se reservo mi turno


6.	Especifique los 2 requerimientos funcionales siguiendo la plantilla de Análisis de Requerimientos. ( Añadir a docs/requirements/) - Genera las pantallas con Figma y adjuntalas
Pueden usar figma I.A solo para la generación de sus pantallas

7.	Seleccione un requerimiento asociado a los patrones y realice la descomposición de tareas:Épica → Feature → Historia de Usuario → mínimo 3 tareas. (Añadirlo al README.md)

8.	Identifique los 2 patrones asignados (Iterator y Composite), especificando para cada uno:
a.	Nombre del patrón y tipo (creacional, estructural o de comportamiento)
b.	Justificación de la decisión en el contexto de ECI Paw Connect
c.	Diagrama de clases UML de la solución con los dos patrones aplicados
d.	Cuáles principios SOLID está aplicando y porque

9.	Desarrolle en código la solución propuesta. El método main deberá ejecutar todos los escenarios mínimos definidos. Los resultados obtenidos deberán ser consistentes con los resultados esperados. No se evaluarán únicamente los resultados finales: se evaluará que sean consecuencia de una aplicación correcta de los patrones.

