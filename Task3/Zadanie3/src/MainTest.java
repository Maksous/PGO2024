import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void calculatePriceDlaCzwartku() {
        assertEquals(0,Main.calculatePrice(25,"Gdansk","Czwartek"));
    }
    @org.junit.jupiter.api.Test
    void calculatePriceDlaWarszawy() {
        assertEquals(36,Main.calculatePrice(25,"Warszawa","Poniedzialek"));
    }
    @org.junit.jupiter.api.Test
    void calculatePricePonizej18powyzej10() {
        assertEquals(20,Main.calculatePrice(15,"Gdansk","Poniedzialek"));
    }
}