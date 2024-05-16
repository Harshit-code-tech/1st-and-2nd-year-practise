#!/bin/bash

echo "Enter value for variable a:"
read a

echo "Enter value for variable b:"
read b

echo "Before swapping: a = $a, b = $b"

# Swapping using a temporary variable
temp=$a
a=$b
b=$temp

echo "After swapping: a = $a, b = $b"

