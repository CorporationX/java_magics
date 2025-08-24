package entity.onboarding;

public class TestAutomationSystem {
    static void main() {
        TestScenario[] tests = new TestScenario[3];
        tests[0] = new LoginTest();
        tests[1] = new PaymentTest();
        tests[2] = new ProductSearchTest();

        for(TestScenario test : tests) {
            test.runTest();
        }
    }
}
