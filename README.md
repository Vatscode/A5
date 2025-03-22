🌟 DynamicArray

📌 Overview

This project is a simple assignment for my Advanced Programming class. It implements a dynamic array in Java, following the DynamicCollection interface,
and provides resizable array functionality and also passes all the tests from Tests file.

✨ Features

✅ Auto-Resizing: The array dynamically expands its capacity when needed.
✅ Generic Support: Works seamlessly with any reference type T
.✅ Basic Operations: Supports adding, deleting, retrieving, and updating elements.
✅ Array Conversion: Easily convert to a standard Java array.
✅ Exception Handling: Protects against invalid accesses with IndexOutOfBoundsException.

🛠 Implementation Details

🔹 Initial Capacity: Starts with a capacity of 8.
🔹 Dynamic Resizing: Automatically doubles when full.
🔹 Efficient Deletion: Elements shift left after deletion to maintain order.
🔹 Safe Retrieval: getLast and getRandom return null when the array is empty.
