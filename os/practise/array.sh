#!/bin/bash
#array
myarray=( 1 20 30 30.4 hello "heybyd du")
echo "value of 3rd ${myarray[3]}"
echo "all the values in array are ${myarray[*]}"
#how to find total values in an array
echo "all the values in array are ${#myarray[*]}"
#how to get specific value
echo " values in array from 2-3 are ${myarray[*]:2:2}" #first is from where to start and 2nd is how much need to read

#updating array
myarray+=(new 20 39 21)
echo "values in new array are ${myarray[*]}"
