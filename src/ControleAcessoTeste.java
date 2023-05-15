public class ControleAcessoTeste {
    public static void main(String[] args) {
        ControleAcesso controleAcesso = new ControleAcesso();
        controleAcesso.registrarCodigoDigital("1");
        controleAcesso.registrarCodigoDigital("10");
        controleAcesso.registrarCodigoDigital("1");
        controleAcesso.listarEventos();
    }
}
