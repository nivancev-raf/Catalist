# Catalist

**Catalist** is an Android mobile application developed as part of a university project. The app allows users to explore various cat breeds, view detailed information, and search for specific breeds using data from TheCatApi. It is built entirely in Kotlin, leveraging modern Android development practices such as Jetpack Compose, Coroutines, and Retrofit.

## Project Overview

Catalist provides users with a sleek and user-friendly interface to browse through a comprehensive list of cat breeds. Users can view breed details, including temperament, origin, and physical characteristics, along with images. The app also includes a search functionality to help users find specific breeds quickly.

### Key Features:
- **Breeds List Screen**:
  - Displays a list of all known cat breeds with brief descriptions and key temperament traits.
  - Search functionality to filter breeds by name.
  - Click on a breed to view detailed information.

- **Breeds Details Screen**:
  - Displays comprehensive details about a selected breed, including images, origin, temperament, lifespan, and more.
  - Option to open the breed's Wikipedia page in a browser.

- **Search Breeds**:
  - Allows users to search for cat breeds by name.
  - Displays search results with similar UI as the Breeds List screen.

### Technologies Used

- **Programming Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Architecture**: Model-View-Intent (MVI)
- **Networking**: Retrofit, OkHttp
- **Serialization**: Kotlinx Serialization
- **Backend API**: TheCatApi

## Getting Started

### Prerequisites
- Android Studio (latest version)
- Kotlin (latest version)
- TheCatApi API Key (obtain from [TheCatApi Signup](https://thecatapi.com/signup))

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/nivancev-raf/Catalist.git
   ```
2. Open the project in Android Studio:
   ```bash
   cd Catalist
   ```
3. Add your TheCatApi API key to the project:
   - Create a `local.properties` file in the root directory and add your API key:
     ```bash
     cat_api_key=YOUR_API_KEY_HERE
     ```

4. Build and run the app on an Android device or emulator.

## Documentation

The complete documentation for the **Catalist** project, including the technical and functional requirements, is available in the following PDF document:
- [Catalist Project Documentation](https://github.com/nivancev-raf/Catalist/blob/master/Kolokvijumski%20Projekat.pdf)

## Contact

For any questions or feedback, please reach out to [nivancev02@gmail.com](mailto:nivancev02@gmail.com).


