#!/bin/bash


addition() {
    local sum=0
    for value in "${values[@]}"; do
        sum=$((sum + value))
    done
    echo "____________________________________________________________"
    echo ""
    echo "Sum: $sum"
}


subtraction() {
    local result=${values[0]}
    for ((i = 1; i < ${#values[@]}; i++)); do
        result=$((result - values[i]))
    done
    echo "____________________________________________________________"
    echo ""
    echo "Result of subtraction: $result"
}

multiplication() {
    local result=1
    for value in "${values[@]}"; do
        result=$((result * value | bc))
    done
    echo "____________________________________________________________"
    echo ""
    echo "Product: $result"
}


division() {
    local result=${values[0]}
    for ((i = 1; i < ${#values[@]}; i++)); do
        result=$((result / values[i] | bc))
    done
    echo "____________________________________________________________"
    echo ""
    echo "Result of division: $result"
}


echo "Enter the number of values: "
read num_values


values=()
for ((i = 1; i <= num_values; i++)); do
    echo "Enter value $i: "
    read value
    values+=("$value")
done


while true; do
    echo "____________________________________________________________"
    echo ""
    echo "Choose an operation:"
    echo "1. Addition"
    echo "2. Subtraction"
    echo "3. Multiplication"
    echo "4. Division"
    echo "5. All Operations"
    echo "6. Rewrite values"
    echo "7. Exit"
    echo "____________________________________________________________"
    echo ""
    echo "Your opinion: "
    echo ""

    read choice

    case $choice in
        1)
            addition
            ;;
        2)
            subtraction
            ;;
        3)
            multiplication
            ;;
        4)
            division
            ;;
        5)
            addition
            subtraction
            multiplication
            division
            ;;
        6)
           
            values=()
            for ((i = 1; i <= num_values; i++)); do
            	echo "____________________________________________________________"
    		echo ""
                echo "Enter value $i: "
                read value
                values+=("$value")
            done
            ;;
        7)
           
            echo "Exiting..."
            exit 0
            ;;
        *)
            echo "Invalid choice. Please enter a number from 1 to 7."
            ;;
    esac
done

