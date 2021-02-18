package com.tuba.deneme;

import static org.junit.Assert.*;
import org.junit.Test;

public class ToplamaTest {

    ToplamaIslemi a = new ToplamaIslemi(4);
    ToplamaIslemi b = new ToplamaIslemi(10);
    int sonuc = a.x+ b.x;


    Kosul k = new Kosul(sonuc);
    int ort = k.Kosull(sonuc);


    @ Test
    public void ToplamaTest() throws Exception
    {
        assertEquals(14,sonuc);

    }

    @Test
    public void KosulTest() throws Exception
    {
        assertEquals(7,ort);

    }
}
