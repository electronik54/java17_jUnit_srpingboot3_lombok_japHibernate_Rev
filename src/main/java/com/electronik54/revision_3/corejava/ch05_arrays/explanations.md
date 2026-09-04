# Challenge 5: Arrays

## Problem
Create single and multi-dimensional arrays. Demonstrate array initialization, traversal, sorting, searching, and copying.

## Hint
- Use Arrays.sort() for sorting
- Use Arrays.binarySearch() for searching (array must be sorted)
- Use Arrays.copyOf() for copying
- Use Arrays.toString() for printing

## Expected Output
Output showing array operations and results.

## Explanation

### Array Declaration and Initialization

**Declaration:**
```java
int[] arr;           // Preferred
int arr[];           // C-style (valid but not recommended)
```

**Initialization:**
```java
// Method 1: With values
int[] arr1 = {1, 2, 3, 4, 5};

// Method 2: With size (default values)
int[] arr2 = new int[5];  // [0, 0, 0, 0, 0]

// Method 3: Anonymous array
int[] arr3 = new int[]{1, 2, 3, 4, 5};
```

**Default Values:**
| Type | Default |
|------|---------|
| byte, short, int, long | 0 |
| float, double | 0.0 |
| char | '\u0000' |
| boolean | false |
| Object | null |

### Array Properties

**Length:**
```java
int[] arr = {1, 2, 3};
int len = arr.length;  // 3 (property, not method)
```

**Index:**
- First element: `arr[0]`
- Last element: `arr[arr.length - 1]`
- Accessing out of bounds: `ArrayIndexOutOfBoundsException`

### Array Traversal

**Using for loop:**
```java
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

**Using for-each:**
```java
for (int val : arr) {
    System.out.println(val);
}
```

### Arrays Utility Class

**Sorting:**
```java
int[] arr = {5, 2, 8, 1, 9};
Arrays.sort(arr);  // [1, 2, 5, 8, 9]

// Sort range
Arrays.sort(arr, 0, 3);  // Sort indices 0-2
```

**Searching:**
```java
int[] sorted = {1, 2, 3, 4, 5};
int index = Arrays.binarySearch(sorted, 3);  // 2
int notFound = Arrays.binarySearch(sorted, 6);  // -6 (negative)
```

**Note:** Array must be sorted before binarySearch!

**Copying:**
```java
int[] original = {1, 2, 3, 4, 5};
int[] copy = Arrays.copyOf(original, original.length);

// Copy with different size
int[] resized = Arrays.copyOf(original, 3);  // [1, 2, 3]
int[] padded = Arrays.copyOf(original, 7);  // [1, 2, 3, 4, 5, 0, 0]
```

**Filling:**
```java
int[] arr = new int[5];
Arrays.fill(arr, 42);  // [42, 42, 42, 42, 42]
```

**Comparing:**
```java
int[] arr1 = {1, 2, 3};
int[] arr2 = {1, 2, 3};
boolean equal = Arrays.equals(arr1, arr2);  // true
```

**Printing:**
```java
int[] arr = {1, 2, 3};
System.out.println(Arrays.toString(arr));  // [1, 2, 3]
```

### Multi-dimensional Arrays

**2D Array:**
```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Access element
int val = matrix[1][2];  // 6

// Traverse
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

**Jagged Array (rows of different lengths):**
```java
int[][] jagged = new int[3][];
jagged[0] = new int[]{1, 2};
jagged[1] = new int[]{3, 4, 5};
jagged[2] = new int[]{6};
```

## Key Takeaways

- **When to Use Arrays:**
  - Fixed-size collection
  - Same data type
  - Fast random access (O(1))
  - Performance-critical code

- **Best Practices:**
  - Use `int[] arr` not `int arr[]`
  - Use Arrays utility class for operations
  - Use for-each for simple traversal
  - Prefer ArrayList for dynamic sizing

- **Common Pitfalls:**
  - ArrayIndexOutOfBoundsException
  - Forgetting arrays are fixed-size
  - Using == to compare arrays (use Arrays.equals())
  - Not sorting before binarySearch()

- **Interview Tips:**
  - Know time complexity: access O(1), search O(n), insert O(n)
  - Understand difference between arrays and ArrayList
  - Know how to implement binary search manually
  - Understand multi-dimensional array memory layout

## Related Challenges
- Challenge 1: Variables and Data Types
- Challenge 4: Loops
- Challenge 36: List Operations
- Challenge 42: Iterators