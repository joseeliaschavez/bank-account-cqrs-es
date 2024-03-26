# Bank Account App: CQRS and Event Sourcing

![Github Actions Status](https://github.com/joseeliaschavez/bank-account-command-api/actions/workflows/gradle.yml/badge.svg?branch=develop&event=push)

An example Gradle multi-project showcasing the CQRS and Event Sourcing architecture patterns.

## Port Configuration

| Service     | Port  | Docker Port |
|-------------|-------|-------------|
| command-api | 8081  | -           |
| query-api   | 8082  | -           |
| Kafka       | 9092  | 9092        |
| Mongo       | 27017 | 27017       |
| MExpress    | 8083  | 8081        |
| MySQL       | 3306  | 3306        |
| Adminer     | 8084  | 8080        |

## Gradle Notes

1. In `settings.gradle`, the `include` method is used to include the subprojects. This is the recommended way to include subprojects in a multi-project build. Using the `includeBuild` method is for composite builds.
2. The use of `allprojects` and `subprojects` is now discouraged. Instead, define plugins and dependencies in the subprojects themselves.

## Resources

- Gradle
  - [Multi-Project Build Basics](https://docs.gradle.org/current/userguide/intro_multi_project_builds.html)
  - [Multi-Project Build Tutorial](https://docs.gradle.org/current/userguide/partr3_multi_project_builds.html)
  - [Composite Builds](https://docs.gradle.org/current/userguide/composite_builds.html)
