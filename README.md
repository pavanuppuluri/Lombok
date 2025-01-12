## Lombok Example in Spring Boot

**Lombok** is a Java library that helps to reduce boilerplate code by automatically generating common methods like getters, setters, constructors, `toString()`, `equals()`, `hashCode()`, and more at compile-time.

Lombok uses annotations that are processed at compile-time to generate the necessary code for you, making your code cleaner and easier to maintain.

### Common Lombok Annotations:
- **`@Getter`** / **`@Setter`**: Automatically generates getter and setter methods.
- **`@ToString`**: Automatically generates a `toString()` method.
- **`@EqualsAndHashCode`**: Automatically generates `equals()` and `hashCode()` methods.
- **`@AllArgsConstructor`**: Generates a constructor with all fields.
- **`@NoArgsConstructor`**: Generates a no-argument constructor.
- **`@Builder`**: Implements the builder pattern to create instances of a class.
- **`@Data`**: A combination of `@Getter`, `@Setter`, `@ToString`, `@EqualsAndHashCode`, and `@RequiredArgsConstructor`.

### Example:

#### Adding Lombok Dependency

First, you need to add Lombok to your `pom.xml` if you are using Maven or to `build.gradle` if using Gradle.

For **Maven**:

```xml
<dependencies>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <version>1.18.24</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```

## Example Class Using Lombok Annotations

```java
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data               // Generates getters, setters, toString, equals, and hashCode methods
@AllArgsConstructor // Generates a constructor with all fields
@NoArgsConstructor  // Generates a no-argument constructor
public class User {

    private String username;
    private String password;
    private String email;

}
```

## Lombok Annotations Explanation

Lombok is a Java library that helps reduce boilerplate code by generating commonly used methods and constructors at compile time. Here's an explanation of the Lombok annotations used in the example class:

### **`@Data`**
The `@Data` annotation is a combination of several Lombok annotations:
- **`@Getter`**: Automatically generates getter methods for all fields.
- **`@Setter`**: Automatically generates setter methods for all fields.
- **`@ToString`**: Generates a `toString()` method that returns a string representation of the object, including all fields.
- **`@EqualsAndHashCode`**: Generates `equals()` and `hashCode()` methods based on all fields.
- **`@RequiredArgsConstructor`**: Generates a constructor that accepts all final fields and fields that are marked as `@NonNull`.

**Effect**: This annotation automatically creates getters, setters, `toString()`, `equals()`, and `hashCode()` methods, which would otherwise require a lot of boilerplate code.

### **`@AllArgsConstructor`**
The `@AllArgsConstructor` annotation generates a constructor that takes one argument for each field in the class. This is particularly useful when you need to quickly create an object with all of its fields initialized.

**Effect**: This annotation reduces the need to manually write constructors for your class.

### **`@NoArgsConstructor`**
The `@NoArgsConstructor` annotation generates a no-argument constructor. It is useful for frameworks like Hibernate or JPA that require a default constructor to instantiate an object, even if no fields are passed during creation.

**Effect**: This annotation creates a no-argument constructor, which is essential for certain frameworks and libraries that rely on reflection to create instances.

---

## Conclusion

Lombok is a great tool for reducing boilerplate code in Java applications, particularly in large Spring Boot projects. By using annotations like `@Data`, `@Getter`, `@Setter`, `@AllArgsConstructor`, and others, you can focus more on the **business logic** of your application rather than spending time writing repetitive code.

### **Key Benefits of Using Lombok**:
- **Less Boilerplate Code**: It minimizes the need to manually write getters, setters, constructors, and other commonly used methods.
- **Improved Code Readability**: The generated methods are kept out of the code, making your classes cleaner and easier to understand.
- **Better Focus on Business Logic**: Developers can focus more on implementing features and business functionality rather than mundane code generation tasks.

Lombok is particularly beneficial in **large projects** where a lot of classes are used for simple data holding (DTOs, models, etc.), helping maintain a cleaner codebase and improving productivity.







