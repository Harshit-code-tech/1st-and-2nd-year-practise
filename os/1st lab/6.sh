#!/bin/bash

echo "Enter value for a:"
read a

echo "Enter value for b:"
read b

result=$(( (a + b) * (a + b) ))

echo "(a + b)^2 is: $result"

