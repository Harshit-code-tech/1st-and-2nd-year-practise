#!/bin/bash

echo -n "Enter a string: "
read input_string

reverse_string=$(echo $input_string | rev)

if [ "$input_string" == "$reverse_string" ]; then
    echo "The string is a palindrome."
else
    echo "The string is not a palindrome."
fi

