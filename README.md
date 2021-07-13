# Towards the Characterization of Realistic Model Generators using Graph Neural Networks

The automatic generation of software models is an important element in many software and systems engineering scenarios such as software tool certification, validation of cyber-physical systems, or benchmarking graph databases. Several model generators are nowadays available, but the topic of whether they generate realistic models has been little studied. The state-of-the-art approach to check the *realistic* property in software models is to rely on simple comparisons using graph metrics and statistics. This generates a bottleneck due to the compression of all the information contained in the model into a small set of metrics. Furthermore, there is a lack of interpretation in these approaches since there are no hints of why the generated models are not realistic. Therefore, in this paper, we tackle the problem of assessing how realistic a generator is by mapping it to a classification problem in which a Graph Neural Network (GNN) will be trained to distinguish between the two sets of models (real and synthetic ones). Then, to assess how realistic a generator is we perform the Classifier Two-Sample Test (C2ST). Our approach allows for interpretation of the results by inspecting the attention layer of the GNN. We use our approach to assess four state-of-the-art model generators applied to three different domains. The results show that none of the generators can be considered realistic.

## Organization of the repository 📌

The repository contains the following folders and files:

* Folder [configurationFiles](https://github.com/Antolin1/TCRMG-GNN/tree/main/configurationFiles) - It contains for each model type the configuration files used in VIATRA, ALLOY and RandomEMF to generate the models.
* Folder [java](https://github.com/Antolin1/TCRMG-GNN/tree/main/java) - Metamodels used in the experiments together with the java code that converts a model into a graph.
* Folder [models](https://github.com/Antolin1/TCRMG-GNN/tree/main/models) - GNNs used to obtain the results presented in the paper.
* Folder [notebooks](https://github.com/Antolin1/TCRMG-GNN/tree/main/notebooks) - Notebooks for steps 2, 4 and 5 of the experimental procedure followed in the paper.
* Folder [python](https://github.com/Antolin1/TCRMG-GNN/tree/main/python) - Some utilities related to statistics, neural models and plotting in Python.
* Folder [realModels](https://github.com/Antolin1/TCRMG-GNN/tree/main/realModels) - Datasets of real models used in the experimentation.
* Folder [realGraphs](https://github.com/Antolin1/TCRMG-GNN/tree/main/realGraphs) - Graphs obtained from the datasets of the real models for each use-case. Inside the folder associated to an use-case, the division of the dataset of models into into R_I and R_II is already done. Therefore, a folder associated to an use-case contains three folder: *R1*, *R2* and *all* (folder that contains the full dataset i.e., set R in the paper).
* Folder [syntheticModels](https://github.com/Antolin1/TCRMG-GNN/tree/main/syntheticModels) - Generated models for each generator and each use-case.
* Folder [syntheticGraphs](https://github.com/Antolin1/TCRMG-GNN/tree/main/syntheticGraphs) - Graphs obtained from the generated graphs for each generator and each use-case.
* File [requirements.txt](https://github.com/Antolin1/TCRMG-GNN/blob/main/requirements.txt) - Python libraries needed.


## Experimental procedure 🚀

In the paper, the procedure followed is represented in this figure:

![alt text](https://i.ibb.co/ysDbyy9/experiment.jpg "Title")

These resources only support steps 1, 2, 4, and 5. If you want to perform step 3 (i.e., the generation of the set of synthetic graphs) you have to install each generator in your computer and execute them. The configuration files used are included in these resources.


### Step 1 📋

This step is performed by [this script](https://github.com/Antolin1/TCRMG-GNN/blob/main/python/traintestsplit.py). Following the notation of the paper, it divides the set R into R_I and R_II. **It has been already executed with a split size of 50%. Therefore, you do not have to execute it.** However, if you want to perform it, you have to do:

```
cd python
python traintestsplit.py model split_size
```

Where *model* can be Ecore, RDS or Yakindu and split\_size is a real number between 0 and 1 that indicates the size of R_II.

### Step 2 📋

This step is contained in [this folder](https://github.com/Antolin1/TCRMG-GNN/tree/main/notebooks):

* [Ecore's notebook](https://github.com/Antolin1/TCRMG-GNN/blob/main/notebooks/EstimatingParametersEcore.ipynb) - It contains the estimation of parameters in the different rules of RandomEMF and the KDE for the VIATRA, ALLOY and RANDOM. You can execute almost everything in the notebook less the generation of the configuration files (CFs) for VIATRA and ALLOY (CFs are already provided in [this folder](https://github.com/Antolin1/TCRMG-GNN/tree/main/configurationFiles/Ecore) and the generation of models in the case of RANDOM (the models are already provided in [this folder](https://github.com/Antolin1/TCRMG-GNN/tree/main/syntheticModels/RAND)).
* [Yakindu's notebook](https://github.com/Antolin1/TCRMG-GNN/blob/main/notebooks/EstimatingParametersYakindu.ipynb) - It contains the estimation of parameters in the different rules of RandomEMF and the KDE for the VIATRA, ALLOY and RANDOM. You can execute almost everthing in the notebook less the generation of the configuration files for VIATRA and ALLOY (CFs are already provided in [this folder](https://github.com/Antolin1/TCRMG-GNN/tree/main/configurationFiles/Yakindu)) and the generation of models in the case of RANDOM (the models are already provided in [this folder](https://github.com/Antolin1/TCRMG-GNN/tree/main/syntheticModels/RAND)).
* [RDS's notebook](https://github.com/Antolin1/TCRMG-GNN/blob/main/notebooks/EstimatingParametersRDS.ipynb) - It contains the estimation of parameters in the different rules of RandomEMF and the KDE for the VIATRA, ALLOY and RANDOM. You can execute almost everthing in the notebook less the generation of the configuration files for VIATRA and ALLOY (CFs are already provided in [this folder](https://github.com/Antolin1/TCRMG-GNN/tree/main/configurationFiles/RDS)) and the generation of models in the case of RANDOM (the models are already provided in [this folder](https://github.com/Antolin1/TCRMG-GNN/tree/main/syntheticModels/RAND)).

### Step 3 📋

This step cannot be done by using these resources and we provide all the models used to reach the results in the paper. In particular:
* Case of VIATRA and ALLOY - We provide the models and the config files used in the paper. For the generation process, we use the generator of the [repository](https://github.com/viatra/VIATRA-Generator).
* Case of RandomEMF - We provide the models and the config files used in the paper. For the generation process, we use the generator of the [repository](https://github.com/markus1978/RandomEMF).
* Case of RANDOM - We provide the models used in the paper. For the generation process, we use the generator of the [repository](https://github.com/atlanmod/mondo-atlzoo-benchmark/tree/master/fr.inria.atlanmod.instantiator).

### Steps 4 and 5 📋

These steps are in the following notebooks:

* Case of Ecore - This [notebook](https://github.com/Antolin1/TCRMG-GNN/blob/main/notebooks/Ecore-GNN.ipynb) is to reproduce the results presented in Table I of the paper. Whereas this [one](https://github.com/Antolin1/TCRMG-GNN/blob/main/notebooks/Ecore-GNN-Training.ipynb) is to train a new model, the results obtained should be similar to the previous notebook. Both notebooks are fully executable.
* Case of Yakindu - This [notebook](notebook.es) is to reproduce the results presented in Table I of the paper. Whereas this [one](notebook.es) is to train a new model, the results obtained should be similar to the previous notebook. Both notebooks are fully executable.
* Case of RDS - This [notebook](notebook.es) is to reproduce the results presented in Table I of the paper. Whereas this [one](notebook.es) is to train a new model, the results obtained should be similar to the previous notebook. Both notebooks are fully executable.


## Additional notes 🔧

The folder [java](https://github.com/Antolin1/TCRMG-GNN/tree/main/java) contains:

* Simplified metamodels of the three use cases: RDS, Ecore and Yakindu.
* The graph generation process. Given a model whose meta-model is known, the algorithm transforms it into a labeled graph. The graph is transformed into a json in order to be read by the following Python notebooks.

## Requirements 🛠️

Basics:

* Java
* Python
* Jupyter Notebook
* EMF

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

Installing in libraries in Python:
```
pip install -r requirements.txt
```