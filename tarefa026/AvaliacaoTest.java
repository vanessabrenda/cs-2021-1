package br.com.gilmar;

import org.junit.*;

public class AvTest {
    private Av avaliac;
    @Before
    public void config() {
        avaliac = new Av();
    }
    @Test
    public void testCHNegat() {
        double n1 = 1;
        double n2 = 1;
        double faltas = 1;
        double cHoraria = -1;
        Exception exception = new Exception();
        try {
            avaliac.avalia(n1, n2, faltas, cHoraria);
        } catch (Exception e) {
            exception = e;
        }
        Assert.assertEquals("Os elementos são inválidos.", exception.getMessage());
    }
    @Test
    public void testFaltasMenor0() {
        double n1 = 1;
        double n2 = 1;
        double faltas = -1;
        double cHoraria = 10;
        Exception exception = new Exception();
        try {
            avaliac.avalia(n1, n2, faltas, cHoraria);
        } catch (Exception e) {
            exception = e;
        }
        Assert.assertEquals("Os elementos são inválidos.", exception.getMessage());
    }
    @Test
    public void testFaltasMaior10() {
        double n1 = 1;
        double n2 = 1;
        double faltas = 10;
        double cHoraria = 1;
        Exception exception = new Exception();
        try {
            avaliac.avalia(n1, n2, faltas, cHoraria);
        } catch (Exception e) {
            exception = e;
        }
        Assert.assertEquals("Os elementos são inválidos.", exception.getMessage());
    }
    @Test
    public void testN1Menor0() {
        double n1 = -1;
        double n2 = 1;
        double faltas = 1;
        double cHoraria = 10;
        Exception exception = new Exception();
        try {
            avaliac.avalia(n1, n2, faltas, cHoraria);
        } catch (Exception e) {
            exception = e;
        }
        Assert.assertEquals("Os elementos são inválidos.", exception.getMessage());
    }
    @Test
    public void testNMaior10() {
        double n1 = 11;
        double n2 = 1;
        double faltas = 1;
        double cHoraria = 10;
        Exception exception = new Exception();
        try {
            avaliac.avalia(n1, n2, faltas, cHoraria);
        } catch (Exception e) {
            exception = e;
        }
        Assert.assertEquals("Os elementos são inválidos.", exception.getMessage());
    }
    @Test
    public void testN2Menor0() {
        double n1 = 1;
        double n2 = -1;
        double faltas = 1;
        double cHoraria = 10;
        Exception exception = new Exception();
        try {
            avaliac.avalia(n1, n2, faltas, cHoraria);
        } catch (Exception e) {
            exception = e;
        }
        Assert.assertEquals("Os elementos são inválidos.", exception.getMessage());
    }
    @Test
    public void testN2Maior10() {
        double n1 = 1;
        double n2 = 11;
        double faltas = 1;
        double cHoraria = 10;
        Exception exception = new Exception();
        try {
            avaliac.avalia(n1, n2, faltas, cHoraria);
        } catch (Exception e) {
            exception = e;
        }
        Assert.assertEquals("Os elementos são inválidos.", exception.getMessage());
    }
    @Test
    public void testFaltaRep() {
        double n1 = 7;
        double n2 = 7;
        double faltas = 26;
        double cHoraria = 100;
        String result = "";
        try {
            result = avaliac.avalia(n1, n2, faltas, cHoraria);
        } catch (Exception e) {}
        Assert.assertEquals("O número de faltas máximas foi excedido, reprovado.", result);
    }
    @Test
    public void testRepMenor3() {
        double n1 = 2;
        double n2 = 2;
        double faltas = 20;
        double cHoraria = 100;
        String result = "";
        try {
            result = avaliac.avalia(n1, n2, faltas, cHoraria);
        } catch (Exception e) {}
        Assert.assertEquals("A média não foi alcançada, reprovado.", result);
    }
    @Test
    public void testPE() {
        double n1 = 4;
        double n2 = 4;
        double faltas = 20;
        double cHoraria = 100;
        String result = "";
        try {
            result = avaliac.avalia(n1, n2, faltas, cHoraria);
        } catch (Exception e) {}
        Assert.assertEquals("Prova Extra.", result);
    }
    @Test
    public void testPE1(){
        double n1 = 3;
        double n2 = 3;
        double faltas = 20;
        double cHoraria = 100;
        String result = "";
        try {
            result = avaliac.avalia(n1, n2, faltas, cHoraria);
        } catch (Exception e) {}
        Assert.assertEquals("Prova Extra.", result);
    }
    @Test
    public void testAp() {
        double n1 = 6;
        double n2 = 6;
        double faltas = 1;
        double cHoraria = 10;
        String result = "";
        try {
            result = avaliac.avalia(n1, n2, faltas, cHoraria);
        } catch (Exception e) {}
        Assert.assertEquals("Aprovado, parabéns!", result);
    }
    @Test
    public void testAp2() {
        double n1 = 7;
        double n2 = 7;
        double faltas = 1;
        double cHoraria = 10;
        String result = "";
        try {
            result = avaliac.avalia(n1, n2, faltas, cHoraria);
        } catch (Exception e) {}
        Assert.assertEquals("Aprovado, parabéns!", result);
    }

}
