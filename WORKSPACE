load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

RULES_JVM_EXTERNAL_TAG = "4.1"

RULES_JVM_EXTERNAL_SHA = "f36441aa876c4f6427bfb2d1f2d723b48e9d930b62662bf723ddfb8fc80f0140"

http_archive(
    name = "rules_jvm_external",
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    sha256 = RULES_JVM_EXTERNAL_SHA,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)

load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
    artifacts = [
        "io.dropwizard:dropwizard-core:2.0.25",
        "io.dropwizard:dropwizard-jersey:2.0.25",
        "io.dropwizard.metrics:metrics-core:4.2.4",

        "com.google.inject:guice:5.0.1",

        "javax.ws.rs:javax.ws.rs-api:2.1.1",
        "com.codahale.metrics:metrics-annotation:3.0.2",
        "com.codahale.metrics:metrics-healthchecks:3.0.2",

        "com.fasterxml.jackson.core:jackson-core:2.13.0",
        "com.fasterxml.jackson.core:jackson-annotations:2.13.0",
        "com.fasterxml.jackson.core:jackson-databind:2.13.0",
        "com.google.code.gson:gson:2.8.9",

        "org.hibernate.validator:hibernate-validator:6.2.0.Final",
        "javax.validation:validation-api:2.0.1.Final",

        "org.apache.commons:commons-lang3:3.9",

        "junit:junit:4.13.2",
    ],
    repositories = [
        "https://maven.google.com",
        "https://repo1.maven.org/maven2",
    ],
)
