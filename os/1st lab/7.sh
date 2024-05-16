#!/bin/bash

echo "Enter the radius of the circle:"
read radius

# Using bc for floating-point arithmetic
area=$(echo "scale=2; 3.14 * $radius * $radius" | bc)

echo "The area of the circle is: $area"

