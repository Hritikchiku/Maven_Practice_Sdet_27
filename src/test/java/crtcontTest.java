import org.testng.annotations.Test;

public class crtcontTest {
@Test (groups = {"smokeTest"})
	public void createcontTest() {
		System.out.println("create contact");
	}
@Test  (groups = {"regrassionTest"})
public void modifycontTest() {
	System.out.println("contact modified ");
}
}
