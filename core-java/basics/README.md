## Java
### _Introduction_
java is a high-level, object-oriented programming language used to develope
web-app, mobile apps, iot based applications, games, enterprise backends and
desktop applications

`Java features are`
1) Platform independent - Write once, run anywhere,
2) Opensource and Object Oriented
3) Robust and secure
4) Multithreading and concurrency control

`Famous applications that were made in java`
- Mobile applications made for android devices
- Web applications developement
- Desktop GUI applications
- Enterprise applications
- Game Development
- Big data analytics
- Cloud based applications

### _Data_ _types_
- `Primitive`
    - `Integral` byte, short, int, long, float, double
    - `Non - Integral` char, boolean

    | data type | size(in bytes) | default value |
    |-----------|----------------|---------------|
    | byte      | 1              | 0             |
    | short     | 2              | 0             |
    | int       | 4              | 0             |
    | long      | 8              | 0             |
    | float     | 4              | 0.0           |
    | double    | 8              | 0.0           |
    | char      | 4              | \u0000        |
    | boolean   | -              | false         |


- `Non - Primitive`
    - Arrays, Strings and User Defined types

### _Type_ _casting_
- `Implicit` -
```java
int a = 122;
int b = 3;
// implicitly float value will be casted to integer
int res = a/b;
```

- `Explicit`
```java
int a = 122;
int b = 3;
// explicitly tell to cast result to a float value
float res = (float) a/b;
```

### _Conditional_ _Statements_
- if
```java
if(condition) {
    //statements need be executed
}
```

- if-else
```java
if(condition) {
    // statements need be executed when condition is true
} else {
   // statements need to executed when condition is false
}
```

- if else if ladder
```java
if(condtion1) {
    // statements need be executed when condition1 is true
}else if(condition2) {
    // statements need be executed when condition1 is false and condition2 is true
} else {
    // statements need be executed when condition1 is false and condition2 is also false
}

```
- switch case
```java
//old syntax
switch(choice){
    case CASE_I:
        // statement need to be executed when case-i is meet;
        break;
    case CASE_II:
        // statement need to be executed when case-ii is meet;
        break;
    case CASE_III:
        // statement need to be executed when case-iii is meet;
        break;
    case CASE_IV:
        // statement need to be executed when case-iv is meet;
        break;
    case CASE_V:
        // statement need to be executed when case-v is meet;
        break;
    default
        // statement need to be executed when none of above cases met.
}

// newer syntax after java 17
switch(choice){
    case SUNDAY, SATUREDAY -> System.out.println("WEEKDAY");
    case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("WEEKEND");
}
```

### _Loops_
1) for
```java
for(initialization of counter; conditon; updation_in_counter) {
    // statements need to be executed.
}
```
2) while
```java
// initialization
while (condition) {
    // statements need to be executed.
    // updation to counter/tracker variable.
}
```

3) do-while
```java
// initialization
do{
    // statements need to be executed.
    // updation to counter variable.
}while(condition);
```

4) forEach
```java
collections/Array intialization list
list.forEach(element -> System.out.println("element: ", element))
```

`break and continue statements inside loops`

**break** - break statment inside the loop is used to break the normal execution of program
and get out of the loop.

**continue** -


