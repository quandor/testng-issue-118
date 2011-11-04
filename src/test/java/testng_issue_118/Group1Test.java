package testng_issue_118;

import org.testng.Assert;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

@Test(groups = "group1")
public class Group1Test {
   private Object testObject;

   @BeforeGroups
   public void setUpGroup() {
      testObject = new Object();
   }

   public void test1() {
      Assert.assertNotNull(testObject, "@BeforeGroups not invoked if nothing explicitly specified");
   }
}
