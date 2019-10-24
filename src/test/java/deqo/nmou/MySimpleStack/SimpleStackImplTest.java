package deqo.nmou.MySimpleStack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class SimpleStackImplTest {

    SimpleStack simpleStack;
    @Before
    public void setUp() throws Exception {
        simpleStack = new SimpleStackImpl();
        System.out.println("Je suis exécuté avant chaque test");
    }

    @Test
    public void testIsEmpty() {
        Assert.assertEquals(true, simpleStack.isEmpty());
        java.lang.String element1 = "toto";
        simpleStack.push(new Item(element1));
        Assert.assertEquals(false, simpleStack.isEmpty());
    }

    @Test
    public void testGetSize() {
        Assert.assertEquals(0, simpleStack.getSize());
        java.lang.String element1 = "toto";
        simpleStack.push(new Item(element1));
        simpleStack.push(new Item(element1+"2"));
    }

    @Test
    public void testPush() throws Exception {
        Item ita = new Item(new Integer(8));
        Assert.assertEquals(0, simpleStack.getSize());
        simpleStack.push(ita);
        //la pile doit etre augmentee de un item
        Assert.assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.peek();
        //On doit retrouver l'objet initial
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer)o.getValue();
        Assert.assertEquals(8, integer.intValue());
        Assert.assertEquals(ita.getValue(), integer);
    }

    @Test
    public void testPeek() throws Exception{
        Item ita = new Item(new Integer(8));
        Assert.assertEquals(0,simpleStack.getSize());
        simpleStack.push(ita);
        Assert.assertEquals(1,simpleStack.getSize());
        Item o = simpleStack.peek();
        Assert.assertEquals(1, simpleStack.getSize());
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer)o.getValue();
        Assert.assertEquals(8, integer.intValue());
        Assert.assertEquals(ita.getValue(), integer);
    }

    @Test
    public void testPop() throws Exception{
        Item ita = new Item(new Integer(8));
        Assert.assertEquals(0, simpleStack.getSize());
        simpleStack.push(ita);
        Assert.assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.pop();
        Assert.assertEquals(0, simpleStack.getSize());
        Assert.assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer)o.getValue();
        Assert.assertEquals(8, integer.intValue());
        Assert.assertEquals(ita.getValue(), integer);
    }
}