// Importa a classe HttpServer do pacote com.sun.net.httpserver,
// que é usada para criar e configurar um servidor HTTP simples.
import com.sun.net.httpserver.HttpServer;

// Importa a interface HttpHandler do pacote com.sun.net.httpserver,
// que é usada para criar manipuladores de solicitação HTTP personalizados.
import com.sun.net.httpserver.HttpHandler;

// Importa a classe HttpExchange do pacote com.sun.net.httpserver,
// que representa uma troca de solicitação HTTP e resposta.
import com.sun.net.httpserver.HttpExchange;

// Importa a classe IOException do pacote java.io,
// que lida com exceções relacionadas a entrada/saída de dados.
import java.io.IOException;

// Importa a classe OutputStream do pacote java.io,
// que é usada para escrever dados de saída para o cliente.
import java.io.OutputStream;

// Importa a classe InetSocketAddress do pacote java.net,
// que é usada para especificar o endereço e a porta do servidor.
import java.net.InetSocketAddress;

// Importa a classe Date do pacote java.util,
// que é usada para obter a data e a hora atuais.
import java.util.Date;

// Importa a classe SimpleDateFormat do pacote java.text,
// que é usada para formatar datas e horas.
import java.text.SimpleDateFormat;

public class ServidorWebSimples {
    public static void main(String[] args) throws IOException {
        // Cria um servidor HTTP na porta 8080 com um backlog de 0 (nenhuma fila de espera).
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        // Define um contexto para a raiz ("/") do servidor e associa a ele um manipulador personalizado (MyHandler).
        server.createContext("/", new MyHandler());

        // Inicia o servidor HTTP.
        server.start();

        // Exibe uma mensagem no console para indicar que o servidor está em execução.
        System.out.println("Servidor rodando na porta 8080...");
    }

    // Classe interna que implementa a interface HttpHandler para lidar com as solicitações HTTP.
    static class MyHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            // Verifica se a solicitação é para o ícone de favicon.
            // Se for, retorna sem fazer nada.
            if (exchange.getRequestURI().toString().equals("/favicon.ico")) {
                return;
            }

            // Mensagem de saudação exibida no site.
            String greetingMessage = "Bem-vindo ao nosso Servidor Web simples em Java! " +
                    "\n Desenvolvido por: Henrique Cerqueira e Iuri Bacelar";

            // Identificação do acesso: obtém o endereço remoto do cliente.
            String remoteAddress = exchange.getRemoteAddress().toString();

            // Obtém a data e hora atual e formata no formato "dd-MM-yyyy HH:mm:ss".
            String currentTime = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());

            // Log no terminal: exibe as informações do acesso no console.
            System.out.println("Acesso feito por: " + remoteAddress + " e registrado no momento: " + currentTime);

            // Configura a resposta HTTP com a mensagem de saudação e status 200 (OK).
            exchange.sendResponseHeaders(200, greetingMessage.length());

            // Obtém o stream de saída e escreve a mensagem de saudação para o cliente.
            OutputStream os = exchange.getResponseBody();
            os.write(greetingMessage.getBytes());
            os.close();
        }
    }
}
