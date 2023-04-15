plugins {
    id("java")
    scala
}

group = "io.github.davidedomini"
version = "1.0.0"

repositories {
    mavenCentral()
}

scala {
    zincVersion.set("1.6.1")
}


sourceSets {
    main {
        scala {
            setSrcDirs(listOf("src/main/scala"))
        }
    }
    test {
        scala {
            setSrcDirs(listOf("src/test/scala"))
        }
    }
}

dependencies {
    implementation("org.scala-lang:scala3-library_3:3.2.2")
    implementation("io.github.davidedomini:scarlib-core:1.6.4")
    implementation("io.github.davidedomini:dsl-core:1.6.4")
    implementation("io.github.davidedomini:alchemist-scafi:1.6.4")
}


tasks.register<JavaExec>("simpleExperimentTraining") {
    group = "ScaRLib Training"
    mainClass.set("experiments.training.SimpleExperimentTraining")
    jvmArgs("-Dsun.java2d.opengl=false")
    classpath = sourceSets["main"].runtimeClasspath
}

tasks.register<JavaExec>("simpleExperimentTrainingGui") {
    group = "ScaRLib Training"
    mainClass.set("experiments.training.SimpleExperimentTraining")
    jvmArgs("-Dsun.java2d.opengl=false")
    args = listOf("20")
    classpath = sourceSets["main"].runtimeClasspath
}

tasks.register<JavaExec>("simpleExperimentEval") {
    group = "ScaRLib Training"
    mainClass.set("experiments.evaluation.SimpleExperimentEval")
    jvmArgs("-Dsun.java2d.opengl=false")
    classpath = sourceSets["main"].runtimeClasspath
}

tasks.register<JavaExec>("simpleExperimentEvalGui") {
    group = "ScaRLib Training"
    mainClass.set("experiments.evaluation.SimpleExperimentEval")
    jvmArgs("-Dsun.java2d.opengl=false")
    args = listOf("20")
    classpath = sourceSets["main"].runtimeClasspath
}
