x=10
y=20
#multiply print(not multiply
mul=$x*$y
echo "$mul"
#for real multiplication
let val=$x*$y
echo "$val"
#addition
let add=$x+$y
echo "$add"
# for direct access
echo " substraction is (($x-$y))"
echo " substraction is $(($x-$y))"
