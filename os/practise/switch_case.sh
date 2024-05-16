echo "Provide an option"
echo "a) date"
echo "b) list"
echo "c) current location"
echo ""
echo "_____________________________"
read choice
# switch case
case $choice in 
  # a
  a)
    echo ""
    echo "_____________________________"
    echo "Today's date is "
    date
    echo "Ending"
    ;;
  # b
  b)
    echo ""
    echo "_____________________________"
    echo "List is: "
    ls
    echo "Ending"
    ;;
  # c
  c)
    echo ""
    echo "_____________________________"
    echo "Current location is: "
    pwd
    echo "Ending"
    ;;
  # any other input
  *)
    echo "Invalid input"
    echo "Ending"
    ;;
esac
echo ""
echo "_____________________________"

