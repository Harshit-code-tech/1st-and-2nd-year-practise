#while
count=0
num=10
while [ $count -le $num ]
do
    echo "value of count is $count"
    ((count++))
done

#untill
a=1
until [[ $a -eq 10 ]]
do 
echo "Value is $a "
let a++
done

#infinite
#while true
#do 
#echo "hello"
#sleep 4s
#done


#while for file
while read myval
do
echo "value from file is $myval"
done < "name.txt"

#while read csv file
while IFS="," read d, n ,a #INTERnal field seperator
do
echo "Id is $d "
echo "name is $n "
echo "add is $a "
done < name.csv

