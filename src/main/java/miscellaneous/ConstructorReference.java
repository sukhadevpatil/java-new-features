package miscellaneous;

import lombok.*;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReference {
    public static void main(String[] args) {
        Supplier<Student> supplier = Student::new; // String::new is a constructor reference>
        System.out.println(supplier.get());

        Function<String, Student> function = Student::new; // String::new is a constructor reference>
        System.out.println(function.apply("Sukhdev"));
    }
}


@Data
@NoArgsConstructor
@AllArgsConstructor
class Student {
    private String name = null;
    private int age = 0;

    public Student(String name) {
        this.name = name;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (!(o instanceof Student student)) return false;
//        return getAge() == student.getAge() && Objects.equals(getName(), student.getName());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getName(), getAge());
//    }
}
