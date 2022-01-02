package by.karas.selector;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertTrue;

public class PriceSelectorTest {
    Map<Integer, BigDecimal> values = new HashMap<>();
    PriceSelector priceSelector = new PriceSelector();
    {
        values.put(1, new BigDecimal(100));
        values.put(2, new BigDecimal(200));
        values.put(3, new BigDecimal(300));
    }

    @Test
    public void selectPriceNegativeValue() {
        BigDecimal result = priceSelector.selectPriceValue(values, new BigInteger("-1"));
        assertTrue("Result value is incorrect", result.equals(new BigDecimal(100)));
    }

    @Test
    public void selectPriceZeroValue() {
        BigDecimal result = priceSelector.selectPriceValue(values, new BigInteger("0"));
        assertTrue("Result value is incorrect", result.equals(new BigDecimal(100)));
    }

    @Test
    public void selectPriceMediumValue() {
        BigDecimal result = priceSelector.selectPriceValue(values, new BigInteger("2"));
        Assert.assertEquals("Result value is incorrect", result, new BigDecimal(200));
    }

    @Test
    public void selectPriceMaxValue() {
        BigDecimal result = priceSelector.selectPriceValue(values, new BigInteger("4"));
        assertTrue("Result value is incorrect", result.equals(new BigDecimal(300)));
    }

}