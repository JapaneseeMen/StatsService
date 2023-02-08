import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.javaqamvn.services.SalesService;

public class StatsServiceTest {

    @Test
    public void sumAllSales() {
        SalesService service = new SalesService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectSum = 180;
        int actualSum = service.sumSales(sales);
        Assertions.assertEquals(expectSum, actualSum);
    }

    @Test

    public void averageSales() {

        SalesService service = new SalesService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectAverage = 15;
        int actualAverage = service.averageSales(sales);
        Assertions.assertEquals(expectAverage, actualAverage);

    }

    @Test
    public void minSalesMonth() {
        SalesService service = new SalesService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectMin = 9;
        int actualMin = service.minSales(sales);
        Assertions.assertEquals(expectMin, actualMin);
    }

    @Test
    public void maxSalesMonth() {
        SalesService service = new SalesService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectMax = 8;
        int actualMax = service.maxSales(sales);
        Assertions.assertEquals(expectMax, actualMax);
    }

    @Test
    public void lowAverageSumSales() {
        SalesService service = new SalesService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectLowAverage = 5;
        int actualLowAverage = service.lowAverageSumSales(sales);
        Assertions.assertEquals(expectLowAverage, actualLowAverage);
    }

    @Test
    public void upAverageSumSales() {
        SalesService service = new SalesService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectUpAverage = 5;
        int actualUpAverage  = service.upAverageSumSales(sales);
        Assertions.assertEquals(expectUpAverage , actualUpAverage) ;
    }
}