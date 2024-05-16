#!/bin/bash

# Get the current date and time
currentDateTime=$(date)

# Extract individual components
day=$(date +"%e")
month=$(date +"%b")
year=$(date +"%Y")
hour=$(date +"%H")
minute=$(date +"%M")

# Display the result in the desired format
formattedDate="${day}/${month}/${year}/${hour}.${minute}"

echo "Original date: ${currentDateTime}"
echo "Formatted date: ${formattedDate}"

