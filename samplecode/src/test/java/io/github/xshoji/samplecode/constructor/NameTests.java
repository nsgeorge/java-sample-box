package io.github.xshoji.samplecode.constructor;

import io.github.xshoji.samplecode.ObjectPrinter;
import io.github.xshoji.samplecode.factorymethod.packageprivate.NameCreator;
import io.github.xshoji.samplecode.factorymethod.packageprivate.PrivateName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class NameTests {

  @Test
  public void test() {
    Name name1 = new Name("test", 10);
    Name name2 = new Name(10, "name");
    ObjectPrinter.printAsJsonString(name1);
    ObjectPrinter.printAsJsonString(name2);

    name1 = Name.createName("test", 10);
    name2 = Name.createEmptyName();
    ObjectPrinter.printAsJsonString(name1);
    ObjectPrinter.printAsJsonString(name2);

    // Cannot create directly
    // NormalName name = new NormalName();
    PrivateName name3 = NameCreator.normalName("test", 10);
    PrivateName name4 = NameCreator.emptyName();
    ObjectPrinter.printAsJsonString(name3);
    ObjectPrinter.printAsJsonString(name4);
    assert true;
  }
}