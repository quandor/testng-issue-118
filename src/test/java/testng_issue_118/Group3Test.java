package testng_issue_118;

import org.testng.Assert;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

@Test(groups = "group3")
public class Group3Test {
   private Object testObject;

   @BeforeGroups(alwaysRun = true)
   public void setUpGroup() {
      testObject = new Object();
   }

   public void test1() {
      Assert.assertNotNull(testObject, "@BeforeGroups not invoked if 'alwaysRun' is true");
   }
}
