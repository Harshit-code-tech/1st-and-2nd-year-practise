read -p "What is your age?" age
read -p "what is your nationality? " nation
if [[ $age -ge 18  ]] && [[ $nation == "India" ]] 
then 
echo "You can vote"
else
echo "You can't"
fi
