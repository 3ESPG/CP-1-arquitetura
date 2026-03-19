package br.com.fiap.winery;

import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import br.com.fiap.winery.generated.stock.WineStockService;
import br.com.fiap.winery.generated.warning.WineWarningService;

public class ApplicationClient2 {

    public static void main(String[] args) throws Exception {
        URL stockUrl = new URL("http://localhost:8085/WineStockService?wsdl");

        QName stockQName = new QName(
                "http://winery.fiap.com.br/",
                "WineStockServiceImplementationService"
        );

        Service stockService = Service.create(stockUrl, stockQName);
        WineStockService wineStockService = stockService.getPort(WineStockService.class);

        String orderResult = wineStockService.placeOrder("Cabernet Sauvignon", 3);
        System.out.println(orderResult);

        URL warningUrl = new URL("http://localhost:8086/WineWarningService?wsdl");

        QName warningQName = new QName(
                "http://winery.fiap.com.br/",
                "WineWarningServiceImplementationService"
        );

        Service warningService = Service.create(warningUrl, warningQName);
        WineWarningService wineWarningService = warningService.getPort(WineWarningService.class);

        String warn = wineWarningService.sendWarn();
        System.out.println(warn);
    }
}