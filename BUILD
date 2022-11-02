load("@rules_java//java:defs.bzl", "java_library", "java_binary")

package(default_visibility = ["//visibility:public"])

java_library(
    name = "java-maven-lib",
    srcs = glob(["src/main/java/com/example/gson/**/*.java"]),
    resources = glob(["src/main/resources/**"]),
    deps = [
      "@maven//:com_google_code_gson_gson",
    ],
)

java_binary(
  name = "gson-demo",
  main_class = "com.example.gson.App",
  runtime_deps = [":java-maven-lib"],
)

