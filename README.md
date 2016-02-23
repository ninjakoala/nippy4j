```java
import com.ninjakoala.nippy4j.Nippy4J;

public static void main(String[] args) {
  byte[] frozen = Nippy4J.freeze("something"); 
  Nippy4J.thaw(frozen); // -> "something"
}
```

# nippy4j

Creates a Java wrapper for [Nippy](https://github.com/ptaoussanis/nippy).

## License

Copyright © 2016 Neil Prosser

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
