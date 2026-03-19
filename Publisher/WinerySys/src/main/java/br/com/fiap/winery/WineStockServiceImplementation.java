package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService {

    @Override
    public String getMenu() {
        return """
                ===== CARTA DE VINHOS WINERY =====
                
                Uvas Tintas:
                - Cabernet Sauvignon
                - Merlot
                - Pinot Noir
                - Syrah
                
                Uvas Brancas:
                - Chardonnay
                - Sauvignon Blanc
                - Riesling
                - Pinot Grigio
                
                Uvas Rosés:
                - Rosé de Provence
                - White Zinfandel
                
                Espumantes:
                - Brut
                - Prosecco
                - Moscatel
                """;
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido confirmado! Vinho: " + name + " | Quantidade: " + quantity + " garrafa(s). Obrigado por comprar na Winery.";
    }
}