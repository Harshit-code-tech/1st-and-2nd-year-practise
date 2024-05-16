#for 1
for i in  1 2 3 4 5 6 7 8 9 10
do
echo "NUmber is $i"
done

#for 2
for name  in raju sham baburao
do 
echo "Name is $name"
done 

#for 3
for i in  {1..5}
do
echo "NUmber is $i"
done

#using for in practical eg
#for using file 4
#FILE= "/home/harshit/Desktop/os/practise/name.txt"
#for name in $(cat $FILE)
#do 
#echo "Name is $name"
#done

#for 5
array=(1 2 3 hello hi )
length=${#array[*]}
for (( i=0;i<$length;i++))
do
echo "Value of array  ${array[$i]}"
done

#for 6 infinite
for (( ;; ))
do 
echo "HI buddy "
sleep 2s
done
