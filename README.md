<!-- Source: Best-README-Template BLANK_README (Unlicense) — https://github.com/othneildrew/Best-README-Template -->
<a id="readme-top"></a>

# Class2021_2022_2_SeniorJava_course

A personal collection of Java exercises from a 2021-2022 second-semester senior Java class, organized by session date and covering console programs, recursion, exception handling, and Swing desktop GUIs.

**English** · [简体中文](README.zh-CN.md)

[![CI](https://github.com/anyingiit/Class2021_2022_2_SeniorJava_course/actions/workflows/ci.yml/badge.svg)](https://github.com/anyingiit/Class2021_2022_2_SeniorJava_course/actions/workflows/ci.yml)
[![License](https://img.shields.io/github/license/anyingiit/Class2021_2022_2_SeniorJava_course)](LICENSE)

[Report a bug](https://github.com/anyingiit/Class2021_2022_2_SeniorJava_course/issues/new?template=bug_report.yml) · [Request a feature](https://github.com/anyingiit/Class2021_2022_2_SeniorJava_course/issues/new?template=feature_request.yml)

<details>
  <summary>Table of Contents</summary>
  <ol>
    <li><a href="#about-the-project">About The Project</a></li>
    <li><a href="#getting-started">Getting Started</a></li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>

## About The Project

This repository holds the exercises assigned week by week in a second-semester senior Java course, starting from a bare `HelloPackage/HelloWorld.java` and moving through loops and recursion (`JWork_22_3_18/Work6.java`'s factorial, `JWork_22_3_25/Work1.java`'s prime-number sieve), exception handling (`JWork_22_6_1/Work4.java`), and small Swing desktop programs with layouts, forms, and keyboard/mouse listeners (`JWork_22_6_11/Work1.java`, `JWork_22_6_12/Work5.java`). Each dated folder under `src/` (`JWork_22_3_5` through `JWork_22_6_12`) also carries the corresponding assignment's own Markdown write-up and any screenshots it produced, so the write-up and the code that answers it sit side by side.

See the [open issues](https://github.com/anyingiit/Class2021_2022_2_SeniorJava_course/issues) for planned features and known issues.

## Getting Started

### Prerequisites

- A Java Development Kit (JDK) able to compile and run desktop Swing applications — none of the exercises use language features newer than that, so any actively supported JDK works.
- No build tool or dependency manager: the repository ships plain `.java` sources under `src/` and no `pom.xml`, `build.gradle`, or similar manifest.

### Installation

Clone the repository, then compile every exercise into one output directory with `javac` — there is no build manifest to run instead:

```sh
git clone https://github.com/anyingiit/Class2021_2022_2_SeniorJava_course.git
cd Class2021_2022_2_SeniorJava_course
javac -d out $(find src -name "*.java")
```

## Usage

Run any single exercise by pointing `java` at its compiled, fully qualified class name — for example, the "Hello World" exercise:

```sh
java -cp out HelloPackage.HelloWorld
```

Swap in any other package and class name (for example `JWork_22_6_12.Work5`) to run a different exercise; the Swing-based ones need a display to open their window.

## Contributing

Contributions are welcome. Read [CONTRIBUTING.md](CONTRIBUTING.md) for how to open an issue or a pull request, and [CODE_OF_CONDUCT.md](CODE_OF_CONDUCT.md) for the standards expected of everyone taking part.

Please do not report security issues in public issues or pull requests. [SECURITY.md](SECURITY.md) explains how to report them privately.

## License

Distributed under the MIT License. See [LICENSE](LICENSE) for details.

## Contact

Project link: [https://github.com/anyingiit/Class2021_2022_2_SeniorJava_course](https://github.com/anyingiit/Class2021_2022_2_SeniorJava_course)

<p align="right">(<a href="#readme-top">back to top</a>)</p>
