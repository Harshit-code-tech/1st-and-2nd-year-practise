read -p "Enter the string: " name
rev=""
for ((i=${#name}-1;i>=0;i--));
do
num=${name:i:1}
rev+="$num"
done
echo "Reversed: $rev"
