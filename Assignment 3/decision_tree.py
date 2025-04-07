
# -------------------------------------------------------------------------
# AUTHOR: Roberto Reyes
# FILENAME: decision_tree.py
# SPECIFICATION: Train/test decision trees on different datasets and evaluate accuracy
# FOR: CS 5990 (Advanced Data Mining) - Assignment #3
# TIME SPENT: 4 hours
# -----------------------------------------------------------*/

#IMPORTANT NOTE: YOU HAVE TO WORK WITH THE PYTHON LIBRARIES numpy AND pandas to complete this code.

from sklearn import tree
import matplotlib.pyplot as plt
import numpy as np
import pandas as pd

dataSets = ['cheat_training_1.csv', 'cheat_training_2.csv', 'cheat_training_3.csv']

for ds in dataSets:
    avg_accuracy = 0

    for i in range(10):
        df = pd.read_csv(ds, sep=',', header=0)
        df = df.drop(columns='Tid', errors='ignore')
        df = pd.get_dummies(df, columns=['Marital Status'])
        df['Taxable Income'] = df['Taxable Income'].apply(lambda x: float(x.replace('$', '').replace(',', '').replace('k', '000').strip().lower()))
        df['Cheat'] = df['Cheat'].map({'Yes': 1, 'No': 2})
        X = df.drop(columns='Cheat').values
        Y = df['Cheat'].values
        clf = tree.DecisionTreeClassifier(criterion='gini')
        clf = clf.fit(X, Y)
        df_test = pd.read_csv('cheat_test.csv', sep=',', header=0)
        df_test = df_test.drop(columns='ID')
        df_test = pd.get_dummies(df_test, columns=['Marital Status'])
        for col in ['Marital Status_Divorced', 'Marital Status_Married', 'Marital Status_Single']:
            if col not in df_test.columns:
                df_test[col] = 0  

        test_columns = df.drop(columns='Cheat').columns
        df_test = df_test[test_columns]

        df['Taxable Income'] = float(df['Taxable Income']) * 1000

        true_labels = df_test['Cheat'].map({'Yes': 1, 'No': 2}).values
        X_test = df_test.drop(columns='Cheat').values

        correct = 0
        for idx, row in enumerate(X_test):
            prediction = clf.predict([row])[0]
            if prediction == true_labels[idx]:
                correct += 1

        accuracy = correct / len(true_labels)
        avg_accuracy += accuracy

    avg_accuracy /= 10
    print(f'Final accuracy when training on {ds}: {round(avg_accuracy, 2)}')
