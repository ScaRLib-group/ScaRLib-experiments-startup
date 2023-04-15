# ScaRLib-experiments-startup

This repository is a startup template for [ScaRLib](https://github.com/ScaRLib-group/ScaRLib), it shows how to organize a new project and how to manage dependencies.

## Project structure

All the files needed to describe the experiment are in the `src/main/scala/experiment` folder. As described in ScaRLib, to run a learning the user must define:

- The action space
- The reward function
- The state
- The neural network used to approximate the Q-function
- The scafi logic
- The alchemist specification

Finally, all these elements must be merged to create the learning system in the file `<experiment-name>.scala`

## Preliminaries

## How to use

Once a new repository has been created from this template, the following steps need to be taken: 

- The user must define his own custom components that describe the task on which he want to perform learning.
- The user must define a gradle task to run the learning and the evaluation. 
    Some template tasks are provided in the file `build.gradle.kts`