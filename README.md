# DOSW_Parcial_T1_JuanValderrama
* Nombre completo: Juan Valderrama
* Grupo DOSW: 1
* Nombre del enunciado: 2 - Bob’s Barber
* Bitacora: https://github.com/juandivg26/BitacoraDOSW.git

## Requisitos previos
* Repositorio GitHub con nombre: DOSW_Parcial_T1_JuanValderrama
* Rama creada: `develop`
* Profesor agregado como colaborador

## Evidencias de acceso a herramientas

### Herramienta de modelado
* Lucidchart / Draw.io / Miro: adjunte captura de pantalla de sesión activa o acceso a la cuenta.

draw.io  
<img width="1829" height="830" alt="imagen" src="https://github.com/user-attachments/assets/6e3a2fc0-cb96-4c89-aa2a-fcb806940401" />

lucid  
<img width="1822" height="854" alt="imagen" src="https://github.com/user-attachments/assets/ea533e7f-679f-4044-af53-31e4af81de26" />

### Figma
* Figma: adjunte captura de pantalla de acceso a la cuenta.  
<img width="1837" height="887" alt="imagen" src="https://github.com/user-attachments/assets/17710ca6-d3d1-4717-a99d-5c9e6e96e4ac" />

### Evidencia de Maven
* Captura o evidencia de que el proyecto se ejecuta correctamente con Maven.  
<img width="931" height="829" alt="imagen" src="https://github.com/user-attachments/assets/226fca87-0a70-4c57-9421-d8c70016769a" />

# PARCIAL SOLUCION

1. Realice el diagrama de contexto con las generalidades del sistema. (Añadirlo al README.md)  

<img width="1076" height="834" alt="imagen" src="https://github.com/user-attachments/assets/8e3c6080-e23e-49c3-8164-8aa5d764e632" />

2. Identifique 5 requerimientos del sistema: 3 funcionales y 2 no funcionales. Garantice que al menos 1 requerimiento funcional utilice Chain of Responsibility y al menos 1 utilice Adapter. (Añadirlo al README.md)

## Requerimientos Funcionales
1. Validar cada turno a traves de una cadena de pasos ordenados (franja, barbero, datos cliente, servicio, pasarela) antes de confirmarlo (Chain of Responsibility)
2. Procesar pagos a traves de las distintas pasarelas (Nequi, PSE, Stripe, Efectivo) normalizando la respuesta de cada una a un formato comun (Adapter)
3. Crear turno

## Requerimientos no Funcionales
1. Colores de la marca Azul (#1B2A4A) y Rojo oscuro (#7B2D2D)
2. Procesar un turno en ≤ 2 s para el 95% de las solicitudes

3. Seleccione los 2 requerimientos funcionales más importantes y desarrolle un diagrama de casos de uso con su respectiva historia de usuario. Al menos uno debe utilizar un patrón identificado. (Añadirlo al README.md)

## 3. Diagrama de Casos de Uso e Historias de Usuario

Los 2 requerimientos funcionales mas importantes seleccionados son:

1. Validar cada turno a traves de una cadena de pasos ordenados (Chain of Responsibility)

### HU
- Como dueño quiero saber si el turno cumple los criterios de rechazo para poder confirmarlo.

<img width="1400" height="710" alt="imagen" src="https://github.com/user-attachments/assets/02c9acd6-5e76-4145-a4a9-72f5ca3459af" />

2. Procesar pagos a traves de las pasarelas (Adapter)

### HU
- Como dueño quiero saber si el proceso del pago fue exitoso para poder reservar la franja al cliente.
- Como cliente quiero saber si mi proceso de pago fue exitoso para saber si se reservo mi turno.

<img width="1610" height="548" alt="imagen" src="https://github.com/user-attachments/assets/ea4dec76-6a34-436d-8613-c4ea77eca6ab" />

4. Especifique los 2 requerimientos funcionales siguiendo la plantilla de Análisis de Requerimientos. (Añadir a docs/requirements/) - Genera las pantallas con Figma y adjuntalas  

Los archviso se encuentran en docs/requirements

5. Seleccione un requerimiento asociado a los patrones y realice la descomposición de tareas: Épica → Feature → Historia de Usuario → mínimo 3 tareas. (Añadirlo al README.md)

## 5. Descomposicion de Tareas

Epica: BOB'S BARBER — Sistema de gestion de turnos

Feature: Procesar pagos a traves de las pasarelas (Nequi, PSE, Stripe, Efectivo) mediante Adapter

Historias de usuario:
- Como dueño quiero saber si el proceso del pago fue exitoso para poder reservar la franja al cliente.
- Como cliente quiero saber si mi proceso de pago fue exitoso para saber si se reservo mi turno.

Task:
1. Crear la interfaz de pago que reciba monto y datos del cliente y devuelva si quedo aprobado, rechazado o pendiente
2. Hacer el adapter de Nequi - que reciba telefono, nombre y monto y lo traduzca a la respuesta comun
3. Hacer los adapters de PSE, Stripe y Efectivo - cada uno con sus propias reglas para aprobar o rechazar
4. Conectar todo en un servicio que reciba la pasarela elegida, llame el adapter correcto y guarde el comprobante si el pago quedo aprobado
5. Hacer pruebas simulando cada pasarela (aprobado, rechazado, pendiente) para verificar que todo funcione bien

## 6. Patrones de Diseño Aplicados

### Patron 1: Chain of Responsibility

Tipo: Patron de comportamiento.

Justificacion: Un turno debe pasar por 5 validaciones obligatorias en un orden especifico (franja, barbero, datos cliente, servicio, pasarela) y si una falla, se detien todo. Con Chain of Responsibility cada validacion queda aislada, y si mañana el negocio pide una regla nueva, se puede agregar con facilidad sin tocar los que ya existen.

Principios SOLID aplicados:
- OCP: se agregan validaciones nuevas creando handlers nuevos, sin modificar los existentes.
- LSP: cualquier handler puede reemplazar a otro en la cadena porque todos cumplen el mismo contrato.

### Patron 2: Adapter

Tipo: Patron estructural.

Justificacion: Nequi, PSE, Stripe y Efectivo tienen metodos totalmente distintos y cada uno responde diferente. El Adapter envuelve cada pasarela para que el sistema siempre reciba payment_Id, estado, mensaje.

Principios SOLID aplicados:
- DIP: el sistema depende de la interfaz, no de cada pasarela concreta.
- ISP: la interfaz solo tiene un metodo, ningun adapter se ve obligado a implementar algo que no usa.
- OCP: agregar una pasarela nueva es crear un adapter nuevo, no tocar los existentes.

7. Desarrolle en código la solución propuesta. El método main deberá ejecutar todos los escenarios mínimos definidos. Los resultados obtenidos deberán ser consistentes con los resultados esperados. No se evaluarán únicamente los resultados finales: se evaluará que sean consecuencia de una aplicación correcta de los patrones.
