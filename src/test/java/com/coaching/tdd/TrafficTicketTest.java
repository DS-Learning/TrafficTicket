package com.coaching.tdd;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class TrafficTicketTest {

    //SUT
    ITicketSystem trafficTicket;

    @Before
    public void setup() {
        trafficTicket = new TrafficTicketSystem();
    }

    @Test
    public void shouldReturnNoTicket() {
        String compensation = trafficTicket.shouldCompensate();
        assertEquals("ไม่เสียค่าปรับ", compensation);
    }

}
