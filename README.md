# 🟪 Compose Quadrant App

A Jetpack Compose app built as part of the [Android Basics with Compose](https://developer.android.com/courses/pathways/android-basics-compose-unit-1-pathway-3) pathway. This app demonstrates layout management using `Row`, `Column`, and the `Modifier.weight()` to create a responsive UI divided into four equal quadrants.

---

## 🧩 Features

- **4 Quadrants**, each explaining a Composable function
- **Equal screen division** using weight modifiers
- **Center-aligned** text in each quadrant
- **Consistent padding** and color backgrounds

---

## 🎨 UI Design Specs

| Quadrant     | Color         | Title             | Description |
|--------------|---------------|-------------------|-------------|
| Top Left     | `#EADDFF`     | Text composable   | Displays text and follows the recommended Material Design guidelines. |
| Top Right    | `#D0BCFF`     | Image composable  | Creates a composable that lays out and draws a given Painter class object. |
| Bottom Left  | `#B69DF8`     | Row composable    | A layout composable that places its children in a horizontal sequence. |
| Bottom Right | `#F6EDFF`     | Column composable | A layout composable that places its children in a vertical sequence. |

---

## 🛠️ Implementation Highlights

- Used `Column` inside a `Row` to build a 2x2 grid
- Applied `Modifier.weight(1f)` to divide screen space evenly
- Used `Modifier.fillMaxSize()` and `Arrangement.Center`, `Alignment.CenterHorizontally`
- All content is padded using `Modifier.padding(16.dp)`
- Titles use `FontWeight.Bold` and bottom padding of 16dp

---

## 📸 Screenshot

![WhatsApp Image 2025-05-14 at 16 42 52_5b3c2fd3](https://github.com/user-attachments/assets/c6d3732f-d0ea-4e52-89af-717501f5c8f0)



---

## 🚀 Run This App

1. Clone this repository:
   ```bash
   git clone https://github.com/yourusername/ComposeQuadrantApp.git
   ```
2. Open in Android Studio

3. Build & Run the app on emulator or device

### 📘 Part of Android Basics in Compose
This is the third project in Unit 1, Pathway 3 of Android Basics with Compose.
