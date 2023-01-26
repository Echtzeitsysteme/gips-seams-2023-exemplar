# GIPS SEAMS 2023 Exemplar

[**GIPS**](https://gips.dev) is an open-source framework for **G**raph-Based **I**LP **P**roblem **S**pecification.

This repository holds the exemplar of our **SEAMS 2023 Artifact** submission.


## Setup

There are two alternative ways to setup this exemplar.
We recommend the setup of a **GIPS** virtual machine (VM).

### Pre-Built VM template

Download our [pre-built VM template](https://github.com/Echtzeitsysteme/gips-seams-2023-artifact-vm) from GitHub. The repository contains the necessary steps (**tutorial**) to configure and run the exemplar withing the VM.

### Pre-Built Eclipse Application

Download our [pre-built Eclipse application](https://github.com/Echtzeitsysteme/gips-eclipse-build) with **GIPS** installed.
Further steps:
- Extract the ZIP archive.
- You need to install [GLPK](https://www.gnu.org/software/glpk/) on your system.
- Import all projects in Eclipse: `File`/`Import...`/`Team`/`Team Project Set` -> Click on `Next` -> Paste the URL `https://raw.githubusercontent.com/Echtzeitsysteme/gips-seams-2023-exemplar/main/projectSet.psf` into `URL` -> click `Finish`

You can now use the **tutorial** in the [VM template repo](https://github.com/Echtzeitsysteme/gips-seams-2023-artifact-vm) to proceed.


## Project Overview

| **Name**                                                           | **Description**  |
| ------------------------------------------------------------------ | ---------------- |
| `LectureStudioModel`                                               | Metamodel of the exemplar: [LectureStudioModel/model/LectureStudioModel.ecore](LectureStudioModel/model/LectureStudioModel.ecore) |
| `org.eclipse.examples.incrementalp2p.common`                       | Common classes to hold data and constant definitions |
| `org.eclipse.examples.incrementalp2p.distribution`                 | Control flow logic of the simulation |
| `org.eclipse.examples.incrementalp2p.gips.incrementaldistribution` | GIPS(L) exemplar implementation: [GIPSL file](org.gips.examples.incrementalp2p.gips.incrementaldistribution/src/gipsl/Model.gipsl) |
| `org.eclipse.examples.incrementalp2p.repository`                   | GT rules for the setup of the simulation environemnt |
| `org.eclipse.examples.incrementalp2p.run`                          | Simulation runner |
| `org.eclipse.examples.incrementalp2p.visualization`                | Visualization components |


## License

This project is licensed under the GNU General Public License v3.0 - see the [LICENSE](LICENSE) file for more details.
