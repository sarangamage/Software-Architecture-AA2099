package com.sltc.soa.client;

import java.util.Scanner;

import com.sltc.soa.client.stub.CurrencyConversionWs;
import com.sltc.soa.client.stub.CurrencyConversionWsService;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: Thilanka<br/>
 * Date: 12/20/2022<br/>
 * Time: 10:31 PM<br/>
 * To change this template use File | Settings | File Templates.
 */
public class CurrencyConversion {
    public static void main(String[] args) {
        CurrencyConversionWsService currencyConversionWsService = new CurrencyConversionWsService();
        CurrencyConversionWs currencyConversionWs = currencyConversionWsService.getCurrencyConversionWsPort();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Amount of value: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter the Source Currency: ");
        String SourceCurrency = scanner.next();
        System.out.print("Enter the Target currency: ");
        String targetCurrency = scanner.next();

        double ans = currencyConversionWs.convert(amount, SourceCurrency, targetCurrency);
                System.out.println(ans);




    }
}