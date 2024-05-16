
#!/bin/bash
if [ "$#" -gt 8 ]; then
  echo "Number of inputs cannot exceed 8"
  exit 1
fi

a=$1
b=$2

if [ $((a % b)) -eq 0 ]; then
  new_result=$((a / b))
elif [ $((a % b)) -ne 0 ] && [ $((b % 5)) -eq 0 ]; then
  new_result=$((a * b))
elif [ $a -gt $b ]; then
  new_result=$((a - b))
else
  new_result=$((a + b))
fi

echo "New result: $new_result"

