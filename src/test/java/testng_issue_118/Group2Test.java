package testng_issue_118;

import org.testng.Assert;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

@Test(groups = "group2")
public class Group2Test {
   private Object testObject;

   @BeforeGroups(groups = "group2")
   public void setUpGroup() {
      testObject = new Object();
   }

   public void test1() {
      Assert.assertNotNull(testObject, "@BeforeGroups not invoked if 'groups' is specified explicitly");
   }
}
