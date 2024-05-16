#!/bin/bash

echo "Prime numbers between 1 and 100 are:"
for num in $(seq 2 100); do
    isPrime=true
    for ((i=2; i*i<=num; i++)); do
        if [ $((num % i)) -eq 0 ]; then
            isPrime=false
            break
        fi
    done
    if [ "$isPrime" = true ]; then
        echo $num
    fi
done

