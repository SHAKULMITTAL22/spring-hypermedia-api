// ********RoostGPT********
/*
Test generated by RoostGPT for test hsbc-hypermedia-claude using AI Type Claude AI and AI Model claude-3-opus-20240229

ROOST_METHOD_HASH=setAuthor_e9d3d6a330
ROOST_METHOD_SIG_HASH=setAuthor_17245c30f4

Here are the JUnit test scenarios for the setAuthor method:

Scenario 1: Set Author with Valid Input

Details:
  TestName: setAuthorWithValidInput
  Description: This test verifies that the setAuthor method correctly sets the author property when provided with a valid string input.
Execution:
  Arrange: Create an instance of the class containing the setAuthor method.
  Act: Invoke the setAuthor method with a valid string parameter.
  Assert: Use assertEquals to verify that the author property of the instance matches the provided input string.
Validation:
  The assertion ensures that the setAuthor method properly assigns the input string to the author property.
  This test is important to validate that the basic functionality of setting the author works as expected.

Scenario 2: Set Author with Empty String

Details:
  TestName: setAuthorWithEmptyString
  Description: This test checks the behavior of the setAuthor method when provided with an empty string as input.
Execution:
  Arrange: Create an instance of the class containing the setAuthor method.
  Act: Invoke the setAuthor method with an empty string parameter.
  Assert: Use assertEquals to verify that the author property of the instance is set to an empty string.
Validation:
  The assertion confirms that the setAuthor method allows setting the author property to an empty string.
  This test ensures that the method handles empty string inputs gracefully without throwing any exceptions.

Scenario 3: Set Author with Null Input

Details:
  TestName: setAuthorWithNullInput
  Description: This test examines the behavior of the setAuthor method when provided with a null input.
Execution:
  Arrange: Create an instance of the class containing the setAuthor method.
  Act: Invoke the setAuthor method with a null parameter.
  Assert: Use assertNull to verify that the author property of the instance is set to null.
Validation:
  The assertion checks that the setAuthor method allows setting the author property to null.
  This test ensures that the method handles null inputs without throwing any exceptions, allowing the author property to be unset.

Scenario 4: Set Author with Long String Input

Details:
  TestName: setAuthorWithLongString
  Description: This test verifies the behavior of the setAuthor method when provided with a very long string as input.
Execution:
  Arrange: Create an instance of the class containing the setAuthor method and prepare a long string exceeding the typical length of an author name.
  Act: Invoke the setAuthor method with the long string parameter.
  Assert: Use assertEquals to verify that the author property of the instance matches the provided long string.
Validation:
  The assertion ensures that the setAuthor method correctly sets the author property even when given a very long string.
  This test validates that the method does not impose any arbitrary length restrictions on the author name.

These test scenarios cover different aspects of the setAuthor method, including valid input, empty string input, null input, and long string input. They ensure that the method behaves as expected in various scenarios and handles different types of inputs appropriately.
*/

// ********RoostGPT********
package com.baeldung.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookSetAuthorTest {
    private Book book;

    @Before
    public void setUp() {
        book = new Book();
    }

    @Test
    public void setAuthorWithValidInput() {
        String author = "John Doe";
        book.setAuthor(author);
        Assert.assertEquals(author, book.getAuthor());
    }

    @Test
    public void setAuthorWithEmptyString() {
        String author = "";
        book.setAuthor(author);
        Assert.assertEquals(author, book.getAuthor());
    }

    @Test
    public void setAuthorWithNullInput() {
        book.setAuthor(null);
        Assert.assertNull(book.getAuthor());
    }

    @Test
    public void setAuthorWithLongString() {
        String longAuthor = "This is a very long author name that exceeds the typical length of an author name";
        book.setAuthor(longAuthor);
        Assert.assertEquals(longAuthor, book.getAuthor());
    }
}
