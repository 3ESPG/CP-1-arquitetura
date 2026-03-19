package br.com.fiap.winery;

import jakarta.xml.ws.Endpoint;

public class Loader {

    public static void main(String[] args) {
        WineStockServiceImplementation wineStock = new WineStockServiceImplementation();
        WineWarningServiceImplementation wineWarning = new WineWarningServiceImplementation();

        Endpoint.publish("http://localhost:8085/WineStockService", wineStock);
        System.out.println("Servico WineStockService publicado em http://localhost:8085/WineStockService?wsdl");

        Endpoint.publish("http://localhost:8086/WineWarningService", wineWarning);
        System.out.println("Servico WineWarningService publicado em http://localhost:8086/WineWarningService?wsdl");

        System.out.println("Servicos no ar. Pressione Ctrl + C para encerrar.");

        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            System.out.println("Servidor encerrado.");
        }
    }
}