import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.*;
import static org.junit.Assert.*;

public class SortingSymflowerTest {
	@Test // (expected = java.lang.NullPointerException.class)
	public void HogwartsStudent6() {
		java.lang.String name = null;
		java.lang.Boolean isSmart = null;
		java.lang.Boolean isKind = null;
		HogwartsStudent actual = new HogwartsStudent(name, isSmart, isKind);
	}

	@Test // (expected = java.lang.NullPointerException.class)
	public void HogwartsStudent7() {
		java.lang.String name = null;
		java.lang.Boolean isSmart = null;
		java.lang.Boolean isKind = false;
		HogwartsStudent actual = new HogwartsStudent(name, isSmart, isKind);
	}

	@Test
	public void HogwartsStudent8() {
		java.lang.String name = null;
		java.lang.Boolean isSmart = false;
		java.lang.Boolean isKind = false;
		HogwartsStudent expected = new HogwartsStudent(null, null, null);
		expected.isKind = false;
		expected.isSmart = false;
		HogwartsStudent actual = new HogwartsStudent(name, isSmart, isKind);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test // (expected = java.lang.NullPointerException.class)
	public void getStudentHouse9() {
		SortStudents s = new SortStudents();
		HogwartsStudent student = null;
		java.lang.String actual = s.getStudentHouse(student);
	}

	@Test
	public void getStudentHouse10() {
		SortStudents s = new SortStudents();
		HogwartsStudent student = new HogwartsStudent("", null, null);
		student.house = "";
		student.isKind = false;
		student.isSmart = false;
		java.lang.String expected = "Hufflepuff";
		java.lang.String actual = s.getStudentHouse(student);

		assertEquals(expected, actual);
	}

	@Test
	public void getStudentHouse11() {
		SortStudents s = new SortStudents();
		HogwartsStudent student = new HogwartsStudent("", null, null);
		student.house = "";
		student.isKind = true;
		student.isSmart = false;
		java.lang.String expected = "Gryffindor";
		java.lang.String actual = s.getStudentHouse(student);

		assertEquals(expected, actual);
	}

	@Test
	public void getStudentHouse12() {
		SortStudents s = new SortStudents();
		HogwartsStudent student = new HogwartsStudent("", null, null);
		student.house = "";
		student.isKind = false;
		student.isSmart = true;
		java.lang.String expected = "Slytherin";
		java.lang.String actual = s.getStudentHouse(student);

		assertEquals(expected, actual);
	}

	@Test
	public void getStudentHouse13() {
		SortStudents s = new SortStudents();
		HogwartsStudent student = new HogwartsStudent("", null, null);
		student.house = "";
		student.isKind = true;
		student.isSmart = true;
		java.lang.String expected = "Ravenclaw";
		java.lang.String actual = s.getStudentHouse(student);

		assertEquals(expected, actual);
	}

	@Test // (expected = java.lang.NullPointerException.class)
	public void sortStudent14() {
		SortStudents s = new SortStudents();
		HogwartsStudent student = null;
		s.sortStudent(student);
	}

	@Test
	public void sortStudent15() {
		SortStudents s = new SortStudents();
		HogwartsStudent student = new HogwartsStudent("", null, null);
		student.house = "";
		student.isKind = false;
		student.isSmart = false;
		s.sortStudent(student);
	}

	@Test
	public void sortStudent16() {
		SortStudents s = new SortStudents();
		HogwartsStudent student = new HogwartsStudent("", null, null);
		student.house = "";
		student.isKind = true;
		student.isSmart = false;
		s.sortStudent(student);
	}

	@Test
	public void sortStudent17() {
		SortStudents s = new SortStudents();
		HogwartsStudent student = new HogwartsStudent("", null, null);
		student.house = "";
		student.isKind = false;
		student.isSmart = true;
		s.sortStudent(student);
	}

	@Test
	public void sortStudent18() {
		SortStudents s = new SortStudents();
		HogwartsStudent student = new HogwartsStudent("", null, null);
		student.house = "";
		student.isKind = true;
		student.isSmart = true;
		s.sortStudent(student);
	}
}
