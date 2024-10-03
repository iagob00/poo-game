package designpatterns;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ TestPlayer.class, TestGameMap.class, TestFactoryMethod.class, TestObserver.class })
public class AllTests {

}