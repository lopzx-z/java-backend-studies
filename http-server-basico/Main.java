// Importa a classe do servidor HTTP nativo do Java para criar o servidor
import com.sun.net.httpserver.HttpServer;

// Importa a classe para definir o endereço IP e a porta onde o servidor vai rodar
import java.net.InetSocketAddress;

// Importa a exceção que representa erros de entrada/saída
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // Cria o servidor na porta 8080
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        // Cria o contexto para a raiz "/" usando expressão lambda
        server.createContext("/", exchange -> {

            String resposta = "Teste";

            // Define o status HTTP como 200 (Sucesso) e o tamanho exato da resposta em bytes
            exchange.sendResponseHeaders(200, resposta.getBytes().length);

            // Converte a resposta em bytes e envia esses dados para o cliente
            exchange.getResponseBody().write(resposta.getBytes());

            // Encerra a troca HTTP, finalizando a requisição e a resposta
            exchange.close();
        });

        // Inicia o servidor HTTP, colocando-o no ar para começar a receber requisições
        server.start();
    }
}