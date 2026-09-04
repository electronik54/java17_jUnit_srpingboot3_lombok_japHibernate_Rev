package com.electronik54.revision_3.corejava.ch119_mockito_mocking.solution;

/**
 * Solution 119: Mockito Mocking
 *
 * Test file: src/test/java/.../ch119_mockito_mocking/solution/UserServiceTest.java
 *
 * Key Mockito annotations and methods:
 *   @Mock           - Creates a mock object
 *   @InjectMocks    - Injects mocks into the tested object
 *   @Spy            - Partial mock (real object with some stubbed methods)
 *   @Captor         - ArgumentCaptor for captured arguments
 *
 * Common operations:
 *   when(mock.method()).thenReturn(value)
 *   doThrow(Exception.class).when(mock).method()
 *   verify(mock, times(1)).method()
 *   verify(mock, never()).method()
 *   ArgumentCaptor.forClass(String.class)
 *
 * BDD style (preferred):
 *   given(mock.method()).willReturn(value)
 *   then(mock).should(times(1)).method()
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println("=== Solution 119: Mockito Mocking ===\n");
        System.out.println("@Mock, @InjectMocks, @Spy, @Captor");
        System.out.println("when().thenReturn(), verify()");
        System.out.println("given().willReturn(), then().should() (BDD)");
        System.out.println("\nSee src/test/java/.../ch119_mockito_mocking/solution/UserServiceTest.java");
    }
}