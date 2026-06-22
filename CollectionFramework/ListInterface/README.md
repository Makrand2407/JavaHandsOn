**This project demonstrates the List interface and its major implementations:**

**List interface in Java is part of the java.util package. It represents an ordered collection**
**- Elements are stored in insertion order**
**- Allows duplicate elements**
**- Provides indexed access(elements can be accessed by their position)**
**Common methods in the List interface:**
- **add(E e)** → Adds an element
- **add(int index, E e)** → Inserts at a specific position
- **get(int index)** → Retrieves element at index
- **remove(Object o)** / remove(int index)** → Removes element
- **size()** → Returns number of elements
- **contains(Object o)** → Checks if element exists.
- **indexOf(Object o)** → Finds index of element.
- **retainAll(Collection c)** → Keeps only common elements.

## Implementations of List

### 1. **ArrayList**
-**Backed by a dynamic array**
- **Fast random access** 
- **Slower insertions/removals in the middle (O(n))**
- **Allows duplicates and null values**
**Common methods:**
- **add(E e)**
- **add(int index, E e)**
- **remove(Object o)**
- **remove(int index)**
- **contains(Object o)**
- **indexOf(Object o)**


### 2. **LinkedList**
- **Implemented as a doubly-linked list**.
- **Efficient insertions/removals at both ends (O(1))**
- **Slower random access**
- **Implements both List and Deque**.
**Extra methods (from Deque):**
- **addFirst(E e)**
- **addLast(E e)**
- **getFirst()**
- **getLast()**
- **removeFirst()**
- **removeLast()**
- **peekFirst()**
- **pollLast()**

### 3. **Vector**
- **Similar to ArrayList but synchronized (thread-safe)**
- **Slower than ArrayList in single-threaded contexts**
- **Capacity grows automatically (default growth factor is 100%, but can be customized)**
**Common methods:**
- **add(E e)**
- **capacity()** → Returns current capacity.
- **size()** → Returns number of elements.

### 4. **Stack**
- **Subclass of Vector**
- **Represents a Last-In-First-Out (LIFO) stack**
- **Thread-safe due to Vector**
**Stack methods:**
- **push(E e)** → Adds element to top.
- **pop()** → Removes and returns top element.
- **peek()** → Returns top element without removing.
- **isEmpty()** → Checks if stack is empty.
- **search(Object o)** → Returns 1-based position from top (or -1 if not found).

