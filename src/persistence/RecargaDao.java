package persistence;


import java.util.ArrayList;
import java.util.List;

import model.Recarga;

public class RecargaDao extends Dao {



	
	public List<Recarga> listar() throws Exception {
		open();
		List<Recarga> lista = new ArrayList<Recarga>();
		stmt = con.prepareStatement("select * from recarga");

		rs = stmt.executeQuery();
		while (rs.next()) {

			Recarga r = new Recarga(rs.getInt("idrecarga"), rs.getInt("codcartao"), rs.getDate("datarecarga"),
					rs.getString("status"));
			
			lista.add(r);
		}
		close();
		return lista;

	}
	
	public List<Recarga> listarBaseadoNoStatus(String escolha) throws Exception {
		open();
		List<Recarga> lista = new ArrayList<Recarga>();
		stmt = con.prepareStatement("select * from recarga where status = ?");
		stmt.setString(1, escolha);

		rs = stmt.executeQuery();
		while (rs.next()) {

			Recarga r = new Recarga(rs.getInt("idrecarga"), rs.getInt("codcartao"), rs.getDate("datarecarga"),
					rs.getString("status"));
			
			lista.add(r);
		}
		close();
		return lista;

	}

}
