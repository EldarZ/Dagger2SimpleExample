package com.eldarz.additionallib;

import org.junit.Test;

import static org.junit.Assert.*;

public class SomeClassUnitTests {

    class DependencyClassMock implements DependencyClass{
        @Override
        public String getMessage() {
            return "Mock message";
        }
    }

    @Test
    public void getMessageTest() throws Exception {
        SomeClass someClass = new SomeClassImpl(new DependencyClassMock());
        String messageMock = someClass.getMessage();
        assertEquals(messageMock, "Mock message");
    }
}