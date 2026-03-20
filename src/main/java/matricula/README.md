# Análisis y corrección SOLID — Paquete: matricula

## 1) Principio SOLID vulnerado principalmente
**Principio SRP:**

## 2) Justificación con evidencias
**Clase(s) y/o método(s) donde se concentra el problema:**
- MatriculaService

**Síntomas que lo delatan (marca y explica brevemente):**
- El MatriculaService se encarga de demasiadas funciones a la vez, enviar notificación, exportarResumen, calcular el precio de la matrícula
  provocando que con cualquier pequeño cambio a una de estas funciones haya que modificar el MatriculaService

## 3) Inconvenientes del diseño actual
**Indica cambios futuros caros o arriesgados, partes difíciles de probar o mantener, errores fáciles de introducir si el proyecto crece...:**
- Si se quiere modificar cualquier operación que se halla dentro de MatriculaService hay que cambiar la clase con varios de los métodos
- Es difícil de mantener
- Si hay que cambiar un cálculo de la matrícula hay que modificar el código lo mismo con el descuento 

## 4) Propuesta y aplicación de la corrección
**Describe la refactorización (qué extraes, qué conviertes en interfaz, qué separas, etc.):**
- Extraemos el método de calcular precio permitiendo así poder añadir varios descuentos