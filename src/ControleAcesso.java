import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

class ControleAcesso {
    public ArrayList<String> codigos = new ArrayList();
    public ArrayList<String> eventos = new ArrayList<>();
    public void registrarCodigoDigital(String codigo) {
        if (codigos.contains(codigo)) {
            System.out.println("Obrigado pela visita");
            registrarEvento(codigo, "saida");
            codigos.remove(codigo);
        } else {
            codigos.add(codigo);
            System.out.println("Bem-vindo, acesso liberado");
            registrarEvento(codigo, "entrada");
        }
    }

    public void registrarEvento(String codigo, String tipoEvento) {
        String mensagem = tipoEvento.equals("entrada") ? "codigo "+codigo + " Entrada registrada as " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " as " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")) :"codigo "+codigo + " Saída registrada as " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " as " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        eventos.add(mensagem);
    }
    public void listarEventos(){
        for (int i = 0; i < eventos.size(); i++){
            System.out.println(eventos.get(i));
        }
    }
}


