# Análisis y corrección SOLID — Paquete: biblioteca

## 1) Principio SOLID vulnerado principalmente
**Principio DIP:**  

## 2) Justificación con evidencias
**Clase(s) y/o método(s) donde se concentra el problema:**
- PrestamoService

**Síntomas que lo delatan (marca y explica brevemente):**
- La dependencia de prestamoService para devolver un libro
- No es necesaria la clase PrestamoService, ya que se pueden incorporar a Libro los métodos
  prestar y devolver, deshaciéndonos de PrestamoService, manteniendo la misma funcionalidad

## 3) Inconvenientes del diseño actual
**Indica cambios futuros caros o arriesgados, partes difíciles de probar o mantener, errores fáciles de introducir si el proyecto crece...:**
- Como estaba era necesario modificar o actualizar la clase PrestamoService para cada uno de los tipos
  de elementos a prestar y devolver a la biblioteca

## 4) Propuesta y aplicación de la corrección
**Describe la refactorización (qué extraes, qué conviertes en interfaz, qué separas, etc.):**
- Extraigo los métodos prestar y devolver colocándolos en libro