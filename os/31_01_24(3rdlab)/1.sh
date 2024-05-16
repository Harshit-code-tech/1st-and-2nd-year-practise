
reverse_integer() {
    num=$1
    reversed=0

    while [ $num -gt 0 ]; do
        remainder=$((num % 10))
        reversed=$((reversed * 10 + remainder))
        num=$((num / 10))
    done

    echo $reversed
}

read -p "Enter an integer: " input

if [[ $input =~ ^[0-9]+$ ]]; then
    reversed=$(reverse_integer $input)
    echo "Reversed integer: $reversed"
else
    echo "Invalid input. Please enter a valid integer."
fi

