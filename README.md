
[![DOI](https://zenodo.org/badge/385620681.svg)](https://zenodo.org/badge/latestdoi/385620681)


# Towards the Characterization of Realistic Model Generators using Graph Neural Networks

This artifact corresponds to the paper: [**Towards the Characterization of Realistic Model Generators using Graph Neural Networks**](https://github.com/Antolin1/TCRMG-GNN/blob/main/paperArtifactVersion.pdf).

**Abstract:** The automatic generation of software models is an important element in many software and systems engineering scenarios such as software tool certification, validation of cyber-physical systems, or benchmarking graph databases. Several model generators are nowadays available, but the topic of whether they generate realistic models has been little studied. The state-of-the-art approach to check the *realistic* property in software models is to rely on simple comparisons using graph metrics and statistics. This generates a bottleneck due to the compression of all the information contained in the model into a small set of metrics. Furthermore, there is a lack of interpretation in these approaches since there are no hints of why the generated models are not realistic. Therefore, in this paper, we tackle the problem of assessing how realistic a generator is by mapping it to a classification problem in which a Graph Neural Network (GNN) will be trained to distinguish between the two sets of models (real and synthetic ones). Then, to assess how realistic a generator is we perform the Classifier Two-Sample Test (C2ST). Our approach allows for interpretation of the results by inspecting the attention layer of the GNN. We use our approach to assess four state-of-the-art model generators applied to three different domains. The results show that none of the generators can be considered realistic.

## Organization of the repository 📌

The repository contains the following folders and files:

* Folder [TrainTestValSplits](https://github.com/Antolin1/TCRMG-GNN/tree/main/TrainTestValSplits) - It contains the splits train/test/val done in the paper.
* Folder [Vocabularies](https://github.com/Antolin1/TCRMG-GNN/tree/main/Vocabularies) - It contains the vocabularies needed to ensure reproducibility.
* Folder [configurationFiles](https://github.com/Antolin1/TCRMG-GNN/tree/main/configurationFiles) - It contains for each model type the configuration files used in VIATRA, ALLOY and RandomEMF to generate the models.
* Folder [java](https://github.com/Antolin1/TCRMG-GNN/tree/main/java) - Metamodels used in the experiments together with the java code that converts a model into a graph.
* Folder [models](https://github.com/Antolin1/TCRMG-GNN/tree/main/models) - GNNs used to obtain the results presented in the paper.
* Folder [notebooks](https://github.com/Antolin1/TCRMG-GNN/tree/main/notebooks) - Notebooks for steps 2, 4 and 5 of the experimental procedure followed in the paper.
* Folder [python](https://github.com/Antolin1/TCRMG-GNN/tree/main/python) - Some utilities related to statistics, neural models and plotting in Python.
* Folder [realModels](https://github.com/Antolin1/TCRMG-GNN/tree/main/realModels) - It contains the datasets of real models used in the experimentation.
* Folder [realGraphs](https://github.com/Antolin1/TCRMG-GNN/tree/main/realGraphs) - It contains the graphs obtained from the datasets of the real models. For each use-case there is a folder. Inside it, there are three folders that correspond to the the full dataset and its splits R_I and R_II.
* Folder [syntheticModels](https://github.com/Antolin1/TCRMG-GNN/tree/main/syntheticModels) - It contains the generated models for each generator and each use-case.
* Folder [syntheticGraphs](https://github.com/Antolin1/TCRMG-GNN/tree/main/syntheticGraphs) - It contains the graphs obtained from the generated models for each generator and each use-case.
* File [requirements.txt](https://github.com/Antolin1/TCRMG-GNN/blob/main/requirements.txt) - Python libraries.

## Requirements 🛠️

Basics:

* Java (11.0.11 or greater)
* Python 3.8.X
* Jupyter Notebook (6.0.3 or greater)
* EMF (2.9.X)

Graphs and neural networks in Python:

* NetworkX
* PyTorch
* PyTorch Geometric
* PyTorch Scatter

Statistics, Machine Learning and Plotting in Python:

* Scipy
* Statsmodels
* Scikit-learn
* Matplotlib
* NumPy
* Graphviz

Installing libraries in Python (torch and similar have to be installed separately):
```
pip install torch
pip install torch_scatter
pip install torch-scatter torch-sparse torch-cluster torch-spline-conv torch-geometric -f https://pytorch-geometric.com/whl/torch-1.9.0+cpu.html
pip install -r requirements.txt
```

## Experimental procedure 🚀

In the paper, the procedure followed is represented in this figure:

![alt text](https://i.ibb.co/ysDbyy9/experiment.jpg "Title")

These resources only support steps 1, 2, 4, and 5. If you want to perform step 3 (i.e., the generation of the set of synthetic graphs) you have to install each generator in your computer and execute them. The configuration files used are included in these resources.


### Step 1 📋

This step is performed by [this script](https://github.com/Antolin1/TCRMG-GNN/blob/main/python/traintestsplit.py). Following the notation of the paper, it divides the set R into R_I and R_II. **It has been already executed with a split size of 50%. Therefore, you do not have to execute it and you can go to Step 2.** If you want to execute it, you have to remove the folders:

* [Ecore-R1](https://github.com/Antolin1/TCRMG-GNN/tree/main/realGraphs/Ecore/R1)
* [Ecore-R2](https://github.com/Antolin1/TCRMG-GNN/tree/main/realGraphs/Ecore/R2)
* [Yakindu-R1](https://github.com/Antolin1/TCRMG-GNN/tree/main/realGraphs/Yakindu/R1)
* [Yakindu-R2](https://github.com/Antolin1/TCRMG-GNN/tree/main/realGraphs/Yakindu/R2)
* [RDS-R1](https://github.com/Antolin1/TCRMG-GNN/tree/main/realGraphs/RDS/R1)
* [RDS-R2](https://github.com/Antolin1/TCRMG-GNN/tree/main/realGraphs/RDS/R2)

and execute:
```
cd python
python traintestsplit.py model split_size
```

Where *model* can be Ecore, RDS or Yakindu and *split\_size* is a real number between 0 and 1 that indicates the size of R_II.

### Step 2 📋

This step is contained in [this folder](https://github.com/Antolin1/TCRMG-GNN/tree/main/notebooks) and consists on three notebooks ([running the Jupyter Notebook](https://jupyter-notebook-beginner-guide.readthedocs.io/en/latest/execute.html)):

* [Ecore's notebook](https://github.com/Antolin1/TCRMG-GNN/blob/main/notebooks/EstimatingParametersEcore.ipynb) - It contains the estimation of parameters in the different rules of RandomEMF and the KDE for the VIATRA, ALLOY and RANDOM. You can execute almost everything in the notebook less the generation of the configuration files (CFs) for VIATRA and ALLOY (CFs are already provided in [this folder](https://github.com/Antolin1/TCRMG-GNN/tree/main/configurationFiles/Ecore)) and the generation of models in the case of RANDOM (the models are already provided in [this folder](https://github.com/Antolin1/TCRMG-GNN/tree/main/syntheticModels/RAND)).
* [Yakindu's notebook](https://github.com/Antolin1/TCRMG-GNN/blob/main/notebooks/EstimatingParametersYakindu.ipynb) - It contains the estimation of parameters in the different rules of RandomEMF and the KDE for the VIATRA, ALLOY and RANDOM. You can execute almost everthing in the notebook less the generation of the configuration files for VIATRA and ALLOY (CFs are already provided in [this folder](https://github.com/Antolin1/TCRMG-GNN/tree/main/configurationFiles/Yakindu)) and the generation of models in the case of RANDOM (the models are already provided in [this folder](https://github.com/Antolin1/TCRMG-GNN/tree/main/syntheticModels/RAND)).
* [RDS's notebook](https://github.com/Antolin1/TCRMG-GNN/blob/main/notebooks/EstimatingParametersRDS.ipynb) - It contains the estimation of parameters in the different rules of RandomEMF and the KDE for the VIATRA, ALLOY and RANDOM. You can execute almost everthing in the notebook less the generation of the configuration files for VIATRA and ALLOY (CFs are already provided in [this folder](https://github.com/Antolin1/TCRMG-GNN/tree/main/configurationFiles/RDS)) and the generation of models in the case of RANDOM (the models are already provided in [this folder](https://github.com/Antolin1/TCRMG-GNN/tree/main/syntheticModels/RAND)).

### Step 3 📋

This step cannot be done by using these resources and we provide all the models used to reach the results in the paper. In particular:
* Case of VIATRA and ALLOY - We provide the models and the config files used in the paper. For the generation process, we use the generator of the [repository](https://github.com/viatra/VIATRA-Generator).
* Case of RandomEMF - We provide the models and the config files used in the paper. For the generation process, we use the generator of the [repository](https://github.com/markus1978/RandomEMF).
* Case of RANDOM - We provide the models used in the paper. For the generation process, we use the generator of the [repository](https://github.com/atlanmod/mondo-atlzoo-benchmark/tree/master/fr.inria.atlanmod.instantiator). At the end of the three notebooks of the previous step, there is a code snippet of how we generate the models using this generator. 

For example, in the case of [RandomEMF](https://github.com/markus1978/RandomEMF) is an Eclipse Plugin. Once installed, you have to:

* Run a new Eclipse instance.
* Generate a new plugin project and add to the manifest the dependencies that correspond to the meta-model.
* Copy the config file (of extension .rcore) that contain the rules to the main package.
* Generate in the same package a java script that generates the model using the generator.

![alt text](https://i.ibb.co/XVXFpsQ/example22.png "Title")


### Steps 4 and 5 📋

These steps are in the following notebooks ([running the Jupyter Notebook](https://jupyter-notebook-beginner-guide.readthedocs.io/en/latest/execute.html)):

* If you want to obtain the same results as the paper, execute this [notebook](https://github.com/Antolin1/TCRMG-GNN/blob/main/notebooks/Paper-GNN.ipynb). You can change the generator and the use-case by changing the variables `generator` and `modelType` respectively.

* If you want to train the GNNs again, execute this [notebook](https://github.com/Antolin1/TCRMG-GNN/blob/main/notebooks/NewTraining-GNN.ipynb). You can change the generator and the use-case by changing the variables `generator` and `modelType` respectively. It is important to note that C2ST is sensitive to the split and the trained model. Therefore the results may differ with respect to the paper. However, RandomEMF should obtain the best results and RANDOM should obtain the worst results.

