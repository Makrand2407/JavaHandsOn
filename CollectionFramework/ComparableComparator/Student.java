// Student class implements Comparable
// Comparable is used for natural sorting
// Here Student objects will be sorted based on name
public class Student implements Comparable<Student> {

	Integer id;
	String name;
	Integer age;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}


	// Parameterized constructor
	public Student(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}


	public Student() {
		super();
	}

	// compareTo() defines natural ordering, Sorting will happen according to student name
	@Override
	public int compareTo(Student o) {

		return name.compareTo(o.name);
	}
}
