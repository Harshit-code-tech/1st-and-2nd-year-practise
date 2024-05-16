#if-else statement
read -p "Enter the marks : " marks
if [[ $marks -gt 40 ]] #greater then
then
echo "u won"
else
echo "u lost"
fi 

if [[ $marks -ge 80 ]]
then 
	echo "hoohhoo"
elif [[ $marks -ge 60 ]]
then 
	echo "okay"

else
echo "fail"
fi

