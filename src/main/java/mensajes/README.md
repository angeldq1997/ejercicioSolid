# Análisis y corrección SOLID — Paquete: mensajes

## 1) Principio SOLID vulnerado principalmente
**Principio OCP:**

## 2) Justificación con evidencias
**Clase(s) y/o método(s) donde se concentra el problema:**
- Mensaje y GeneradorTextoMensajes

**Síntomas que lo delatan (marca y explica brevemente):**
- Una clase con bastantes atributos, algunos los usa y otros no
- Cada nuevo tipo implica modificar la clase base
- Bloques if solo para tipos

## 3) Inconvenientes del diseño actual
**Indica cambios futuros caros o arriesgados, partes difíciles de probar o mantener, errores fáciles de introducir si el proyecto crece...:**
- Si se quiere implementar un nuevo tipo de mensaje hay que cambiar las clases GeneradorTextoMensajes, Mensaje y TipoMensaje

## 4) Propuesta y aplicación de la corrección
**Describe la refactorización (qué extraes, qué conviertes en interfaz, qué separas, etc.):**
- Generar una clase base y crear subclases que hereden de esta, incluyendo atributos propios, pudiendo así evitar tanto TipoMensaje como Generador
  ampliando la posibilidad de crear más tipos de mensaje a futuro
