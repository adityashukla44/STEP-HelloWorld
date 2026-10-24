# Hello World App

A command-line greeting program in Java, built up one use case at a time. Each use case was developed on its own feature branch and merged into `dev`.

## Usage

You need a JDK (8 or later).

```bash
javac HelloWorldApp.java
java HelloWorldApp
java HelloWorldApp Aditya Rahul
```

## Sample output

```
$ java HelloWorldApp
Hello, World!

$ java HelloWorldApp Aditya Rahul
Hello, Aditya, Rahul!
```

## Use cases

| UC | Branch | What it adds |
|----|--------|--------------|
| UC1 | `feature/UC1-display-hello` | Prints "Hello World" to the console |
| UC2 | `feature/UC2-display-name` | Greets a name passed as a command-line argument |
| UC3 | `feature/UC3-display-name-default` | Falls back to "World" when no name is given |
| UC4 | `feature/UC4-display-multiple-names` | Greets every name passed on the command line |
| UC5 | `feature/UC5-enhanced-for-loop` | Builds one greeting for all names with an enhanced `for` loop |
| UC6 | `feature/UC6-substring-method` | Uses `substring()` to remove the trailing comma |
| UC7 | `feature/UC7-string-join` | Replaces the loop with `String.join()` |

## Branching workflow

- `dev` is the integration branch and holds the latest version.
- Each `feature/UCn-*` branch contains exactly one use case and was merged into `dev` when complete.
- Commit messages follow the `feat(UCn): description` convention.

## Author

**Aditya Shukla** · [@adityashukla44](https://github.com/adityashukla44)
