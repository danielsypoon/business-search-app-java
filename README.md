# Yelp Search

The purpose of this project is to demonstrate how I build Android applications from the ground up.
It is less about the application content and more about the code (and processes). 

The goal is to showcases my knowledge of Java object oriented programming in Android, including my knowledge of:

- Reactive programming with [RxJava 2](https://github.com/ReactiveX/RxJava/tree/2.x) and 
  [RxAndroid 2](https://github.com/ReactiveX/RxAndroid/tree/2.x)
- Dependency injection with [Dagger 2](https://github.com/google/dagger/tree/dagger-2.10-rc4)
- View binding with [Butterknife](https://github.com/JakeWharton/butterknife/tree/butterknife-parent-7.0.1)
- Networking with [Retrofit 2](https://github.com/square/retrofit/tree/parent-2.2.0)
- Mapping with [Google Maps APIs](https://developers.google.com/maps/documentation/android-api/)
- Testing with [JUnit 4](https://github.com/junit-team/junit4/blob/master/doc/ReleaseNotes4.12.md), 
  [Mockito 2](https://github.com/mockito/mockito/tree/release/2.x), 
  [Robolectric 3](https://github.com/robolectric/robolectric/tree/robolectric-3.3.2), and
  [Espresso](https://google.github.io/android-testing-support-library/docs/espresso/index.html)
- [Clean, modular architecture](https://github.com/android10/Android-CleanArchitecture)
- [Model-View-Presenter](https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93presenter) (MVP) pattern
- [Model-View-ViewModel](https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93viewmodel) (MVVM) pattern
- Java and Android best practices, including programming patterns/styles
- Creating readable, focused, and well-documented pull requests


## Application and Features

Using the [Yelp Fusion (v3) REST API](https://www.yelp.com/developers/documentation/v3), 
I have created a simple Yelp search application that is able to:

- display places around the user's current location in a list and map views
- show more details on a specific place when clicking on a list or map item

**Notes**

- I kept the application short and simple with no styling and no advanced UI for brevity. 
- I am not using the [Yelp Android API](https://github.com/Yelp/yelp-android) so that I am able to 
  demonstrate my knowledge of [Retrofit 2](https://github.com/square/retrofit/tree/parent-2.2.0)

#### Building and Running the Application

There are several ways to build and run the application.

**Using Gradle**

You may build the application binary (APK) using gradle in the command line,

```
./gradlew assemble<build_variant>
```

For example, to build the MVP Debug build variant,

```
./gradlew assembleMvpDebug
```

Then install the build using adb,

```
adb install <path_to_apk>
```

For example, to install the MVP Debug build variant,

```
adb install app/build/outputs/apk/mvp-debug-v0.0.1-b1.apk
```

**Using Android Studio**

You may *open* this project in Android Studio (v2.x) and run the application by selecting
Run -> Run 'app'


## Architecture

TODO


## Tests

#### Unit Tests

JUnit4, Mockito2, and Robolectric3 are used for unit testing Android and pure Java classes.

You may run build variant specific unit tests,

```
./gradlew test<build_variant>UnitTest
```

For example, to run unit tests for the MVP Debug build variant,

```
./gradlew testMvpDebugUnitTest
```
You may run all unit tests,

```
./gradlew test
```

#### Instrumentation Tests

Espresso is used for instrumentation tests.

You may run build variant specific instrumentation tests,

```
./gradlew connected<build_variant>AndroidTest
```

For example, to run instrumentation tests for the MVP Debug build variant,

```
./gradlew connectedMvpDebugAndroidTest
```

You may run all instrumentation tests,

```
./gradlew connectedAndroidTest
```

Note that only debug build types support Android instrumentations tests.

#### Jacoco Test Report

Code coverage is available through the use of the jacoco plugin.

You may generate build variant specific test reports,

```
.gradlew jacoco<build_variant>TestReport
```

For example, to test reports for the MVP Debug build variant,

```
./gradlew jacocoMvpDebugTestReport
```


## Static Analysis

The following static analysis checks are used to enforce high code quality and compliance to standard Java (and Android) 
code style and patterns:

- [Checkstyle](http://checkstyle.sourceforge.net/)
- [Findbugs](http://findbugs.sourceforge.net/)
- [PMD](https://pmd.github.io/)
- [Android lint](http://tools.android.com/tips/lint)

You can read more about these tools in this 
[blog post](http://vincentbrison.com/2014/07/19/how-to-improve-quality-and-syntax-of-your-android-code/).

The above will run checkstyle, findbugs, PMD, and lint for all build variants. 
You may run build variant specific static analysis checks,

```
./gradlew check<build_variant>Quality
```

For example, to run static analysis checks for the MVP Debug build variant,

```
./gradlew checkMvpDebugQuality
```


You may also run all static analysis checks for all build variants,

```
./gradlew checkQuality
```

You may run individual static analysis checks separately. 
To see the list of all gradle tasks,

```
./gradlew tasks
```


## Javadoc

Javadoc is available. To generate the Javadocs, 

```
./gradlew <build_variant>JavaDoc
```

For example, to generate Javadocs for MVP Debug build variant,

```
./gradlew mvpDebugJavaDoc
```


## Code Styling

Read *STYLE.md* 