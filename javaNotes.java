////////////////////////////////////////////////////////////////////////////
// STRINGS
////////////////////////////////////////////////////////////////////////////
// Declare new StringBuilder
StringBuilder strbuilder = new StringBuilder();

// Declare new String
String str = "";

// Add char to String
str += char;

// Add char to StringBuilder
strbuilder.append(char);

// Convert a StringBuilder to a String
strbuilder.toString()

// Get length of a String
str.length();

// Access character of String at a specified index
str.charAt(idx);



////////////////////////////////////////////////////////////////////////////
// ARRAYS
////////////////////////////////////////////////////////////////////////////
// Sort an Array
Arrays.sort(myArray);

// Declare new ArrayList
ArrayList<String> array = ???

// Convert Array to String
String str = new String(array);

// Get size of an array
myArray.length;

// Get item in Array by index:
myArray[index]

// Copy an array into a new array
newArray = myArray.clone()


////////////////////////////////////////////////////////////////////////////
// ARRAYLISTS
////////////////////////////////////////////////////////////////////////////
// To sort and arrayList
Collections.sort(myArrayList);

// Get Size of arrayList
myArrayList.size();

// Get item by index from an ArrayList:
myArrayList.get(index);

////////////////////////////////////////////////////////////////////////////
// LISTS
////////////////////////////////////////////////////////////////////////////
// Check the type of an object (i.e. check whether an item is an array)
if(element instanceof ArrayList) {
  // TODO
}

// Get Length / Size of a List
my_array.size()

// Get item in a List
myArray.get(index)



////////////////////////////////////////////////////////////////////////////
// HASHES
////////////////////////////////////////////////////////////////////////////
// Declare a new HashMap
HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

// Get value in HashMap using key (returns value)
hashMap.get(key)

// Add key value pair to HashMap
hashMap.put(key, value)

// Check for key in HashMap (returns true or false)
hashMap.containsKey(key)

// Iterate through and print out all key, value pairs in a HashMap
for (Map.Entry<String,Integer> pair : map.entrySet()) {
  String key = pair.getKey();
  int value = pair.getValue();
  // do stuff
  System.out.println(String.format("%s, %d", key, value ));
}

/* Check if a key exists in a HashMap
    - if the key exists, iterate its value by 1
    - if the key does not exist, add key/value pair with a default value
*/

myHashMap.put(key, myHashMap.getOrDefault(key, 0) + 1);