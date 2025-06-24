package com.polis;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses(CalcTest.class)
@IncludeTags({"exception", "equals"})
public class CalcTestSuite {
}
