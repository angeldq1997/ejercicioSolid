# Análisis y corrección SOLID — Paquete: rrhh

## 1) Principio SOLID vulnerado principalmente
**Principio SRP:**

## 2) Justificación con evidencias
**Clase(s) y/o método(s) donde se concentra el problema:**
- AltaEmpleadoService

**Síntomas que lo delatan (marca y explica brevemente):**
- Multiples funciones en una sola clase dar de alta, guardarlo, generar la contraseña

## 3) Inconvenientes del diseño actual
**Indica cambios futuros caros o arriesgados, partes difíciles de probar o mantener, errores fáciles de introducir si el proyecto crece...:**
- Para poder guardar los datos en la base de datos futura, habrá que modificar la clase para
  que no contenga la contraseña temporal, además de modificar el generador de contraseñas y el servicio de alta

## 4) Propuesta y aplicación de la corrección
**Describe la refactorización (qué extraes, qué conviertes en interfaz, qué separas, etc.):**
- Extraer métodos en altaEmpleadoService creando interfaces
