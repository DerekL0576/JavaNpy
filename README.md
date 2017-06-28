# JavaNpy

Load NumPy array files in Java, inspired by [SwiftNpy](https://github.com/qoncept/swift-npy).

```java
String path = "resources/sample.npy";

Npy npy = new Npy(path);

float[] sampleData = npy.floatElements();
int[] sampleData = npy.int32Elements();
int[] samepleData = npy.uint16Elements();

DataType dt = npy.getDataType();
```

## Suppoted format
`npy` files.

### Bool
`boolean`

### UInt
`UInt8`, `UInt16`, `UInt32`, `UInt64`  
Since there is no `unsigned int` in Java, they are all treated as `signed int`

### Int
`Int8` (short), `Int16` (short), `Int32` (int), `Int64` (long) 

### Float, Double
`Float`, `Double`
