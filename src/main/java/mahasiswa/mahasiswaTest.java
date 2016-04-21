/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author SB604-19
 */
public class mahasiswaTest {
    
    private static mahasiswa m;
    
    @Before
    public void awal() {
        m = new mahasiswa ();
        System.out.println("Awal Test");
    }
    
    @Test
    public void testSatu() {
        m.setNrp("133040398");
        assertNotNull("Not Null", m.getNrp());
    }
    
    @Test
    public void testDua() {
        m.setNama("Lando Rinov");
        assertNotNull("Not Null", m.getNama());
    }
    
    @Test
    public void testTiga() {
        m.setUmur(22);
        assertNull("Null", m.getUmur());
    }
}
