# Experimental procedure 🚀

In the paper, the procedure followed is represented in this figure:

![alt text](https://i.ibb.co/ysDbyy9/experiment.jpg "Title")

These resources only support steps 1, 2, 4, and 5. If you want to perform step 3 (i.e., the generation of the set of synthetic graphs) you have to install each generator in your computer and execute them. The configuration files used are included in these resources.


## Step 1 📋

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

## Step 2 📋

This step is contained in [this folder](https://github.com/Antolin1/TCRMG-GNN/tree/main/notebooks) and consists on three notebooks ([running the Jupyter Notebook](https://jupyter-notebook-beginner-guide.readthedocs.io/en/latest/execute.html)):

* [Ecore's notebook](https://github.com/Antolin1/TCRMG-GNN/blob/main/notebooks/EstimatingParametersEcore.ipynb) - It contains the estimation of parameters in the different rules of RandomEMF and the KDE for the VIATRA, ALLOY and RANDOM. You can execute almost everything in the notebook less the generation of the configuration files (CFs) for VIATRA and ALLOY (CFs are already provided in [this folder](https://github.com/Antolin1/TCRMG-GNN/tree/main/configurationFiles/Ecore)) and the generation of models in the case of RANDOM (the models are already provided in [this folder](https://github.com/Antolin1/TCRMG-GNN/tree/main/syntheticModels/RAND)).
* [Yakindu's notebook](https://github.com/Antolin1/TCRMG-GNN/blob/main/notebooks/EstimatingParametersYakindu.ipynb) - It contains the estimation of parameters in the different rules of RandomEMF and the KDE for the VIATRA, ALLOY and RANDOM. You can execute almost everthing in the notebook less the generation of the configuration files for VIATRA and ALLOY (CFs are already provided in [this folder](https://github.com/Antolin1/TCRMG-GNN/tree/main/configurationFiles/Yakindu)) and the generation of models in the case of RANDOM (the models are already provided in [this folder](https://github.com/Antolin1/TCRMG-GNN/tree/main/syntheticModels/RAND)).
* [RDS's notebook](https://github.com/Antolin1/TCRMG-GNN/blob/main/notebooks/EstimatingParametersRDS.ipynb) - It contains the estimation of parameters in the different rules of RandomEMF and the KDE for the VIATRA, ALLOY and RANDOM. You can execute almost everthing in the notebook less the generation of the configuration files for VIATRA and ALLOY (CFs are already provided in [this folder](https://github.com/Antolin1/TCRMG-GNN/tree/main/configurationFiles/RDS)) and the generation of models in the case of RANDOM (the models are already provided in [this folder](https://github.com/Antolin1/TCRMG-GNN/tree/main/syntheticModels/RAND)).

## Step 3 📋

This step cannot be done by using these resources and we provide all the models used to reach the results in the paper. In particular:
* Case of VIATRA and ALLOY - We provide the models and the config files used in the paper. For the generation process, we use the generator of the [repository](https://github.com/viatra/VIATRA-Generator).
* Case of RandomEMF - We provide the models and the config files used in the paper. For the generation process, we use the generator of the [repository](https://github.com/markus1978/RandomEMF).
* Case of RANDOM - We provide the models used in the paper. For the generation process, we use the generator of the [repository](https://github.com/atlanmod/mondo-atlzoo-benchmark/tree/master/fr.inria.atlanmod.instantiator).

## Steps 4 and 5 📋

These steps are in the following notebooks ([running the Jupyter Notebook](https://jupyter-notebook-beginner-guide.readthedocs.io/en/latest/execute.html)):

* If you want to obtain the same results as the paper, execute this [notebook](https://github.com/Antolin1/TCRMG-GNN/blob/main/notebooks/Paper-GNN.ipynb). You can change the generator and the use-case by changing the variables `generator` and `modelType` respectively.

* If you want to train the GNNs again, execute this [notebook](https://github.com/Antolin1/TCRMG-GNN/blob/main/notebooks/NewTraining-GNN.ipynb). You can change the generator and the use-case by changing the variables `generator` and `modelType` respectively. It is important to note that C2ST is sensitive to the split and the trained model. Therefore the results may differ a bit with respect to the paper. However, RandomEMF should obtain the best results in all use-cases.

