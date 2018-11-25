package io.github.xshoji.samplecode.constructororder;

import io.github.xshoji.samplecode.ObjectPrinter;

/** Created by xshoji on 2018/11/26. */
public class Sub2 extends Super2 {
  public Sub2(String name) {
    super(name);
    ObjectPrinter.println("  " + this.getClass().getSimpleName() + "'s constructor");
  }
}
