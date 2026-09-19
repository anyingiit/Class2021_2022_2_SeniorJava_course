[English](README.md) · **简体中文**

> 英文版是规范版本。本页与 [README.md](README.md) 不一致时，以英文版为准。

<!-- translation-of: README.md sha256:c551157522c52bbe -->

<!-- Source: Best-README-Template BLANK_README (Unlicense) — https://github.com/othneildrew/Best-README-Template -->
<a id="readme-top"></a>

# Class2021_2022_2_SeniorJava_course

个人整理的 Java 课程作业集合，来自 2021-2022 学年第二学期的高年级 Java 课程，按上课日期分组，涵盖控制台程序、递归、异常处理和 Swing 桌面图形界面。

[![CI](https://github.com/anyingiit/Class2021_2022_2_SeniorJava_course/actions/workflows/ci.yml/badge.svg)](https://github.com/anyingiit/Class2021_2022_2_SeniorJava_course/actions/workflows/ci.yml)
[![License](https://img.shields.io/github/license/anyingiit/Class2021_2022_2_SeniorJava_course)](LICENSE)

[报告问题](https://github.com/anyingiit/Class2021_2022_2_SeniorJava_course/issues/new?template=bug_report.yml) · [提出需求](https://github.com/anyingiit/Class2021_2022_2_SeniorJava_course/issues/new?template=feature_request.yml)

<details>
  <summary>目录</summary>
  <ol>
    <li><a href="#about-the-project">关于本项目</a></li>
    <li><a href="#getting-started">开始使用</a></li>
    <li><a href="#usage">用法</a></li>
    <li><a href="#contributing">参与贡献</a></li>
    <li><a href="#license">许可证</a></li>
    <li><a href="#contact">联系方式</a></li>
  </ol>
</details>

## 关于本项目

本仓库保存了一门高年级 Java 课程第二学期每周布置的作业，从最简单的 `HelloPackage/HelloWorld.java` 开始，逐步过渡到循环与递归（`JWork_22_3_18/Work6.java` 的阶乘、`JWork_22_3_25/Work1.java` 的素数筛法）、异常处理（`JWork_22_6_1/Work4.java`），以及带布局、表单和键盘/鼠标监听器的 Swing 桌面小程序（`JWork_22_6_11/Work1.java`、`JWork_22_6_12/Work5.java`）。`src/` 下每个按日期命名的文件夹（从 `JWork_22_3_5` 到 `JWork_22_6_12`）还附带了对应作业本身的 Markdown 说明和产生的截图，说明文档与解答代码放在一起。

计划中的功能与已知问题，见 [open issues](https://github.com/anyingiit/Class2021_2022_2_SeniorJava_course/issues)。

## 开始使用

### 环境要求

- 一个能够编译并运行桌面 Swing 应用的 Java 开发工具包（JDK）——所有作业都没有用到比这更新的语言特性，因此任何仍在维护的 JDK 版本都可以使用。
- 不需要任何构建工具或依赖管理器：仓库在 `src/` 下只有纯 `.java` 源文件，没有 `pom.xml`、`build.gradle` 或类似的清单文件。

### 安装

克隆仓库，然后用 `javac` 把所有作业一次性编译到同一个输出目录——这里没有构建清单可以代替这一步：

```sh
git clone https://github.com/anyingiit/Class2021_2022_2_SeniorJava_course.git
cd Class2021_2022_2_SeniorJava_course
javac -d out $(find src -name "*.java")
```

## 用法

编译完成后，通过完整的类名把 `java` 指向想运行的那一份作业即可——例如运行 "Hello World" 这一份：

```sh
java -cp out HelloPackage.HelloWorld
```

把包名和类名换成其他作业（例如 `JWork_22_6_12.Work5`）就能运行别的练习；基于 Swing 的那些需要有图形界面才能弹出窗口。

## 参与贡献

欢迎参与。[CONTRIBUTING.md](CONTRIBUTING.md) 说明如何提交 issue 或 pull request，[CODE_OF_CONDUCT.md](CODE_OF_CONDUCT.md) 说明对所有参与者的行为要求。

请不要在公开的 issue 或 pull request 中报告安全问题。[SECURITY.md](SECURITY.md) 说明了私下报告的方式。

## 许可证

以 MIT 许可证分发。详见 [LICENSE](LICENSE)。

## 联系方式

项目地址：[https://github.com/anyingiit/Class2021_2022_2_SeniorJava_course](https://github.com/anyingiit/Class2021_2022_2_SeniorJava_course)

<p align="right">(<a href="#readme-top">back to top</a>)</p>
