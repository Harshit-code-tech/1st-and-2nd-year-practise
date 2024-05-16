#!/bin/bash

echo "Enter marks for 5 subjects:"
read -p "Subject 1: " subject1
read -p "Subject 2: " subject2
read -p "Subject 3: " subject3
read -p "Subject 4: " subject4
read -p "Subject 5: " subject5

total=$((subject1 + subject2 + subject3 + subject4 + subject5))
average=$((total / 5))

echo "Total marks: $total"
echo "Average marks: $average"

