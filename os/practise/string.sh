myval="ajkshfsfjkljhnalw sfgasg. safl; ?"
length=${#myval}
echo "length is $length "
#upper
echo "upperis ${myval^^} "
#lower
echo "loweris ${myval,,} "
# to replace 
newval=${myval/ajkshfsfjkljhnalw sfgasg. safl; ?/buddy}
echo "new is $newval "
#indexing...
echo "after slice ${myval:4:5}" 
