////////////////////////////////////////////////////////////////////////////
// ARRAYS & ARRAYLISTS
////////////////////////////////////////////////////////////////////////////
// Sort an Array
Arrays.sort(myArray);

// Declare new ArrayList
ArrayList<String> array = ???




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

