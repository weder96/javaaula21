package PackOCP13GenericsAndCollections.projectGenerics.bookFunctionalProgramming;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class ExecuteOldWay {
    public static void main(String[] args) {

        final List<BigDecimal> prices = Arrays.asList(
            new BigDecimal("10"), new BigDecimal("30"), new BigDecimal("17"),
            new BigDecimal("20"), new BigDecimal("15"), new BigDecimal("18"),
            new BigDecimal("45"), new BigDecimal("12"));

        //Suponha que sejamos solicitados a totalizar os preços superiores a US $ 20, com desconto de 10%.
        //Vamos fazer isso da maneira habitual do Java primeiro.
        BigDecimal totalOfDiscountedPrices = BigDecimal.ZERO;
        for(BigDecimal price : prices) {
            if(price.compareTo(BigDecimal.valueOf(20)) > 0)
                totalOfDiscountedPrices =
                        totalOfDiscountedPrices.add(price.multiply(BigDecimal.valueOf(0.9)));
        }
        System.out.println("Total of discounted prices: " + totalOfDiscountedPrices);
    }
}
