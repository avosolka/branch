import static org.junit.Assert.assertEquals;


public class TestJunit4 {

    @org.junit.Test
    public void testRemain(){
        CashBackHacker service = new CashBackHacker();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
       assertEquals(expected, actual);
    }
    @org.junit.Test
    public void testRemaiWithCashBack(){
        CashBackHacker service = new CashBackHacker();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemaiWithCashBack1(){
        CashBackHacker service = new CashBackHacker();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemaiWithCashBackNo1(){
        CashBackHacker service = new CashBackHacker();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }


}
