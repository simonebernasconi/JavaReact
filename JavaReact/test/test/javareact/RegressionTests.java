package test.javareact;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import test.javareact.server.DependencyDetectorTest;
import test.javareact.token_service.FinalExpressionsDetectorTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ LocalTest.class, //
    DependencyDetectorTest.class, //
    FinalExpressionsDetectorTest.class //
})
public class RegressionTests {

}