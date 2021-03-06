package io.github.xshoji.samplecode.objectequals;

import io.github.xshoji.samplecode.ObjectPrinter;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/** Created by xshoji on 2018/11/17. */
public class EqualsTests {
  @Test
  public void test() throws MalformedURLException {
    long systemCurrentTimeMillis = System.currentTimeMillis();

    Timestamp timestamp = new Timestamp(systemCurrentTimeMillis);
    Date date = new Date(systemCurrentTimeMillis);
    ObjectPrinter.println(date.equals(timestamp));
    ObjectPrinter.println(timestamp.equals(date));

    Set<Date> dateSet1 = new HashSet<>();
    dateSet1.add(new Date(systemCurrentTimeMillis));
    dateSet1.add(new Date(systemCurrentTimeMillis));
    dateSet1.add(new Timestamp(systemCurrentTimeMillis));
    dateSet1.add(new Timestamp(systemCurrentTimeMillis));
    ObjectPrinter.printlnAsJsonString(dateSet1);
    ObjectPrinter.println(dateSet1.size());

    Set<Date> dateSet2 = new HashSet<>();
    dateSet2.add(new Timestamp(systemCurrentTimeMillis));
    dateSet2.add(new Timestamp(systemCurrentTimeMillis));
    dateSet2.add(new Date(systemCurrentTimeMillis));
    dateSet2.add(new Date(systemCurrentTimeMillis));
    ObjectPrinter.printlnAsJsonString(dateSet2);
    ObjectPrinter.println(dateSet2.size());

    // > URLStreamHandler (Java Platform SE 8 )
    // >
    // https://docs.oracle.com/javase/jp/8/docs/api/java/net/URLStreamHandler.html#hostsEqual-java.net.URL-java.net.URL-
    // > URLStreamHandler (Java Platform SE 8 )
    // >
    // https://docs.oracle.com/javase/jp/8/docs/api/java/net/URLStreamHandler.html#getHostAddress-java.net.URL-
    Set<URL> urlSet = new HashSet<>();
    urlSet.add(new URL("https://www.yahoo.co.jp"));
    urlSet.add(new URL("https://www.google.co.jp"));
    urlSet.add(new URL("https://www.facebook.com"));
    urlSet.add(new URL("https://www.twitter.com"));
    ObjectPrinter.printlnAsJsonString(urlSet);
    ObjectPrinter.println(urlSet.size());
    assert true;
  }
}
