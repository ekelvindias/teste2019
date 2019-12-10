package banco;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import Cae.beta.ClienteSocio;
import oracle.net.jdbc.TNSAddress.SOException;


public class CSEmpresaCRUD {

	
	public ClienteSocio c1 = new ClienteSocio();
	
	Connection connection;

	public Connection getConnection()  {
		try {
			Connection con = (Connection) DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Aluno\\git\\CAE\\CAE\\src\\banco\\Projeto.db");
			System.out.println("Conectou");
			return con;
		}
		catch(Exception e) {
			throw new RuntimeException(e);

		}

	}

	public void criarTabela() throws SQLException {
		String sql = "create table IF NOT EXISTS GCS " + 
				"ID_CS NUMBER(4) NOT NULL,\r\n" + 
				"NAME_EMPRESA VARCHAR2(10) NOT NULL,\r\n" + 
				"LOC_CS VARCHAR2(20) NOT NULL,\r\n" + 
				"DATA_CRIAÇÃO DATE NOT NULL,\r\n" + 
				"GERENTE VARCHAR2 (40),\r\n" + 
				"PRIMARY KEY (ID_CS));\r\n"; 
				
		PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
		stmt.execute();
		stmt.close();
		System.out.println("A tabela GCS foi criada.");
	}

	

	public void inserirTabelaGCS(ClienteSocio c1) throws SQLException {
		String sql = "insert into GCS " +
				"(id_cs, NAME_EMPRESA, LOC_CS, DATA_CRIAÇÃO, GERENTE, FUNCI_CS)"
				+ "values (?,?,?,?,?)";
		//		+ "values ("+ contato.getNome() + "," + contato.getEmail() + "," + contato.getEndereco()+ "," + contato.getData()+");";


		PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
		stmt.setLong(1, c1.getIdCS());
		stmt.setString(2, c1.getNomeEmpresa());
		stmt.setString(3, c1.getLocEmpresa());
		stmt.setDate(4, (Date) c1.getDataCriação().getTime());
		stmt.setString(5, c1.getGerente());
	
		stmt.execute();
		stmt.close();
		System.out.println("Empresa adicionada");
	}

	public void removerEmpresa(ClienteSocio c1) {

		try(PreparedStatement stmt = (PreparedStatement) connection.prepareStatement("delete from GCS where id=?")) {			
			stmt.setLong(1, c1.getIdCS());
			stmt.execute();
			stmt.close();
			System.out.println("A empresa " + c1.getNomeEmpresa() + " foi removido.");
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("A empresa não foi encontrada");
		}

	}

	public void inserirDados(String coluna, String dado) throws SQLException {
		
		String sql = "insert into GCS"
				+ "(" + coluna + ")" 
				+ "values (?)";

		
		PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql);
		stmt.setString(1, dado);
		stmt.execute();
		stmt.close();
	}
		
				



			




			
	
	
}
