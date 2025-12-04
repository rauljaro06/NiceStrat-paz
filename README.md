[![GPLv3 License](https://img.shields.io/badge/License-GPL%20v3-yellow.svg)](https://opensource.org/licenses/)

## Descripción

Aquí se encuentran el código fuente (Java), los recursos (layouts, drawables, valores), de la aplicacion `NiceStrat`.

<img src="img/registrar.png" alt="Registrar" width="200px"/> <img src="img/login.png" alt="Registrar" width="200px"/> <img src="img/main.png" alt="Registrar" width="200px"/> <img src="img/Captura de pantalla 2025-11-11 a las 13.46.16.png" alt="Registrar" width="200px"/>


## Requisitos

- JDK (11+ recomendado, según configuración del proyecto).
- Android Studio (obligatorio).

## Características principales

- **Menús contextuales**: Acceso rápido a opciones mediante menús contextuales y de barra de aplicación
- **SwipeRefresh**: Funcionalidad de recarga mediante gesto de deslizamiento
- **Snackbar**: Notificaciones no intrusivas con acciones
- **Navegación entre actividades**: Flujo entre pantallas de login, registro y vista principal

## Dependencias principales

- SwipeRefreshLayout
- Glide


## Color Reference

| Color             | Hex                                                                |
| ----------------- | ------------------------------------------------------------------ |
| LightBlue1 | ![#07F2F2](https://placehold.co/15/07F2F2/07F2F2) #07F2F2 |
| LightBlue2 | ![#05F2DB](https://placehold.co/15/05F2DB/05F2DB) #05F2DB |
| DarkBlue1 | ![#03A696](https://placehold.co/15/03A696/03A696) #03A696 |
| DarkBlue2 | ![#027368](https://placehold.co/15/027368/027368) #027368 |
| Brown | ![#26110F](https://placehold.co/15/26110F/26110F) #26110F |

## Estructura principal

- `src/main/java/Login.java` - código fuente del backend de la ventana asociada al inicio de sesión
- `src/main/java/MainActivity.java` - código fuente del backend de la vista principal con WebView, menús y diálogos
- `src/main/java/SingUp.java` - código fuente del backend de la ventana asociada al registro de una cuenta nueva
- `src/main/res/layout/activity_login.xml` - código del frontend de la ventana asociada al inicio de sesión
- `src/main/res/layout/activity_main.xml` - código del frontend de la vista principal con WebView y SwipeRefreshLayout
- `src/main/res/layout/activity_sing_up.xml` - código del frontend de la ventana asociada al registro de una cuenta nueva
- `src/main/res/menu/menu_context.xml` - menú contextual con opciones de copiar y descargar
- `src/main/res/menu/menu_appbar.xml` - menú de barra de aplicación con configuraciones
- `src/main/AndroidManifest.xml` - manifest del módulo

## Cómo contribuir

1. Crea un branch con un nombre descriptivo (por ejemplo `feature/nombre` o `fix/descripcion`)
2. Abre un Pull Request hacia la rama destino (ej. `develop` o `main`) con una descripción clara de los cambios
3. Incluye screenshots o pasos para reproducir si el cambio afecta la UI
4. Asegúrate de que los nuevos menús y diálogos sigan las pautas de Material Design

## Licencia

Respeta los términos antes de redistribuir o reutilizar código.
