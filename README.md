# KMPSpaceX App :rocket:

Project to apply my studies with Kotlin Multiplatform.


![KmpSpaceX](https://github.com/rodrigoaads/KMPSpaceX/assets/90936908/7e2c0a4f-fbb1-4e37-8e74-47812ed77992)

## Development tools

* [Atomic Design](https://atomicdesign.bradfrost.com/chapter-2/) with [Jetpack Compose](https://developer.android.com/develop/ui/compose)
* [Ktor](https://ktor.io/)
* [Image Loader](https://github.com/qdsfdhvh/compose-imageloader)

:x: Does not include the iOS version yet (I don't have the operating system :sweat_smile:).

### :construction: I will keep future refactorings updated here, including dependency injection, clean, navigation...

This is a Kotlin Multiplatform project targeting Android, iOS, Desktop.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.


Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…

Enjoy! :mage:
