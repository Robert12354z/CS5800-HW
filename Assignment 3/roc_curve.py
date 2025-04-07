# -------------------------------------------------------------------------
# AUTHOR: Roberto Reyes
# FILENAME: roc_curve.py
# SPECIFICATION: Creates ROC Curve Graph
# FOR: CS 5990 (Advanced Data Mining) - Assignment #3
# TIME SPENT: 3 hours
# -----------------------------------------------------------*/

from sklearn import tree
from sklearn.model_selection import train_test_split
from sklearn.metrics import roc_curve
from sklearn.metrics import roc_auc_score
from matplotlib import pyplot
import numpy as np
import pandas as pd

try:
    df = pd.read_csv('cheat_data.csv', sep=',', header=0)
    print("Columns in the dataset:", df.columns.tolist())
    print("\nFirst few rows of data:")
    print(df.head())
    
    expected_columns = ['Refund', 'Marital Status', 'Taxable Income', 'Cheat']
    if not all(col in df.columns for col in expected_columns):
        raise ValueError(f"CSV file doesn't have the expected columns. Expected: {expected_columns}")
    
    data_training = np.array(df.values) 
    print("\nTraining data shape:", data_training.shape)
except Exception as e:
    print("Error reading or processing the CSV file:", str(e))
    exit()


X = []
for row in data_training:
    try:
        refund = 1 if row[0] == 'Yes' else 0
        marital_status = row[1]
        single = 1 if marital_status == 'Single' else 0
        divorced = 1 if marital_status == 'Divorced' else 0
        married = 1 if marital_status == 'Married' else 0
        
        taxable_income = row[2]
        if isinstance(taxable_income, str):
            if taxable_income.endswith('k'):
                taxable_income = float(taxable_income[:-1]) * 1000
            else:
                taxable_income = float(taxable_income)
        
        X.append([refund, single, divorced, married, taxable_income])
    except Exception as e:
        print(f"Error processing row {row}:", str(e))
        continue

y = []
for row in data_training:
    try:
        cheat_status = row[3] 
        y.append(1 if cheat_status == 'Yes' else 0)
    except Exception as e:
        print(f"Error processing class label in row {row}:", str(e))
        continue

if len(X) == 0 or len(y) == 0:
    print("No valid data found after processing. Please check your input file.")
    exit()

trainX, testX, trainy, testy = train_test_split(X, y, test_size=0.3, random_state=42)

ns_probs = [0 for _ in range(len(testy))]

clf = tree.DecisionTreeClassifier(criterion='entropy', max_depth=2)
clf = clf.fit(trainX, trainy)

dt_probs = clf.predict_proba(testX)

dt_probs = dt_probs[:, 1]

ns_auc = roc_auc_score(testy, ns_probs)
dt_auc = roc_auc_score(testy, dt_probs)

print('\nNo Skill: ROC AUC=%.3f' % (ns_auc))
print('Decision Tree: ROC AUC=%.3f' % (dt_auc))

ns_fpr, ns_tpr, _ = roc_curve(testy, ns_probs)
dt_fpr, dt_tpr, _ = roc_curve(testy, dt_probs)

pyplot.plot(ns_fpr, ns_tpr, linestyle='--', label='No Skill')
pyplot.plot(dt_fpr, dt_tpr, marker='.', label='Decision Tree')

pyplot.xlabel('False Positive Rate')
pyplot.ylabel('True Positive Rate')

pyplot.legend()

pyplot.show()
