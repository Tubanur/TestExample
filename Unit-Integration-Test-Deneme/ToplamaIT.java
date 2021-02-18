package com.tuba.deneme;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class ToplamaIT {
    ToplamaIslemi sayi = new ToplamaIslemi(4);
    ToplamaIslemi sayi2 = new ToplamaIslemi(2);
    int toplam=sayi.x+sayi2.x;

    Kosul kos = new Kosul(2);
    int ortalama=toplam/2;

    @Test
    public void IslemlerIt() throws Exception
    {
        assertEquals(3,ortalama);
    }
}
