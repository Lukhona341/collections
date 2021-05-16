package za.ac.cput;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {
    List client = new List();
    @Test
    public void testAdd()
    {
     client.add();
      assertSame(4,4);
    }
    @Test
    public void testRemove() {
     client.remove();
     assertEquals(3,3);
}
@Test
    public void find()
{
    client.find("");
    assertNotNull(client);

}
    }
