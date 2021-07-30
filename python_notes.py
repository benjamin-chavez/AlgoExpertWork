##########################################################
# Strings
##########################################################
# Reverse a String
my_string = "Hello World"[::-1]

# Sort a String
"".join(sorted(my_string))

##########################################################
# Integers
##########################################################
# Compare two integers and return the greater of the 2 
max(integer1, integer2)

##########################################################
# Arrays
##########################################################
# Initialize an empty array of size n:
my_array = [None] * n

# Initialize an array of arrays with a specific size of mxn
my_array = [ [ None for y in range( n ) ] for x in range( m ) ]

# Sort an Array
my_array.sort()

# Slice (copy) an array
my_array = your_array[:]

# Return the length of an array
len(my_array)

# Check if an array is empty
if not len(my_array):

# Return the largest number:
x = max(5, 10)




##########################################################
# Dictionaries
##########################################################
# Get value using key
my_dict[key]

# 
dict.setdefault(key, default_value)

# Get all values from a dict
my_dict.values()

# Convert all values in a dictionary into a list
list(my_dict.values())

# 