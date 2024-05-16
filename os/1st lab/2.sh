# Prompt the user for input
echo "Enter the distance in kilometers:"
read distance_km


# Perform conversions
distance_meter=$(echo "$distance_km * 1000" | bc)
distance_cm=$(echo "$distance_meter * 100" | bc)

# Display the results
echo "Distance in meters: $distance_meter m"
echo "Distance in centimeters: $distance_cm cm"
echo "Distance in kilometers: $distance_km km"

