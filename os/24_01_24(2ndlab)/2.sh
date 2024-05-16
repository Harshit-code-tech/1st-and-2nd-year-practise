

echo "Enter three numbers:"
read num1
read num2 
read num3

echo "The greatest number is: $(echo "$num1 $num2 $num3" | tr ' ' '\n' | sort -nr | head -1)"

echo "Enter three number"
read num4
read num5
read num6
echo "The greatest number is: $(echo "$num4 $num5 $num6" | tr ' ' '\n' |sort -n | tail -1)"
