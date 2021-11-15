load("@rules_java//java:defs.bzl", "java_binary", "java_library", "java_test")

package(default_visibility = ["//visibility:public"])


java_binary(
    name = "dropwizard-demo",
    main_class = "com.example.myproject.Application",
    runtime_deps = [":dropwizard-lib"],
)

java_library(
    name = "dropwizard-lib",
    srcs = glob([
        "src/main/java/com/example/myproject/**/*.java",
    ]),
    deps = [
        "@maven//:io_dropwizard_dropwizard_core",
        "@maven//:io_dropwizard_dropwizard_jersey",
        "@maven//:io_dropwizard_metrics_metrics_core",

        "@maven//:com_google_inject_guice",

        "@maven//:javax_ws_rs_javax_ws_rs_api",
        "@maven//:com_codahale_metrics_metrics_annotation",
        "@maven//:com_codahale_metrics_metrics_healthchecks",

        "@maven//:com_fasterxml_jackson_core_jackson_core",
        "@maven//:com_fasterxml_jackson_core_jackson_annotations",
        "@maven//:com_fasterxml_jackson_core_jackson_databind",
        "@maven//:com_google_code_gson_gson",

        "@maven//:org_hibernate_validator_hibernate_validator",
        "@maven//:javax_validation_validation_api",

        "@maven//:org_apache_commons_commons_lang3",
    ]
)

java_test(
    name = "tests",
    srcs = glob([
        "src/test/java/com/example/myproject/**/*.java"
    ]),
    test_class = "com.example.myproject.ApplicationTest",
    deps = [
        ":dropwizard-lib",
        "@maven//:junit_junit",
    ],
)