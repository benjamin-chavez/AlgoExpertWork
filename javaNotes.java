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
// ARRAYS & ARRAYLISTS
////////////////////////////////////////////////////////////////////////////
// Sort an Array
Arrays.sort(myArray);

// Declare new ArrayList
ArrayList<String> array = ???

// Convert Array to String
String str = new String(array);

// Get size of an array





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

