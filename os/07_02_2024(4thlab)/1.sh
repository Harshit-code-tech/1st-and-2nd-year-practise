#!/bin/bash
if [ "$#" -ne 3 ]; then
    echo "Usage: ./main.sh <file1> <file2> <output_file>"
    exit 1
fi

file1=$1
file2=$2
output_file=$3
paste -d '\n' $file1 $file2 > $output_file

