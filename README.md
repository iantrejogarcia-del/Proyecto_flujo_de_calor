# Flujo de Calor y Reproductor de Música

Aplicación Android con dos módulos: una **guía educativa sobre flujo de calor** con calculadora de ejercicios, y un **reproductor de música** con registro e inicio de sesión de usuarios.

## Módulo 1: Flujo de calor

Material de estudio sobre transferencia de energía térmica con una herramienta de cálculo.

- **Teoría** en ocho temas: transferencia de energía térmica, dirección del flujo de calor, causas, unidades de medida, mecanismos de transferencia, conducción, convección y radiación.
- **Calculadora de ejercicios** para conducción a través de paredes planas en serie:
  - Tres capas, cada una con su área, espesor y material (aluminio, cobre, zinc, bronce o vidrio).
  - Resistencia térmica de cada capa: `R = espesor / (área × conductividad)`.
  - Flujo de calor total: `q = (T inicial − T final) / ΣR`.

## Módulo 2: Música

- **Registro e inicio de sesión** con correo y contraseña, guardados en una base de datos SQLite local.
- Validación de campos: contraseñas que no coinciden, correos ya registrados y credenciales incorrectas.
- **Reproductor** con lista de canciones, reproducir y pausar, siguiente y anterior, y barra de progreso.

Los archivos de audio se reproducen desde `app/src/main/res/raw/`.

## Tecnologías

- Java
- Android SDK (Material Components, AppCompat, ConstraintLayout, RecyclerView)
- SQLite (`SQLiteOpenHelper`)
- `MediaPlayer` para la reproducción de audio
- Gradle (Kotlin DSL)

## Requisitos

- Android Studio (versión reciente)
- Android 11 o superior (`minSdk 30`, `compileSdk 34`)

## Cómo ejecutarlo

1. Clona el repositorio:
   ```bash
   git clone https://github.com/iantrejogarcia-del/Proyecto_flujo_de_calor.git
   ```
2. Abre el proyecto en Android Studio y espera a que termine la sincronización de Gradle.
3. Conecta un dispositivo Android o inicia un emulador.
4. Presiona **Run**.

## Estructura del proyecto

```
app/src/main/java/com/example/locurasproject/
├── MainActivity.java        # Pantalla de inicio con los dos módulos
├── flujocalor/              # Teoría y ejercicios de flujo de calor
└── Musica/                  # Login, registro, base de datos y reproductor
```

## Posibles mejoras

- Guardar las contraseñas cifradas (por ejemplo, con hash y sal) en lugar de texto plano.
- Mantener la sesión iniciada.
- Agregar la tabla de conductividades térmicas y más materiales.
- Liberar el `MediaPlayer` al cerrar la pantalla de música.

## Autor

**Ian Trejo García** — Estudiante de Ingeniería en Sistemas Computacionales
GitHub: [iantrejogarcia-del](https://github.com/iantrejogarcia-del)
