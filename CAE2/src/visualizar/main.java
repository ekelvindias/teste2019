package visualizar;

import java.sql.SQLException;
import java.util.Calendar;

import Cae.beta.ClienteSocio;
import banco.CSEmpresaCRUD;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClienteSocio jose = new ClienteSocio();
		Calendar hoje = Calendar.getInstance();
		
		
		
		jose.setDataCriação(hoje);
		jose.setIdCS((long) 10000);
		jose.setLocEmpresa("Esperanca");
		jose.setNomeEmpresa("IFPB");
		jose.setFuncionariosCSocios(null);
		
		CSEmpresaCRUD sql = new CSEmpresaCRUD();
		
		try {
			sql.criarTabela();
			sql.inserirTabelaGCS(jose);
			
			sql.inserirDados("NAME_EMPRESA", "ALmeida");
			
			sql.removerEmpresa(jose);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
