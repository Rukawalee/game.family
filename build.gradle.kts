plugins {
    id("org.springframework.boot") version "3.3.0"
    id("io.spring.dependency-management") version "1.1.5"
    id("org.graalvm.buildtools.native") version "0.10.2"
    kotlin("jvm") version "1.9.24"
    kotlin("plugin.spring") version "1.9.24"
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

allprojects {
    group = "com.rukawa.game"
    version = "0.0.1-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation(project(":game-werewolf"))
    implementation(project(":game-common"))
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

subprojects {
    apply(plugin="org.springframework.boot")
    apply(plugin="io.spring.dependency-management")
    apply(plugin="org.graalvm.buildtools.native")
    apply(plugin="org.jetbrains.kotlin.jvm")
    apply(plugin="org.jetbrains.kotlin.plugin.spring")

    dependencies {
        implementation("org.springframework.boot:spring-boot-starter")
        implementation("org.jetbrains.kotlin:kotlin-reflect")
        compileOnly("org.projectlombok:lombok")
        annotationProcessor("org.projectlombok:lombok")
        testImplementation("org.springframework.boot:spring-boot-starter-test")
        testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
        testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    }
}