# HLine (Helpline App)

## Overview
HLine is a mobile app designed to provide helplines for various emergencies and other useful services across multiple countries. The app includes a search bar for quick access to countries, along with their respective emergency and non-emergency helplines. Users can tap to immediately call any listed number, making it easier to get help during emergencies.

The app features a country flag indicator, a search bar with auto-completion, and a visual warning about double-tapping to call.

## Features
- **Auto-complete Search Bar**: Quickly search for a country and view the emergency and other helplines.
- **Helpline Categories**: Displays emergency services and other helplines like Women’s Helpline, Suicide Prevention, and Poison Control.
- **Immediate Call**: Double-tapping any helpline number initiates a call.
- **Multi-country Support**: Supports helplines from multiple countries, including the India, United States, United Kingdom, Canada, and more.

## Requirements
- Android SDK version 35 or higher.
- Necessary permissions (e.g., CALL_PHONE) for making calls.
- Internet connection for loading country flags.

## Libraries & Tools
- Jetpack Compose for UI.
- Coil for image loading (flags).
- Kotlin Coroutines for asynchronous operations.

## Getting Started

### Clone the repository
```bash
git clone https://github.com/yourusername/hline.git
cd hline
